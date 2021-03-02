package br.com.azdev.VaccineAPIZUP.dto;

import br.com.azdev.VaccineAPIZUP.entity.Usuario;
import br.com.azdev.VaccineAPIZUP.entity.Vacinacao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class VacinacaoDTO{
    private Long id;
    @NotBlank
    private String nomeVacina;
    @Email @NotBlank
    private String emailUsuario;
    @NotNull
    private LocalDate dataAplicacao;

    public VacinacaoDTO() {
    }

    public VacinacaoDTO(Vacinacao vacinacao) {
        this.id = vacinacao.getId();
        this.nomeVacina = vacinacao.getNomeVacina();
        this.emailUsuario = vacinacao.getEmailUsuario();
        this.dataAplicacao = vacinacao.getDataAplicacao();
    }

    public static Vacinacao converter(VacinacaoDTO vacinacaoDTO){
        Vacinacao vacinacao = new Vacinacao();
        vacinacao.setNomeVacina(vacinacaoDTO.getNomeVacina());
        vacinacao.setEmailUsuario(vacinacaoDTO.getEmailUsuario());
        vacinacao.setDataAplicacao(vacinacaoDTO.getDataAplicacao());
        return vacinacao;
    }

    //Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
}
