package com.example.demo.Controller;

import com.example.demo.Models.Employee;
import com.example.demo.Services.EmployeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class EmployeeController {
    private EmployeService employeService;

    @GetMapping("/employees") // list of employees
    public List<Employee> employees(){
        return employeService.getEmployees();

    }
    @GetMapping("/employees/{id}")//get employe
    public Optional<Employee> getEmployes(@PathVariable(name = "id") Long id)  {
        return employeService.findById(id);
    }

    @PutMapping("/employees/edit")//path param norm rest update employe
    public void UpdateEmployee(@RequestBody Employee e)  {

        employeService.save(e);
    }

    @PostMapping("/employees")//@RequestBody on recupaire de core de la reques json with post button
    public void saveEmploye(@RequestBody Employee employee){
       employeService.save(employee);


    }


    @DeleteMapping("/employees/{id}/delete")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeService.delete(id);
    }


}
