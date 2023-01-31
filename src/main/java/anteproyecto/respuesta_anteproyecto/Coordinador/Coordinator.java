package anteproyecto.respuesta_anteproyecto.Coordinador;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Coordinator {
 @Id
 private Long id;
 private String convocatoria;
 private String cedula;
 private String estudiante;
 private String carrera;
 private String tema;
 private String fecha_entrega_anteproyecto;
 private String Observacion;
 private String estado;
}
