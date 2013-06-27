/*************************************************************************************
 *
 * Generated on Thu Jun 27 09:45:20 CEST 2013 by Spray FeatureProvider.xtend
 * 
 * This file is an extension point: copy to "src" folder to manually add code to this
 * extension point.
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.er.diagram.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.spray.runtime.graphiti.zest.features.ZestLayoutDiagramFeature;

public class EntityRelationshipDiagramFeatureProvider extends EntityRelationshipDiagramFeatureProviderBase {

    public EntityRelationshipDiagramFeatureProvider(final IDiagramTypeProvider dtp) {
        super(dtp);
    }

    @Override
    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
    	if (context.getPictogramElements().length>0 && context.getPictogramElements()[0] instanceof Diagram) {
    		return new ICustomFeature[] { new ZestLayoutDiagramFeature(this) };
    	}
    	return super.getCustomFeatures(context);
    }
}
