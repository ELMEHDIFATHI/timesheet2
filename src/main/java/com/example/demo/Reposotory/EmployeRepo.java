package com.example.demo.Reposotory;

import com.example.demo.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeRepo extends JpaRepository<Employee,Long> {

    //List<Employee> findByEmail(String keyword);
  //  @Query("select c from Employee c where c.FirstName like:kw")

    //List<Employee> chercheEmploye(@Param("kw") String keyword);
}
