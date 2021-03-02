package br.com.azdev.VaccineAPIZUP.repository;

import br.com.azdev.VaccineAPIZUP.entity.Vacinacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinacaoRepository extends JpaRepository<Vacinacao, Long> {
}
