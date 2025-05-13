package solutis.elasticode.locadora_veiculo.dtos.motorista;

import solutis.elasticode.locadora_veiculo.entities.Motorista;

public class MotoristaMapping {

    public static Motorista toEntity(MotoristaRequest req) {
        return (req == null) ? null : new Motorista(null, req.getNome(), req.getDataNascimento(), req.getCpf(), req.getSexo(), req.getNumeroCNH());
    }

    public static MotoristaResponse toResponse(Motorista entity) {
        return (entity == null) ? null : new MotoristaResponse(entity.getNome(), entity.getDataNascimento(), entity.getNumeroCNH());
    }

}
