package com.preetispringbootapp.springbootapp.Repository;

import com.preetispringbootapp.springbootapp.domain.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long > {
}
