package com.sena.cafeteria_crud.service.Interface;

import java.util.List;
import com.sena.cafeteria_crud.dto.Request.userDto;
import com.sena.cafeteria_crud.dto.Response.userResponseDto;

public interface IUserService {
    List<userResponseDto> getAllUsers();
    boolean crearUser(userDto userDto);
    boolean eliminarUser(long id);
    boolean actualizarUser(long id, userDto userDto);
}
