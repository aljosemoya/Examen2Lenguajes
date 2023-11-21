package alejandromoya.alejandromoya.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import alejandromoya.alejandromoya.modelos.ClienteModel;

public interface ClienteRepositorio extends JpaRepository<ClienteModel, Integer> {

}
