package dio.carrinhoprodutosantanderbootcamp2024.service.impl;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Cart;
import dio.carrinhoprodutosantanderbootcamp2024.repository.CartRepository;
import dio.carrinhoprodutosantanderbootcamp2024.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void close(Cart cart) {

    }

    @Override
    public void update(Long id, Cart newCart) {

    }
}
