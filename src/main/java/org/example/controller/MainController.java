package org.example.controller;


import org.example.entity.Disease;
import org.example.entity.Doctor;

import org.example.entity.Patient;
import org.example.entity.Visit;
import org.example.repo.RepoDisease;
import org.example.repo.RepoDoctor;
import org.example.repo.RepoPatient;
import org.example.repo.RepoVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/")
public class MainController {
    @Autowired
    private RepoDisease disease;
    @Autowired
    private RepoDoctor doctor;
    @Autowired
    private RepoPatient patient;
    @Autowired
    private RepoVisit visit;


    @GetMapping(path="/getPatient")
    public @ResponseBody Iterable<Patient> getAllPatient() {
        return patient.findAll();
    }
    @GetMapping(path="/getDoctor")
    public @ResponseBody Iterable<Doctor> getAllDoctor() {
        return doctor.findAll();
    }
    @GetMapping(path="/getDisease")
    public @ResponseBody Iterable<Disease> getAllDisease() {
        return disease.findAll();
    }
    @GetMapping(path="/getVisit")
    public @ResponseBody Iterable<Visit> getAllVisit() {
        return visit.findAll();
    }


}
