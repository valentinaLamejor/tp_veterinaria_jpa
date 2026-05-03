package veterinaria_tp_jpa.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veterinaria_tp_jpa.demo2.Model.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {
}
