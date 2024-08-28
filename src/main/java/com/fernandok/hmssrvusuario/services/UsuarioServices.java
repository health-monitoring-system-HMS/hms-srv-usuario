package com.fernandok.hmssrvusuario.services;

import com.fernandok.hmssrvusuario.DTO.UsuarioDTO;
import com.fernandok.hmssrvusuario.model.Usuario;

public interface UsuarioServices {

    Usuario fromDTO(UsuarioDTO usuarioDTO);

}
