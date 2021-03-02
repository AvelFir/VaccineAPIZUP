package br.com.azdev.VaccineAPIZUP.controller;

import br.com.azdev.VaccineAPIZUP.dto.VacinacaoDTO;
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

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public VacinacaoDTO create(@Valid @RequestBody VacinacaoDTO vacinacao){
        return vacinacaoService.create(VacinacaoDTO.converter(vacinacao));
    }
}
