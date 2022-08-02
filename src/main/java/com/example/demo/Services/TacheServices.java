package com.example.demo.Services;

import com.example.demo.Models.Project;
import com.example.demo.Models.Tache;
import com.example.demo.Reposotory.TacheRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TacheServices {
    @Autowired
    private TacheRepo tacheRepo;

    //Return list of projects
    public List<Tache> getTaches(){
        return tacheRepo.findAll();
    }

    //SAve new projects
    public void save(Tache tache) {
        tacheRepo.save(tache);
    }

    //get by projects
    public Optional<Tache> findById(Long id) {
        return tacheRepo.findById(id);
    }

    //delete
    public void delete(Long id) {
        tacheRepo.deleteById(id);
    }

}
