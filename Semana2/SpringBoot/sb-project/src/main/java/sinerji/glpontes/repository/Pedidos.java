package sinerji.glpontes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sinerji.glpontes.entity.Pedido;


public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
