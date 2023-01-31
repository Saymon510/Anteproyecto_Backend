package anteproyecto.respuesta_anteproyecto.subir_anteproyecto;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SubirAnteproyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String convocatoria;
 private String titulo;
 private Date fecha_solicitud;
 private Date fecha_respuesta;
 private String docente_asignado;
 private boolean estado;
 private String observacion;
 private String documento;
}





