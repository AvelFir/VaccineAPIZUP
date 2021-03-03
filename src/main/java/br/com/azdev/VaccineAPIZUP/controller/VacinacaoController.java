package br.com.azdev.VaccineAPIZUP.controller;
import br.com.azdev.VaccineAPIZUP.dto.VacinacaoDTO;
import br.com.azdev.VaccineAPIZUP.entity.Usuario;
import br.com.azdev.VaccineAPIZUP.service.UsuarioService;
import br.com.azdev.VaccineAPIZUP.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/vacinacao")
public class VacinacaoController {

    @Autowired
    VacinacaoService vacinacaoService;

    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public VacinacaoDTO create(@Valid @RequestBody VacinacaoDTO vacinacaoDTO){
        Usuario usuario = usuarioService.findByEmail(vacinacaoDTO.getUsuarioEmail());
        System.out.println(vacinacaoDTO.getUsuarioEmail() + vacinacaoDTO.getNomeVacina() + vacinacaoDTO.getDataAplicacao());
        return new VacinacaoDTO(vacinacaoService.create(VacinacaoDTO.converter(vacinacaoDTO, usuario)));
    }
}
