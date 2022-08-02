package com.example.demo.Models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;
import javax.persistence.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tache;
    private String nom;
    private String status;
    private String description;
    private int dure;

    @OneToOne
    private Employee id_employee;

    @ManyToOne
    private Project t;


}
