package com.subrsa.spring.repo;

import com.subrsa.spring.model.People;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface DbRepository extends CrudRepository<People, Long> {

    List<People> findAll();
    List<People> findByNameContains(@Param("name") String name);

}
