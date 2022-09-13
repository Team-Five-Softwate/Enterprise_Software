package com.TEAM_FIVE_SOFTWARE.App_Web.reposotorio;

import com.TEAM_FIVE_SOFTWARE.App_Web.Modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotación que le dice a Spring que esta clase es un repositorio
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}

