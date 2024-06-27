package sinerji.glpontes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sinerji.glpontes.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
