package dio.carrinhoprodutosantanderbootcamp2024.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PingController {

    @GetMapping(value = "/ping")
    public ResponseEntity<String> pong() {
        return ResponseEntity.ok("pong");
    }

}
