package dio.carrinhoprodutosantanderbootcamp2024.gateway;

import dio.carrinhoprodutosantanderbootcamp2024.dto.response.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepGateway {

    @RequestMapping(method = GET, value = "/{cep}/json/")
    CepResponse execute(@PathVariable("cep") String cep);
}
