package sinerji.glpontes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sinerji.glpontes.entity.Produto;

public interface Produtos  extends JpaRepository<Produto, Integer> {
}
