package dio.carrinhoprodutosantanderbootcamp2024.repository;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
    Optional<Buyer> findBuyerByCode(String code);
}
