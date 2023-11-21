package alejandromoya.alejandromoya.Servicios;

import org.springframework.stereotype.Service;

import alejandromoya.alejandromoya.modelos.ReservaModel;

@Service
public interface ReservaServicio {
    public ReservaModel crearReserva();
}
