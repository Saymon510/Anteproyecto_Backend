package anteproyecto.respuesta_anteproyecto.Docente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Docente {
 @Id
 private Long id;
 private String convocatoria;
 private String cedula;
 private String estudiante;
 private String tema;
 private String fecha_entrega_anteproyecto;
 private String Observacion;
 private String estado;
}
