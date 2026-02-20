package com.sena.cafeteria_crud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.cafeteria_crud.dto.Request.personDto;
import com.sena.cafeteria_crud.model.Person;
import com.sena.cafeteria_crud.repository.IPersonRepository;

@Service
public class PersonService {

    @Autowired
    private IPersonRepository IpersonRepository;

    // Método para obtener todas las personas

    public List<personDto> getAllPersons() {
        // Lógica para obtener todas las personas
        return IpersonRepository.findAll().stream()
                .map(person -> new personDto(
                        person.getFirstName(),
                        person.getLastName(),
                        person.getEmail(),
                        person.getPhone()))
                .toList();
    }


    // Método para guardar una persona

    public boolean savaPerson(personDto personDto) {
        // Lógica para guardar una persona
        var person = new Person();
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        person.setEmail(personDto.getEmail());
        person.setPhone(personDto.getPhone());
        IpersonRepository.save(person);
        return true;
    }

    public boolean deletepito(Long id){
        IpersonRepository.deleteById(id);
        return true;
    }


       
}
