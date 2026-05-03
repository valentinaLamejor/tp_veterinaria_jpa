package veterinaria_tp_jpa.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veterinaria_tp_jpa.demo2.Model.Turno;

public interface TurnoRepository extends JpaRepository<Turno, Integer> {
}
