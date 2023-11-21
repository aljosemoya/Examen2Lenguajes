package alejandromoya.alejandromoya.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import alejandromoya.alejandromoya.modelos.VehiculoModel;

public interface VehiculoImplementacion extends JpaRepository<VehiculoModel, Integer> {

}
