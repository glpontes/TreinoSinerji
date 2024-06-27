package sinerji.glpontes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sinerji.glpontes.entity.Cliente;
import sinerji.glpontes.entity.Pedido;

import java.util.List;


public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
