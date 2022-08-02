package com.example.demo.Controller;

import com.example.demo.Models.Event;
import com.example.demo.Models.Tache;
import com.example.demo.Services.EventServices;
import com.example.demo.Services.TacheServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")

public class TacheController {
    private TacheServices tacheServices;

    @GetMapping("/Taches") // list of employees
    public List<Tache> taches(){
        return tacheServices.getTaches();

    }
    @GetMapping("/Taches/{id}")//get employe
    public Optional<Tache> getTache(@PathVariable(name = "id") Long id)  {
        return tacheServices.findById(id);
    }

    @PutMapping("/Taches/edit")//path param norm rest update employe
    public void UpdateTcahe(@RequestBody Tache e)  {

        tacheServices.save(e);
    }

    @PostMapping("/Taches")//@RequestBody on recupaire de core de la reques json with post button
    public void saveTache(@RequestBody Tache e){
        tacheServices.save(e);


    }


    @DeleteMapping("/Taches/{id}/delete")
    public void deleteTache(@PathVariable("id") Long id){
        tacheServices.delete(id);
    }
}
