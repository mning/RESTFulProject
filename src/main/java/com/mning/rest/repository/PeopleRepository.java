package com.mning.rest.repository;

/**
 * Created by mning on 8/14/2015.
 */
import java.util.List;

import com.mning.rest.domain.People;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PeopleRepository extends PagingAndSortingRepository<People, Long> {
    List<People> findAll();
    People findById(long id);

}

