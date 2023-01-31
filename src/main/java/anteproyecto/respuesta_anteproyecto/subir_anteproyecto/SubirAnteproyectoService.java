package anteproyecto.respuesta_anteproyecto.subir_anteproyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubirAnteproyectoService {
 @Autowired SubirAnteproyectoRepository subirAnteproyectoRepository;

 public SubirAnteproyecto save(SubirAnteproyecto entity){
 return subirAnteproyectoRepository.save(entity);
 }

 public SubirAnteproyecto findById( Long id){
 return subirAnteproyectoRepository.findById(id).orElse(new SubirAnteproyecto());
 }
 public void deleteById(Long id){
    subirAnteproyectoRepository.deleteById(id);
 }
 public List<SubirAnteproyecto> findAll(){
 return subirAnteproyectoRepository.findAll();
 }

}