package br.com.azdev.VaccineAPIZUP.controller;
import br.com.azdev.VaccineAPIZUP.dto.VacinacaoDTO;
import br.com.azdev.VaccineAPIZUP.entity.Usuario;
import br.com.azdev.VaccineAPIZUP.service.UsuarioService;
import br.com.azdev.VaccineAPIZUP.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/vacinacao")
public class VacinacaoController {

    @Autowired
    VacinacaoService vacinacaoService;

    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public ResponseEntity<VacinacaoDTO> create(@Valid @RequestBody VacinacaoDTO vacinacaoDTO, UriComponentsBuilder uriBuilder){
        Usuario usuario = usuarioService.findByEmail(vacinacaoDTO.getUsuarioEmail());
        VacinacaoDTO vacinacao = new  VacinacaoDTO(vacinacaoService.create(VacinacaoDTO.converter(vacinacaoDTO, usuario)));
        URI uri = uriBuilder.path("/vacinacao/{id}").buildAndExpand(vacinacao.getId()).toUri();
        return ResponseEntity.created(uri).body(vacinacao);
    }
}

