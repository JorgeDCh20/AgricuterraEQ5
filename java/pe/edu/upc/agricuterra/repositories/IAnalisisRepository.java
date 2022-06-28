package pe.edu.upc.agricuterra.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.agricuterra.entities.Analisis;


@Repository
public interface IAnalisisRepository extends JpaRepository<Analisis, Integer> {

	@Query(value="Select  s.nombre_sembrio,count(s.id_sembrio) as numero_analisis from sembrio s join analisis a \r\n"
			+ "on s.id_sembrio= a.id_sembrio\r\n"
			+ "group by s.nombre_sembrio \r\n"
			+ "order by count(s.id_sembrio) desc", nativeQuery=true)
	public List<String[]> analisisXsembrio();
}
