/*
 * generated by Xtext 2.10.0
 */
package org.refactor.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.resource.containers.IAllContainersState
import com.google.inject.Provider

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class ModelEditorUiModule extends AbstractModelEditorUiModule {
	
	override Provider<IAllContainersState> provideIAllContainersState() {
    	return org.eclipse.xtext.ui.shared.Access.getJavaProjectsState()
	}
	
}
