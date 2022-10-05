package EC1_YersonSifuentes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1_YersonSifuentes.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer>{

}
