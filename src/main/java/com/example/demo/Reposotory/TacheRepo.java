package com.example.demo.Reposotory;

import com.example.demo.Models.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TacheRepo extends JpaRepository<Tache,Long> {

    List<Tache> findByStatusContains(String keyword);
    @Query("select c from Tache c where c.status like:kw")

    List<Tache> chercherTcahe(@Param("kw") String keyword);
}
