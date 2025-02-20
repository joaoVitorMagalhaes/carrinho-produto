package dio.carrinhoprodutosantanderbootcamp2024.service;

import dio.carrinhoprodutosantanderbootcamp2024.dto.request.BuyerRequest;
import dio.carrinhoprodutosantanderbootcamp2024.entity.Buyer;

import java.util.Optional;

public interface BuyerService {
    Optional<Buyer> findByCode(String code);
    Buyer save(BuyerRequest request);
}
