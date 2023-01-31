package anteproyecto.respuesta_anteproyecto.respuesta_anteproyecto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RespuestaAnteproyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String convocatoria;
 private String cedula;
 private String estudiante;
 private String tema;
 private String fecha_entrega_anteproyecto;
 private String Observacion;
 private String estado;
}
