package com.fernandok.hmssrvusuario.services.serviceImpl;

import com.fernandok.hmssrvusuario.DTO.UsuarioDTO;
import com.fernandok.hmssrvusuario.model.Usuario;
import com.fernandok.hmssrvusuario.repositories.UsuarioRepository;
import com.fernandok.hmssrvusuario.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioServices {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Usuario fromDTO(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setSobrenome(usuarioDTO.getSobrenome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setTelefone(usuarioDTO.getTelefone());
        usuario.setLogin(usuarioDTO.getLogin());
        usuario.setPassword(bCryptPasswordEncoder.encode(usuarioDTO.getPassword()));

        return usuario;
    }

}
