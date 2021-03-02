package br.com.azdev.VaccineAPIZUP.repository;

import br.com.azdev.VaccineAPIZUP.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
