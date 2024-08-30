package co.com.unisbana.Parcial1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/elemento")
public class ElementoController {
    @Autowired
    private ElementoService elementoService;

    @PostMapping(path = "/crear")
    public ResponseEntity<String> crearElementos(@RequestBody Elemento nuevoElemento) {
        elementoService.saveElemento(nuevoElemento.getValor());
        return ResponseEntity.ok("El elemento se añadio a la listas correctamente");
    }

    @GetMapping(path = "/todos")
    public List<Elemento> obtenerElementos() {
        return elementoService.getAllElementos();
    }
}