package alejandromoya.alejandromoya.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alejandromoya.alejandromoya.Servicios.Implementacion.ClienteImplementacion;
import alejandromoya.alejandromoya.Servicios.Implementacion.TipoClienteImplementacion;
import alejandromoya.alejandromoya.modelos.TipoClienteModel;

@RestController
@RequestMapping("/tipocliente")
public class TipoClienteControlador {

    @Autowired
    private TipoClienteImplementacion TipoclienteImplementacion;

    @PostMapping("/crear/{descripcion}")
    public TipoClienteModel crearTipoCliente(@PathVariable(name = "descripcion") String descripcion) {
        TipoClienteModel tipoCliente = new TipoClienteModel();
        tipoCliente.setDescripcion(descripcion);

        return this.TipoclienteImplementacion.crearTipoCliente(tipoCliente);
    }
}
