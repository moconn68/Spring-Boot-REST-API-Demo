package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
// Implemented for interfacing with JPA and Derby embedded database
// interface for Spring Data JPA - abstracts typical CRUD methods

public interface CourseRepository extends CrudRepository<Course, String>{
	// extending the CrudRepository gives us CRUD operations
	// Don't have to implement data layer on our own
	
	// if you start method with established keyword (ex "find") it will automatically be generated for you
	// for example, this method automatically works and finds by parameter String name
	// always write method in camel-case!
	 public List<Course> findByName(String name);
	 public List<Course> findByDescription(String description);
	 // necessary to say find...Id here because we must use string param not 'Topic' object
	 public List<Course> findByTopicId(String topicId);
	 
 
}
