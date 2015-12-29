package com.bitmonlab.osiris.api.map.managers.api;

import com.bitmonlab.osiris.api.map.exceptions.FeatureNotExistException;
import com.bitmonlab.osiris.api.map.exceptions.MongoGeospatialException;
import com.bitmonlab.commons.api.map.model.geojson.Feature;

public interface FeatureManager {
	
	Feature storeFeature(String appId, Feature feature) throws MongoGeospatialException;
	
	void deleteFeature(String appIdentifier, String idFeature) throws FeatureNotExistException;
	
	Feature updateFeature(String appIdentifier, String idFeature, Feature feature) throws FeatureNotExistException, MongoGeospatialException;
	
	Feature getFeatureByID(String appIdentifier, String idFeature) throws FeatureNotExistException;

}
