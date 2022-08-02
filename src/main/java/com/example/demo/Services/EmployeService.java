package com.example.demo.Services;

import com.example.demo.Models.Employee;
import com.example.demo.Reposotory.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepo employeRepo;

    //Return list of clients
    public List<Employee> getEmployees(){

        return employeRepo.findAll();
    }

    //SAve new client
    public Employee save(Employee employee) {
       return employeRepo.save(employee);

    }

    //get by id
    public Optional<Employee> findById(Long id) {
        return employeRepo.findById(id);
    }

    //delete
    public void delete(Long id) {
        employeRepo.deleteById(id);
    }
}
