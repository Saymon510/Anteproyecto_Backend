package anteproyecto.respuesta_anteproyecto.subir_anteproyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubirAnteproyectoRepository extends JpaRepository<SubirAnteproyecto, Long> {
public List<SubirAnteproyecto> findAll();
}

