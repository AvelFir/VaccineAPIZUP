package br.com.azdev.VaccineAPIZUP.repository;

import br.com.azdev.VaccineAPIZUP.entity.Vacinacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinacaoRepository extends JpaRepository<Vacinacao, Long> {
}
