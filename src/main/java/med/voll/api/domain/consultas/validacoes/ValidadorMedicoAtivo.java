package med.voll.api.domain.consultas.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consultas.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo  implements ValidadorAgendamentoConsulta {

    @Autowired
    MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {

        // Escolha do medico opcional
        if (dados.idMedico() == null) {
            return;
        }

        var medicoEstaAtivo = repository.verificarMedicoAtivo(dados.idMedico());

        if (!medicoEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com médico inativo");
        }

    }
}
