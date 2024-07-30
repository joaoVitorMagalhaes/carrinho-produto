package dio.carrinhoprodutosantanderbootcamp2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@ImportAutoConfiguration({FeignAutoConfiguration.class})
@EnableFeignClients
@SpringBootApplication
public class CarrinhoProdutoSantanderBootcamp2024Application {

    public static void main(String[] args) {
        SpringApplication.run(CarrinhoProdutoSantanderBootcamp2024Application.class, args);
    }

}
