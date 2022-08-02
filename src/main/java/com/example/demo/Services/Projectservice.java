package com.example.demo.Services;


import com.example.demo.Models.Project;
import com.example.demo.Reposotory.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Projectservice {

    @Autowired
    private ProjectRepo projectRepo;

    //Return list of projects
    public List<Project> getProjects(){
        return projectRepo.findAll();
    }

    //SAve new projects
    public void save(Project project) {
        projectRepo.save(project);
    }

    //get by projects
    public Optional<Project> findById(Long id) {
        return projectRepo.findById(id);
    }

    //delete
    public void delete(Long id) {
        projectRepo.deleteById(id);
    }

}
