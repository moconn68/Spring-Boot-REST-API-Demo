package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;
// Implemented for interfacing with JPA and Derby embedded database
// interface for Spring Data JPA - abstracts typical CRUD methods

public interface TopicRepository extends CrudRepository<Topic, String>{
	// extending the CrudRepository gives us CRUD operations
	// Don't have to implement data layer on our own
	
 
}
