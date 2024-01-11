package com.animal.Animals.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Animal {
    @Id
    private  String id;
    private String breed;
    private String earTag;
    private  String name;
    private int age;
    private double weight;
}
