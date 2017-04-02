package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;
import org.refactor.filters.IsAccessor;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Call;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class ATFD extends AbstractMetric {

	public ATFD() {
		super("Access to Foreing Data");
	}

	@Override
	public double compute(EObject element) {
		int atfd = 0;
		if (element instanceof Method) {
			IsAccessor accessor = new IsAccessor();
			Method method = (Method) element;
			for (Access access : method.getAccesses()) {
				Field field = access.getField();
				if (field != null && (field.getModifier() == null || !field.getModifier().equals("constant")
						&& field.eContainer() != null && !field.eContainer().equals(method.eContainer())))
					atfd++;
			}
			for (Call call : method.getCalls()) {
				Method calledMethod = call.getMethod();
				if (accessor.compute(calledMethod))
					atfd++;
			}
		} else if (element instanceof Class) {
			Class type = (Class) element;
			ATFD methodATFD = new ATFD();
			for (Method method : type.getMethods()) {
				atfd += methodATFD.compute(method);
			}
		}
		return atfd;
	}
}
