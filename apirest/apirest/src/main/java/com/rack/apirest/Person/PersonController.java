package com.rack.apirest.Person;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    @PostMapping
    public void createPersona(@RequestBody Person person){
        personService.createPersona(person);
    }

    @GetMapping("/{id}") 
    public Person getPersonaById(@PathVariable Integer id) {
        return personService.getPersonaById(id);
    }

}
