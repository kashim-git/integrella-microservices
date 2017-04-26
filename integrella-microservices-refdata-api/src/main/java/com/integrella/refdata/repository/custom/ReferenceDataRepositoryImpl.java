package com.integrella.refdata.repository.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.Param;

import com.integrella.refdata.repository.rest.ReferenceData;


public class ReferenceDataRepositoryImpl 
//implements ReferenceDataRepositoryCustom 
{
	
	@Autowired
	MongoTemplate mongoTemplate;

	/*
	@Override
	public String retrieveReferenceData(@Param("sourceSystem") String sourceSystem, @Param("targetSystem") String targetSystem, @Param("sourceValue") String value) {
		
		CriteriaDefinition cd = Criteria.where("sourceSystem").is(sourceSystem).and("targetSystem").is(targetSystem).and("sourceValue").is(value);
		Query query = new Query(cd);
		ReferenceData referenceDataResult = mongoTemplate.findOne(query, ReferenceData.class);
		
		if (referenceDataResult != null){
			return referenceDataResult.getTargetValue();
		}
		
		return "";
	}
	*/

}
