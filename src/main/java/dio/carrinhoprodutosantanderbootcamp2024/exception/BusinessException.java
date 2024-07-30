package dio.carrinhoprodutosantanderbootcamp2024.exception;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
