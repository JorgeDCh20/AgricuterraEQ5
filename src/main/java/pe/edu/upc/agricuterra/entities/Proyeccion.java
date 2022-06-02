package pe.edu.upc.agricuterra.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Proyeccion")
public class Proyeccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProyeccion;

	@Column(name = "textoDetallesProyeccion", length = 350, nullable = false)
	private String textoDetallesProyeccion;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "dateFuturaProyeccion", nullable = false)
	private Date dateFuturaProyeccion;

	public Proyeccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proyeccion(int idProyeccion, String textoDetallesProyeccion, Date dateFuturaProyeccion) {
		super();
		this.idProyeccion = idProyeccion;
		this.textoDetallesProyeccion = textoDetallesProyeccion;
		this.dateFuturaProyeccion = dateFuturaProyeccion;
	}

	public int getIdProyeccion() {
		return idProyeccion;
	}

	public void setIdProyeccion(int idProyeccion) {
		this.idProyeccion = idProyeccion;
	}

	public String getTextoDetallesProyeccion() {
		return textoDetallesProyeccion;
	}

	public void setTextoDetallesProyeccion(String textoDetallesProyeccion) {
		this.textoDetallesProyeccion = textoDetallesProyeccion;
	}

	public Date getDateFuturaProyeccion() {
		return dateFuturaProyeccion;
	}

	public void setDateFuturaProyeccion(Date dateFuturaProyeccion) {
		this.dateFuturaProyeccion = dateFuturaProyeccion;
	}

	

	
}
