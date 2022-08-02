package com.example.demo.Controller;


import com.example.demo.Models.Event;
import com.example.demo.Services.EventServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin("*")
public class EventController {

    private EventServices eventServices;

    @GetMapping("/Events") // list of employees
    public List<Event> events(){
        return eventServices.getevents();

    }
    @GetMapping("/Events/{id}")//get employe
    public Optional<Event> getEvents(@PathVariable(name = "id") Long id)  {
        return eventServices.findById(id);
    }

    @PutMapping("/Events/edit")//path param norm rest update employe
    public void UpdateEvent(@RequestBody Event e)  {

        eventServices.save(e);
    }

    @PostMapping("/Events")//@RequestBody on recupaire de core de la reques json with post button
    public void saveEvent(@RequestBody Event e){
        eventServices.save(e);


    }


    @DeleteMapping("/Events/{id}/delete")
    public void deleteEvent(@PathVariable("id") Long id){
        eventServices.delete(id);
    }

}
