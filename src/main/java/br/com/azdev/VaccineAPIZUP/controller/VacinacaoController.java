package br.com.azdev.VaccineAPIZUP.controller;

import br.com.azdev.VaccineAPIZUP.dto.VacinacaoDTO;
import br.com.azdev.VaccineAPIZUP.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/vacinacao")
public class VacinacaoController {

   @Autowired
    VacinacaoService vacinacaoService;

    @PostMapping()
    public VacinacaoDTO create(@Valid @RequestBody VacinacaoDTO vacinacao){
        return vacinacaoService.create(VacinacaoDTO.converter(vacinacao));
    }

}
