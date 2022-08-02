package com.example.demo.Reposotory;

import com.example.demo.Models.Employee;
import com.example.demo.Models.Event;
import com.example.demo.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepo extends JpaRepository<Event,Long> {
    List<Event> findByNomContains(String keyword);
    @Query("select c from Event c where c.nom like:kw")

    List<Event> chercheEvent(@Param("kw") String keyword);
}
