package dio.carrinhoprodutosantanderbootcamp2024.service.impl;

import dio.carrinhoprodutosantanderbootcamp2024.dto.response.CepResponse;
import dio.carrinhoprodutosantanderbootcamp2024.entity.Endereco;
import dio.carrinhoprodutosantanderbootcamp2024.gateway.ViaCepGateway;
import dio.carrinhoprodutosantanderbootcamp2024.repository.EnderecoRepository;
import dio.carrinhoprodutosantanderbootcamp2024.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnderecoServiceImpl implements EnderecoService {

    private final ViaCepGateway viaCepGateway;
    private final EnderecoRepository enderecoRepository;

    @Override
    public Endereco save(String cep) {
        CepResponse response = viaCepGateway.execute(cep);

        Endereco endereco = new Endereco();
        endereco.setCep(response.getCep());
        endereco.setLogradouro(response.getLogradouro());
        endereco.setBairro(response.getBairro());
        endereco.setLocalidade(response.getLocalidade());
        endereco.setUf(response.getUf());

        return enderecoRepository.save(endereco);
    }
}
