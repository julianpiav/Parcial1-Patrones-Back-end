package co.com.unisbana.Parcial1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class ElementoService {

    @Autowired
    private ElementoRepository elementoRepository;

    public List<Elemento> getAllElementos() {
        List<Elemento> elementos = elementoRepository.findAll();
        return elementos.isEmpty() ? Collections.emptyList() : elementos;
    }

    public void saveElemento(String valor) {
        Elemento elemento = new Elemento(valor);
        elementoRepository.save(elemento);
    }
}
