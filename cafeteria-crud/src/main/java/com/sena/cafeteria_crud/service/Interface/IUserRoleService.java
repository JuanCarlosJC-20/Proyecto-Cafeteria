package com.sena.cafeteria_crud.service.Interface;

import java.util.List;
import com.sena.cafeteria_crud.dto.Request.userRolDto;
import com.sena.cafeteria_crud.dto.Response.userRolResponseDto;

public interface IUserRoleService {
    List<userRolResponseDto> getAllUserRoles();
    boolean guardarUserRole(userRolDto userRolDto);
    boolean eliminarUserRole(Long id);
    boolean actualizarUserRole(Long id, userRolDto userRolDto);
}
