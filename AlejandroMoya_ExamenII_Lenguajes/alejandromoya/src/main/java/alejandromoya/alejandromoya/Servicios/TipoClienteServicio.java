package alejandromoya.alejandromoya.Servicios;

import org.springframework.stereotype.Service;

import alejandromoya.alejandromoya.modelos.TipoClienteModel;

@Service
public interface TipoClienteServicio {
    public TipoClienteModel crearTipoCliente(TipoClienteModel tipoCliente);
}
