package com.mning.rest.repository;

/**
 * Created by mning on 8/14/2015.
 */
import java.util.List;

import com.mning.rest.domain.Family;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "family", path = "family")
public interface FamilyRepository extends PagingAndSortingRepository<Family, Long> {
    List<Family> findAll();
}
