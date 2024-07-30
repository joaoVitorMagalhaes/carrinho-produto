package dio.carrinhoprodutosantanderbootcamp2024.dto.response;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EnderecoResponse {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public static EnderecoResponse toResponse(Endereco endereco) {
        EnderecoResponse response = new EnderecoResponse();
        response.setCep(endereco.getCep());
        response.setLogradouro(endereco.getLogradouro());
        response.setBairro(endereco.getBairro());
        response.setLocalidade(endereco.getLocalidade());
        response.setUf(endereco.getUf());
        return response;
    }
}
