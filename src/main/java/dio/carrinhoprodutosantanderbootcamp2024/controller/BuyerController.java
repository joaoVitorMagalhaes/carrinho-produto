package dio.carrinhoprodutosantanderbootcamp2024.controller;

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

    @GetMapping("/code/{code}")
    public ResponseEntity<Buyer> getByCode(@Valid @PathVariable String code) {
        Optional<Buyer> buyer = buyerService.findByCode(code);
        return buyer.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<Buyer> post(@Valid @RequestBody Buyer buyer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(buyerService.save(buyer));
    }
}