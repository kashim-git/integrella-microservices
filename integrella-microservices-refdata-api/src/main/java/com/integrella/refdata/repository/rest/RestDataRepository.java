package com.integrella.refdata.repository.rest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Note that annotation \@RepositoryRestResource to advise that this class is REST enabled
 * 
 * The methods here need to follow the exact naming convention below 
 * as the MongoRepository looks for the class members in the ReferenceData Object 
 * 
 * Note the use of \@Param to define the parameter name passed in the URL 
 * 
 * @author Kashim
 *
 */
@RepositoryRestResource(collectionResourceRel = "referenceData", path = "referenceData")
public interface RestDataRepository extends MongoRepository<ReferenceData, String> {

    public List<ReferenceData> findBySourceSystem(@Param("name") String sourceSystem);
    public List<ReferenceData> findByTargetSystem(@Param("name") String targetSystem);
    public List<ReferenceData> findBySourceValue(@Param("name") String sourceValue);
    public List<ReferenceData> findByTargetValue(@Param("name") String targetValue);

    public List<ReferenceData> findBySourceSystemAndTargetSystemAndSourceValue(
    		@Param("sourceSystem") String sourceSystem, 
    		@Param("targetSystem") String targetSystem, 
    		@Param("sourceValue") String value);
}

