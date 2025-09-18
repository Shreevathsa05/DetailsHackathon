package com.shree.details.repo;

import com.shree.details.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "details", path = "details")
public interface DetailsRepo extends JpaRepository<Details, Integer> {
}
