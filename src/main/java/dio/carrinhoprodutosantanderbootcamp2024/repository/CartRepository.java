package dio.carrinhoprodutosantanderbootcamp2024.repository;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findAllByBuyerCode(String buyerCode);
}
