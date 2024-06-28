package sinerji.glpontes.service;

import sinerji.glpontes.domain.entity.Pedido;
import sinerji.glpontes.domain.enums.StatusPedido;
import sinerji.glpontes.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
