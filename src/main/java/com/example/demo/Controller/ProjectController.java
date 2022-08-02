package com.example.demo.Controller;

import com.example.demo.Models.Employee;
import com.example.demo.Models.Project;
import com.example.demo.Services.EmployeService;
import com.example.demo.Services.Projectservice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class ProjectController {
    private Projectservice projectservice;

    @CrossOrigin("*")
    @GetMapping("/project") // list of employees
    public List<Project> projects(){
        return projectservice.getProjects();

    }
    @GetMapping("/project/{id}")//get employe
    public Optional<Project> getProjects(@PathVariable(name = "id") Long id)  {
        return projectservice.findById(id);
    }



    @PutMapping("/project/edit")//path param norm rest update employe
    public void UpdateProject(@RequestBody Project e)  {

            projectservice.save(e);


    }


    @PostMapping("/project")//@RequestBody on recupaire de core de la reques json with post button
    public void savePorject(@RequestBody Project e){
        projectservice.save(e);


    }


    @DeleteMapping("/project/{id}/delete")
    public void deleteProject(@PathVariable("id") Long id){
        projectservice.delete(id);
    }

}
