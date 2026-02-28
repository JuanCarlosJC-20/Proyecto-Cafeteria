package com.sena.cafeteria_crud.service.Interface;

import java.util.List;
import com.sena.cafeteria_crud.dto.Response.rolResponseDto;

public interface IRolService {
    
    List<rolResponseDto> getAllRoles();
    boolean eliminarRol(Long id);
    boolean actualizarRol(Long id, rolResponseDto rolResponseDto);
    boolean guardarRol(rolResponseDto rolResponseDto);
}