package dio.carrinhoprodutosantanderbootcamp2024.service.impl;

import dio.carrinhoprodutosantanderbootcamp2024.dto.request.BuyerRequest;
import dio.carrinhoprodutosantanderbootcamp2024.dto.response.BuyerResponse;
import dio.carrinhoprodutosantanderbootcamp2024.dto.response.EnderecoResponse;
import dio.carrinhoprodutosantanderbootcamp2024.entity.Cart;
import dio.carrinhoprodutosantanderbootcamp2024.entity.Endereco;
import dio.carrinhoprodutosantanderbootcamp2024.entity.Buyer;
import dio.carrinhoprodutosantanderbootcamp2024.repository.BuyerRepository;
import dio.carrinhoprodutosantanderbootcamp2024.service.BuyerService;
import dio.carrinhoprodutosantanderbootcamp2024.service.CartService;
import dio.carrinhoprodutosantanderbootcamp2024.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class BuyerServiceImpl implements BuyerService {

    private final BuyerRepository buyerRepository;
    private final EnderecoService enderecoService;
    private final CartService cartService;

    @Override
    public Optional<Buyer> findByCode(String code) {
        return buyerRepository.findBuyerByCode(code);
    }

    @Override
    public Buyer save(BuyerRequest request) {
        Endereco enderecoResponse = enderecoService.save(request.getCep());
        Buyer buyer = new Buyer();
        buyer.setName(request.getName());
        buyer.setCode(generateBuyerCode());
        buyer.setEndereco(enderecoResponse);

        buyerRepository.save(buyer);

        Cart cart = new Cart();
        cart.setBuyer(buyer);
        cartService.save(cart);

        buyer.getCart().add(cart);

        return buyerRepository.save(buyer);
    }

    public String generateBuyerCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            code.append(letter);
        }

        for (int i = 0; i < 6; i++) {
            int digit = random.nextInt(10);
            code.append(digit);
        }

        return code.toString();
    }
}
