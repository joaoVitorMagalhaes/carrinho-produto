package dio.carrinhoprodutosantanderbootcamp2024.service.impl;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Buyer;
import dio.carrinhoprodutosantanderbootcamp2024.repository.BuyerRepository;
import dio.carrinhoprodutosantanderbootcamp2024.service.BuyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BuyerServiceImpl implements BuyerService {

    private final BuyerRepository repository;

    @Override
    public Optional<Buyer> findByCode(String code) {
        return repository.findBuyerByCode(code);
    }

    @Override
    public Buyer save(Buyer buyer) {
        return null;
    }
}
