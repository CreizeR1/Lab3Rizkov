package org.example.repo;

import org.example.entity.Disease;
import org.springframework.data.repository.CrudRepository;

public interface RepoDisease extends CrudRepository<Disease, Integer>  {

}
