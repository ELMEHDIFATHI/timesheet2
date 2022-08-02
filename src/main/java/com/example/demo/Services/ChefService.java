package com.example.demo.Services;

import com.example.demo.Models.Chef;
import com.example.demo.Models.Employee;
import com.example.demo.Reposotory.ChefRepo;
import com.example.demo.Reposotory.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChefService {

    @Autowired
    private ChefRepo chefRepo;

    //Return list of clients
    public List<Chef> getChef(){
        return chefRepo.findAll();
    }

    //SAve new client
    public Chef save(Chef chef) {
       return chefRepo.save(chef);

    }

    //get by id
    public Optional<Chef> findById(Long id) {
        return chefRepo.findById(id);
    }

    //delete
    public void delete(Long id) {
        chefRepo.deleteById(id);
    }
}
