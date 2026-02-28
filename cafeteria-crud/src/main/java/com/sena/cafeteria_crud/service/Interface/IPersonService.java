package com.sena.cafeteria_crud.service.Interface;

import java.util.List;
import com.sena.cafeteria_crud.dto.Request.personDto;
import com.sena.cafeteria_crud.dto.Response.personResponseDto;

public interface IPersonService {
    
    List<personResponseDto> getAllPersons();
    boolean savaPerson(personDto personDto);
    boolean deletepuerca(Long id);
    boolean updatperson(Long id, personDto personDto);
}
