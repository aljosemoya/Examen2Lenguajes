package alejandromoya.alejandromoya.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import alejandromoya.alejandromoya.modelos.TipoClienteModel;

public interface TipoClienteRepositorio extends JpaRepository<TipoClienteModel, Integer> {

}
