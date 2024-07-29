package dio.carrinhoprodutosantanderbootcamp2024.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@ToString
@Entity(name = "tb_cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(precision = 4, scale = 2)
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
}
