package sinerji.glpontes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sinerji.glpontes.entity.Cliente;


import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);
}
