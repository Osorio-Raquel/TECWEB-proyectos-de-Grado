package com.rack.apirest.Person;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @jakarta.persistence.Id
    @GeneratedValue
    private Integer Id;
    @Basic
    private String firstName;
    private String lastName;
    private String email;
}
