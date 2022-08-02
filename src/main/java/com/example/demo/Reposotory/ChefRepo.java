package com.example.demo.Reposotory;

import com.example.demo.Models.Chef;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChefRepo extends JpaRepository<Chef,Long> {

    //List<Employee> findByEmail(String keyword);
  //  @Query("select c from Employee c where c.FirstName like:kw")

    //List<Employee> chercheEmploye(@Param("kw") String keyword);
}
