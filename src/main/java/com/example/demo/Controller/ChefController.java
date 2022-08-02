package com.example.demo.Controller;

import com.example.demo.Models.Chef;
import com.example.demo.Models.Employee;
import com.example.demo.Services.ChefService;
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
public class ChefController {
    private ChefService chefService;

    @GetMapping("/chefs") // list of chef
    public List<Chef> chefs(){
        return chefService.getChef();

    }
    @GetMapping("/chefs/{id}")//get chef
    public Optional<Chef> getchefs(@PathVariable(name = "id") Long id)  {
        return chefService.findById(id);
    }

    @PutMapping("/chefs/edit")//path param norm rest update employe
    public void Updatechefs(@RequestBody Chef e)  {

        chefService.save(e);
    }

    @PostMapping("/chefs")//@RequestBody on recupaire de core de la reques json with post button
    public void savechefs(@RequestBody Chef e){
       chefService.save(e);


    }


    @DeleteMapping("/chefs/{id}/delete")
    public void deletechef(@PathVariable("id") Long id){
        chefService.delete(id);
    }


}
