package br.com.azdev.VaccineAPIZUP.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Vacinacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nomeVacina;
    @Email @NotNull
    private String emailUsuario;
    @NotNull
    private LocalDate dataAplicacao;

}
