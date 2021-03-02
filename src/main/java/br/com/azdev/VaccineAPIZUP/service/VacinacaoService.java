package br.com.azdev.VaccineAPIZUP.service;

import br.com.azdev.VaccineAPIZUP.dto.VacinacaoDTO;
import br.com.azdev.VaccineAPIZUP.entity.Vacinacao;
import br.com.azdev.VaccineAPIZUP.repository.VacinacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinacaoService {
    @Autowired
    VacinacaoRepository vacinacaoRepository;

    public VacinacaoDTO create(Vacinacao vacinacao){

        return new VacinacaoDTO(vacinacaoRepository.save(vacinacao));
    }
}
