package dio.carrinhoprodutosantanderbootcamp2024.service;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Cart;

import java.util.List;

public interface CartService {
    void save(Cart cart);
    void close(Cart cart);
    void update(Long id, Cart newCart);
    List<Cart> findAllByBuyerCode(String buyerCode);
}
