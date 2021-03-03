package br.com.azdev.VaccineAPIZUP.controller;

import br.com.azdev.VaccineAPIZUP.dto.UsuarioDto;
import br.com.azdev.VaccineAPIZUP.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto create(@Valid @RequestBody UsuarioDto usuario){
        return new UsuarioDto(usuarioService.create(UsuarioDto.converter(usuario)));
    }
}
