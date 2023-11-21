package alejandromoya.alejandromoya.Servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import alejandromoya.alejandromoya.modelos.ClienteModel;

@Service
public interface ClienteServicio {

    public List<ClienteModel> obtenerTodos();

    public ClienteModel obtenerCliente(int idCliente);

    public ClienteModel crearCliente(ClienteModel cliente);
}