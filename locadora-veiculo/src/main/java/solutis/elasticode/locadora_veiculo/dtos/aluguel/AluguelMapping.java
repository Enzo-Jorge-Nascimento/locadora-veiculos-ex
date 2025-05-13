package solutis.elasticode.locadora_veiculo.dtos.aluguel;

import solutis.elasticode.locadora_veiculo.entities.Aluguel;

public class AluguelMapping {

    public static Aluguel toEntity(AluguelRequest req) {
        return (req == null) ? null : new Aluguel(null, req.getDataPedido(), null, req.getDataDevolucao(), req.getValorTotal(), req.getSeguro(), null, null);
    }

    public static AluguelResponse toResponse(Aluguel entity) {
        return (entity == null) ? null : new AluguelResponse(entity.getDataPedido(), entity.getDataDevolucao(), entity.getValorTotal(), entity.getSeguro(), null);
    }

}
