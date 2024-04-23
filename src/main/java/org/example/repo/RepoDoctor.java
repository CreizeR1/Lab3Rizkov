package org.example.repo;

import org.example.entity.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface RepoDoctor extends CrudRepository<Doctor, Integer>  {

}
