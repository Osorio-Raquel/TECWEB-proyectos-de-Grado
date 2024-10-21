package com.rack.apirest.Person;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPersona(Person person){
        personRepo.save(person);
    }

    public Person getPersonaById(Integer id) {
        return personRepo.findById(id).orElse(null);
    }    

}
