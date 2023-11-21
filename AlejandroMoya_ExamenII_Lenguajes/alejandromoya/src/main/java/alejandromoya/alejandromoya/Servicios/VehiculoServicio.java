package alejandromoya.alejandromoya.Servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import alejandromoya.alejandromoya.modelos.VehiculoModel;

@Service
public interface VehiculoServicio {

    public VehiculoModel crearVehiculo(VehiculoModel vehiculo);

    public List<VehiculoModel> obtenerTodos();

    public VehiculoModel obtenerVehiculo(int idVehiculo);
}
