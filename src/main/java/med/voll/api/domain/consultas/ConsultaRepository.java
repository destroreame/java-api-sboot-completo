package med.voll.api.domain.consultas;

import med.voll.api.domain.consultas.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
