package com.kelvin.savesort.controller;

import com.kelvin.savesort.model.Person;
import com.kelvin.savesort.model.PersonDTO;
import com.kelvin.savesort.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller()
@RequestMapping("/save-sort")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PostMapping("/save-person")
    public @ResponseBody Person savePerson(@RequestBody PersonDTO personDTO){
        return repository.save(new Person(personDTO.getName(), personDTO.getSortedPersonName()));
    }
}
