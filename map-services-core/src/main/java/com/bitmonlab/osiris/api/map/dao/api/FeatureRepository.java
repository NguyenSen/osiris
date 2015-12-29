package com.bitmonlab.osiris.api.map.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bitmonlab.commons.api.map.model.geojson.Feature;

public interface FeatureRepository extends MongoRepository<Feature, String> , FeatureRepositoryCustom {
	
}