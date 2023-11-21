package alejandromoya.alejandromoya.Servicios.Implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import alejandromoya.alejandromoya.Servicios.ClienteServicio;
import alejandromoya.alejandromoya.modelos.ClienteModel;
import alejandromoya.alejandromoya.repositorio.ClienteRepositorio;

public class ClienteImplementacion implements ClienteServicio {

    @Autowired
    private ClienteRepositorio ClienteRepositorio;

    @Override
    public List<ClienteModel> obtenerTodos() {
        return this.ClienteRepositorio.findAll();
    }

    @Override
    public ClienteModel obtenerCliente(int idCliente) {
        return this.ClienteRepositorio.findById(idCliente).orElse(null);
    }

    @Override
    public ClienteModel crearCliente(ClienteModel cliente) {
        return this.ClienteRepositorio.save(cliente);
    }

}
