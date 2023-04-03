package med.voll.api.domain.consultas.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consultas.DadosAgendamentoConsulta;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoConsulta{

    @Autowired
    PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {

        var pacienteEstaAtivo = repository.verificarPacienteAtivo(dados.idPaciente());

        if (!pacienteEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com paciente inativo");
        }

    }
}
