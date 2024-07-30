package dio.carrinhoprodutosantanderbootcamp2024.dto.request;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BuyerRequest {
    private String name;
    private String cep;
}
