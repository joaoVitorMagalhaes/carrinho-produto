package dio.carrinhoprodutosantanderbootcamp2024.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@ToString
@Entity(name = "tb_endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}
