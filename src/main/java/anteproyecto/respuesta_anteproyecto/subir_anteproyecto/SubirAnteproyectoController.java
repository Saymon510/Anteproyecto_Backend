package anteproyecto.respuesta_anteproyecto.subir_anteproyecto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("api/subirAnteproyecto")
@CrossOrigin({"*"})
public class SubirAnteproyectoController {

 @Autowired SubirAnteproyectoService subirAnteproyectoService;

 @GetMapping("/")
 public List<SubirAnteproyecto> findAll(){
 return subirAnteproyectoService.findAll();
 }
 
 @GetMapping("/{id}/")
 public SubirAnteproyecto findById(@PathVariable Long id){
 return subirAnteproyectoService.findById(id);
 }

 @PostMapping("/")
 public SubirAnteproyecto save(@RequestBody SubirAnteproyecto entity, @RequestParam("file") MultipartFile documento) {
     SubirAnteproyecto subirAnteproyecto = subirAnteproyectoService.save(entity);
     if (!documento.isEmpty()) {
         Path directorioDocumentos = Paths.get("src//main//resources//archivos");
         String rutaAbsoluta = directorioDocumentos.toFile().getAbsolutePath();
         try {
             byte[] bytesDoc = documento.getBytes();
             Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + documento.getOriginalFilename());
             Files.write(rutaCompleta, bytesDoc);
             subirAnteproyecto.setDocumento(documento.getOriginalFilename());
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     return subirAnteproyecto;
 }
 

 @PutMapping("/")
 public SubirAnteproyecto update(@RequestBody SubirAnteproyecto entity){
 return subirAnteproyectoService.save(entity);
 }

 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
   subirAnteproyectoService.deleteById(id);
 }

}
