package pe.edu.upc.demo.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.TipoRecomendacion;
import pe.edu.upc.demo.repositories.ITipoRecomendacionRepository;
import pe.edu.upc.demo.serviceinterfaces.ITipoRecomendacionService;

@Service
public class TipoRecomendacionServiceImpl implements ITipoRecomendacionService{

	
	@Autowired
	private ITipoRecomendacionRepository tipoRepository;
	
	@Override
	public void insert(TipoRecomendacion tipo) {
		tipoRepository.save(tipo);
	}

	@Override
	public List<TipoRecomendacion> list() {
		// TODO Auto-generated method stub
		return tipoRepository.findAll();
	}

	@Override
	public void delete(int idTipo) {
		// TODO Auto-generated method stub
		tipoRepository.deleteById(idTipo);
	}

	@Override
	public Optional<TipoRecomendacion> listId(int idTipo) {
		// TODO Auto-generated method stub
		return tipoRepository.findById(idTipo);
	}

	@Override
	public void update(TipoRecomendacion tipo) {
		// TODO Auto-generated method stub
		tipoRepository.save(tipo);
	}
	
}
