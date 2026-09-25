package pa.gob.dntic.tareasapplication;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class TareasApplication {

    //public static void main(String[] args) {
        //SpringApplication.run(TareasApplication.class, args);
    //}

//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@SpringBootApplication
@RestController
public class TareasApplication {
    public static void main(String[] a){ SpringApplication.run(TareasApplication.class,a); }
    @GetMapping("/tareas") public List<String> tareas(){ return List.of("comprar pan","llamar a mama","desplegar ARKA"); }
}

//para generar un cambio

