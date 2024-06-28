package sinerji.glpontes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sinerji.glpontes.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
