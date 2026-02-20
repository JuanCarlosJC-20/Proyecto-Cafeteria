package com.sena.cafeteria_crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.cafeteria_crud.dto.Request.personDto;
import com.sena.cafeteria_crud.service.Impl.PersonService;



@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping 
    public String  registerPerson(@Validated @RequestBody personDto personDto)
     {
        personService.savaPerson(personDto);
        return "Persona registrada exitosamente";
    }

    @GetMapping
    public ResponseEntity<Object> getPersonAll()
    {
        var obtiene = personService.getAllPersons();
        return new ResponseEntity<>(obtiene, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public boolean deletePerson(@PathVariable Long id){
        personService.deletepito(id);
        return true;
    }

   
    
}
