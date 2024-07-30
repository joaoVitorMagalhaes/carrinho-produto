package dio.carrinhoprodutosantanderbootcamp2024.repository;

import dio.carrinhoprodutosantanderbootcamp2024.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
