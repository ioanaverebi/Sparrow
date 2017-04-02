package org.refactor.filters;

import org.eclipse.emf.ecore.EObject;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Method;

public class IsAccessor extends AbstractFilter{

	public IsAccessor(){
		super("Is Accessor");
	}

	@Override
	public boolean compute(EObject element) {
		if (element instanceof Method){
			Method method = (Method)element;
			if (method.getName().startsWith("get") || method.getName().startsWith("set")){
				if (method.getModifier().equals("public")){
					if (method.getAccesses().size() == 1 && method.getCalls().size() == 0){
						Access access = method.getAccesses().get(0);
						return access.getField().eContainer().equals(method.eContainer());
					}
				}
			}
		}
		return false;
	}
}
