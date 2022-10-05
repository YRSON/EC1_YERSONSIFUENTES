package EC1_YersonSifuente.service;

import EC1_YersonSifuentes.model.Universidad;
import java.util.List;

public interface UniversidadService {
	void guardar(Universidad universidad);
	void actualizar(Universidad universidad);
	void eliminar(Integer id);
	List<Universidad> listar();
	Universidad obtener(Integer id);
}
