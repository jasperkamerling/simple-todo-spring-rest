package com.example.demo.persistence;

import com.example.demo.domain.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;



@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository extends CrudRepository<Todo, UUID> {
}
