package com.ford.ierp.cims.repository;

import com.ford.ierp.cims.model.IERPMessage;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CIMSRepository  extends ReactiveMongoRepository<IERPMessage,String>{
	
	

}
