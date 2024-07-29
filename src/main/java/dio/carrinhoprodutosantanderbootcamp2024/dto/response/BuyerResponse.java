package dio.carrinhoprodutosantanderbootcamp2024.dto.response;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Buyer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BuyerResponse {
    private String name;
    private String code;
    private EnderecoResponse endereco;
    private List<CartResponse> cart;

    public static BuyerResponse toResponse(Buyer b) {
        List<CartResponse> cartResponse = CartResponse.toResponse(b.getCart());
        EnderecoResponse enderecoResponse = EnderecoResponse.toResponse(b.getEndereco());

        BuyerResponse buyerResponse = new BuyerResponse();
        buyerResponse.setName(b.getName());
        buyerResponse.setCode(b.getCode());
        buyerResponse.setCart(cartResponse);
        buyerResponse.setEndereco(enderecoResponse);
        return buyerResponse;
    }
}
