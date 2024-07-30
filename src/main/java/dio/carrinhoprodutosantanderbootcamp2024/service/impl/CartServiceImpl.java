package dio.carrinhoprodutosantanderbootcamp2024.service.impl;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Cart;
import dio.carrinhoprodutosantanderbootcamp2024.enums.CartStatus;
import dio.carrinhoprodutosantanderbootcamp2024.exception.NotFoundException;
import dio.carrinhoprodutosantanderbootcamp2024.repository.CartRepository;
import dio.carrinhoprodutosantanderbootcamp2024.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
        cart.setStatus(CartStatus.CLOSED);
        cart.setUpdatedAt(LocalDateTime.now());
        save(cart);
    }

    @Override
    public void update(Long id, Cart newCart) {
        Optional<Cart> optionalCart = cartRepository.findById(id);

        if (optionalCart.isEmpty()) {
            throw new NotFoundException("Cart not found with id: " + id);
        }

        Cart existingCart = optionalCart.get();
        BeanUtils.copyProperties(newCart, existingCart, "id");

        existingCart.setUpdatedAt(LocalDateTime.now());
        cartRepository.save(existingCart);
    }

    @Override
    public List<Cart> findAllByBuyerCode(String buyerCode) {
        return cartRepository.findAllByBuyerCode(buyerCode);
    }
}
