/*************************************************************************************
 *
 * Generated on Thu Jun 27 09:45:21 CEST 2013 by Spray CustomFeature.xtend
 * 
 * This file is an extension point: copy to "src" folder to manually add code to this
 * extension point.
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.er.diagram.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class EntityRelationshipDiagramCustomShowInformationFeature extends EntityRelationshipDiagramCustomShowInformationFeatureBase {
    public EntityRelationshipDiagramCustomShowInformationFeature(final IFeatureProvider fp) {
        super(fp);
    }

    /**
     * {@inheritDoc}
     */
    @Override
	public void execute(final ICustomContext context, final EObject object) {
		MessageDialog.openInformation(Display.getDefault().getActiveShell(),
				"Information", "Selected object is of type "
						+ object.eClass().getName());
	}

}
