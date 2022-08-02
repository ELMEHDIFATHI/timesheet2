package com.example.demo.Services;

import com.example.demo.Models.Event;

import com.example.demo.Reposotory.EventRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServices {
    @Autowired
    private EventRepo eventRepo;

    //Return list of projects
    public List<Event> getevents(){

        return eventRepo.findAll();
    }

    //SAve new projects
    public void save(Event event) {
        eventRepo.save(event);
    }

    //get by projects
    public Optional<Event> findById(Long id) {
        return eventRepo.findById(id);
    }

    //delete
    public void delete(Long id) {
        eventRepo.deleteById(id);
    }
}
