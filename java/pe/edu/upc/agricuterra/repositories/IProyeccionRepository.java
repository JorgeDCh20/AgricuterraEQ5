package pe.edu.upc.agricuterra.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.agricuterra.entities.Proyeccion;

@Repository
public interface IProyeccionRepository extends JpaRepository<Proyeccion, Integer> {

	@Query(value="Select u.full_name_usuario,s.nombre_sembrio,p.texto_detalles_proyeccion,\r\n"
			+ "a.text_analisis,f.nombre_factor, to_char(p.date_futura_proyeccion, 'dd/MM/yyyy')\r\n"
			+ "from proyeccion p join analisis a \r\n"
			+ "on a.id_analisis=p.id_analisis join sembrio s on s.id_sembrio=a.id_sembrio join factor f on a.id_factor=f.id_factor join usuario u on \r\n"
			+ "u.id_usuario=f.id_usuario\r\n"
			+ "where p.date_futura_proyeccion>NOW() and p.texto_detalles_proyeccion like 'Pésima cosecha'", nativeQuery=true)
	public List<String[]> proyeccionXpesimaCos();
	
	@Query(value="\r\n"
			+ "Select  p.texto_detalles_proyeccion, count(p.id_proyeccion) from proyeccion p\r\n"
			+ "where p.date_futura_proyeccion>NOW()\r\n"
			+ "group by p.texto_detalles_proyeccion order by count(p.id_proyeccion) desc", nativeQuery=true)
	public List<String[]> proyeccionXnombrePro();
}
