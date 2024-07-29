package dio.carrinhoprodutosantanderbootcamp2024.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BusinessException extends RuntimeException {
    private String message;
    private String timestamp;
}
