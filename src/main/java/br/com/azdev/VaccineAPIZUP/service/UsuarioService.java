package br.com.azdev.VaccineAPIZUP.service;

import br.com.azdev.VaccineAPIZUP.dto.UsuarioDto;
import br.com.azdev.VaccineAPIZUP.entity.Usuario;
import br.com.azdev.VaccineAPIZUP.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    public UsuarioDto create(Usuario usuario) {
        return new UsuarioDto(usuarioRepository.save(usuario));
    }
}
