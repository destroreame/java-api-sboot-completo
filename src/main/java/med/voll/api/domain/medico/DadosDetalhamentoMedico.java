package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(
        String nome,
        String email,
        String telefone,
        String crm,
        EspecialidadeEnum especialidade,
        Endereco endereco
) {

    public DadosDetalhamentoMedico(Medico medico) {

        this(medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade(), medico.getEndereco());
    }
}
