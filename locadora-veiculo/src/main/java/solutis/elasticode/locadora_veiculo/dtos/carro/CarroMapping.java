package solutis.elasticode.locadora_veiculo.dtos.carro;

import solutis.elasticode.locadora_veiculo.entities.Carro;

public class CarroMapping {

    public static Carro toEntity(CarroRequest req) {
        return (req == null) ? null : new Carro(null, req.getPlaca(), req.getChassi(), req.getCor(), req.getValorDiaria(), req.getModelo(), req.getAcessorio());
    }

    public static CarroResponse toResponse(Carro entity) {
        return (entity == null) ? null : new CarroResponse(entity.getPlaca(), entity.getChassi(), entity.getCor(), entity.getValorDiaria(), entity.getModelo(), entity.getAcessorio());
    }

    public static CarroResponseResumed toResumedResponse(Carro entity) {
        return (entity == null) ? null : new CarroResponseResumed(entity.getModelo(), entity.getAcessorio(), entity.getValorDiaria());
    }

}
