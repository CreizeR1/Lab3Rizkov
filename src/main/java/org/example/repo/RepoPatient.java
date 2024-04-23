package org.example.repo;

import org.example.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface RepoPatient extends CrudRepository<Patient, Integer>  {

}
