package veterinaria_tp_jpa.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veterinaria_tp_jpa.demo2.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
