package alejandromoya.alejandromoya.Servicios.Implementacion;

import org.springframework.beans.factory.annotation.Autowired;

import alejandromoya.alejandromoya.Servicios.TipoClienteServicio;
import alejandromoya.alejandromoya.modelos.TipoClienteModel;
import alejandromoya.alejandromoya.repositorio.TipoClienteRepositorio;

public class TipoClienteImplementacion implements TipoClienteServicio {

    @Autowired
    private TipoClienteRepositorio TipoClienteRepositorio;

    @Override
    public TipoClienteModel crearTipoCliente(TipoClienteModel TipoCliente) {
        return this.TipoClienteRepositorio.save(TipoCliente);
    }
}
