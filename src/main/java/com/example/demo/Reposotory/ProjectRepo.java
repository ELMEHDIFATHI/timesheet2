package com.example.demo.Reposotory;


import com.example.demo.Models.Project;
import com.example.demo.Models.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project,Long> {
    List<Project> findByStatusContains(String keyword);
    @Query("select c from Project c where c.status like:kw")

    List<Project> chercherProject(@Param("kw") String keyword);
}
