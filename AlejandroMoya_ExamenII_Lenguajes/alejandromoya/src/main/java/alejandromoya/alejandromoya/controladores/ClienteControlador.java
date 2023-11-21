package alejandromoya.alejandromoya.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alejandromoya.alejandromoya.Servicios.Implementacion.ClienteImplementacion;
import alejandromoya.alejandromoya.modelos.ClienteModel;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {

    @Autowired
    private ClienteImplementacion clienteImplementacion;

    @PostMapping("/crear")
    public ClienteModel crearCliente(@RequestBody ClienteModel cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/obtener/{idCliente}")
    public ClienteModel obtenerCliente(@PathVariable(name = "idCliente") int idCliente) {
        return this.clienteImplementacion.obtenerCliente(idCliente);
    }

    @GetMapping("/obtenertodos")
    public List<ClienteModel> obtenerTodos() {
        return this.clienteImplementacion.obtenerTodos();
    }

}
