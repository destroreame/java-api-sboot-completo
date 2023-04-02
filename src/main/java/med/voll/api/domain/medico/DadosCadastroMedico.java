package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank(message = "{nome.obrigatorio}") //Somente campos string, valida branco e nulo
        String nome,

        @NotBlank(message = "Email obtigatório")
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //regex
        String crm,

        @NotNull
        EspecialidadeEnum especialidade,

        @NotNull
        @Valid //Necessario para o spring entender que a classe do objeto deve ser validado
        DadosEndereco endereco) {


}
