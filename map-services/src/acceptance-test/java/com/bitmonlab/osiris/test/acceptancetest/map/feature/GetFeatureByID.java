package com.bitmonlab.osiris.test.acceptancetest.map.feature;
import javax.inject.Inject;
import javax.inject.Named;

import com.bitmonlab.commons.api.map.model.geojson.Feature;
import com.bitmonlab.core.assembler.Assembler;
import com.bitmonlab.osiris.api.map.managers.api.FeatureManager;
import com.bitmonlab.osiris.api.map.transferobject.FeatureDTO;

import cucumber.api.java.en.When;
public class GetFeatureByID {
	
	@Inject
	private PreconditionStoreFeature preconditionStoreFeature;
	
	@Inject
	private FeatureManager featureManager;
	
	@Inject 
	@Named("FeatureAssembler")
	private Assembler<FeatureDTO, Feature> featureAssembler;


	private FeatureDTO response;
	
	
	@When("^I invoke a GET to getFeatureByID with idFeature$")
	public void I_invoke_a_GET_to_getFeatureByID_with_idFeature() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		FeatureDTO responsePrecondition =  preconditionStoreFeature.getResponse();
		
		Feature feature = featureManager.getFeatureByID("1",responsePrecondition.getId());
		FeatureDTO featureDTO=featureAssembler.createDataTransferObject(feature);
							    
	}

	@When("^I invoke a GET to getFeatureByID with idFeature \"([^\"]*)\"$")
	public void I_invoke_a_GET_to_getFeatureByID_with_idFeature(String idFeature) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		try {
			Feature feature = featureManager.getFeatureByID("1",idFeature);
			FeatureDTO featureDTO=featureAssembler.createDataTransferObject(feature);
		}catch (Exception e){			
			DeleteFeature.exceptionCapture = e;
		}	
		
	}


}
