package med.voll.api.domain.medico;

import med.voll.api.domain.enums.EspecialidadeEnum;
import med.voll.api.domain.jpa.Medico;

public record ListagemMedicos(Long id, String nome, String email, String crm, EspecialidadeEnum especialidade) {

    public ListagemMedicos(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
