package com.sachinkumar.hireme.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;

    private String description;

    private List<String> skills;

    private String location;
}
