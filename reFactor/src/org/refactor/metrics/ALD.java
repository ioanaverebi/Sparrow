package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;
import org.refactor.filters.IsAccessor;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Call;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class ALD extends AbstractMetric{

	public ALD() {
		super("Access to Local Data");
	}

	@Override
	public double compute(EObject element) {
		int ald = 0;
		if (element instanceof Method){
			IsAccessor accessor = new IsAccessor();
			Method method = (Method)element;
			for (Access access : method.getAccesses()) {
				Field field = access.getField();
				if (!field.getModifier().equals("constant") && field.eContainer().equals(method.eContainer()))
					ald++;
			}
			for (Call call : method.getCalls()) {
				Method calledMethod = call.getMethod();
				if (accessor.compute(calledMethod) && calledMethod.eContainer().equals(method.eContainer()))
					ald++;
			}
		}
		else if (element instanceof Class){
			Class type = (Class)element;
			ATFD methodALD = new ATFD();
			for (Method method : type.getMethods()) {
				ald += methodALD.compute(method);
			}
		}
		return ald;
	}
}
