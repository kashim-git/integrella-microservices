package com.integrella.refdata.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.integrella.refdata.repository.rest.ReferenceData;

/**
 * This interface can be used if you don't wish to expose the API and make calls to Mongo DB internally
 * 
 * @author Kashim
 *
 */
public interface DataRepository extends MongoRepository<ReferenceData, Serializable>{
    public ReferenceData findById(String firstName);
    //public String retrieveExternalValue(String sourceSystem, String targetSystem, String lookupValue);
    
    public List<ReferenceData> findBySourceSystem(String sourceSystem);
    public List<ReferenceData> findByTargetSystem(String targetSystem);
    public List<ReferenceData> findBySourceValue(String sourceValue);
    public List<ReferenceData> findByTargetValue(String targetValue);
    
    public List<ReferenceData> findBySourceSystemAndTargetSystemAndSourceValue(String sourceSystem, String targetSystem, String sourceValue);
    
}
