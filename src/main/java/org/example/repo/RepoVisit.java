package org.example.repo;

import org.example.entity.Visit;
import org.springframework.data.repository.CrudRepository;

public interface RepoVisit extends CrudRepository<Visit, Integer>  {

}
