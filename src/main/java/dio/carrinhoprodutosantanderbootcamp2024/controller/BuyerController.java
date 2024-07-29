package dio.carrinhoprodutosantanderbootcamp2024.controller;

import dio.carrinhoprodutosantanderbootcamp2024.dto.request.BuyerRequest;
import dio.carrinhoprodutosantanderbootcamp2024.dto.response.BuyerResponse;
import dio.carrinhoprodutosantanderbootcamp2024.entity.Buyer;
import dio.carrinhoprodutosantanderbootcamp2024.service.BuyerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/buyer")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BuyerController {

    private final BuyerService buyerService;

    @GetMapping
    public ResponseEntity<BuyerResponse> getByCode(@RequestParam(name = "code") String code) {
        Optional<Buyer> buyer = buyerService.findByCode(code);
        return buyer.map(value -> ResponseEntity.ok(BuyerResponse.toResponse(value)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<BuyerResponse> post(@Valid @RequestBody BuyerRequest request) {
        Buyer buyer = buyerService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(BuyerResponse.toResponse(buyer));
    }
}