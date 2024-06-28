package sinerji.glpontes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sinerji.glpontes.domain.entity.Produto;

public interface Produtos  extends JpaRepository<Produto, Integer> {
}
