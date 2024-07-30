package dio.carrinhoprodutosantanderbootcamp2024.dto.response;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Cart;
import dio.carrinhoprodutosantanderbootcamp2024.enums.CartStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartResponse {
    private LocalDateTime createdAt;
    private BigDecimal total;
    private CartStatus status;

    public static List<CartResponse> toResponse(List<Cart> cartList) {
        return cartList.stream()
                .map(cart -> new CartResponse(cart.getCreatedAt(), cart.getTotal(), cart.getStatus()))
                .collect(Collectors.toList());
    }
}

