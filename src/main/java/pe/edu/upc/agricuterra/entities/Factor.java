package pe.edu.upc.agricuterra.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Factor")
public class Factor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFactor;

	@Column(name = "qPrecipitacion")
	private double qPrecipitacion;
	
	@Column(name = "qHumedad")
	private double qHumedad;
	
	@Column(name = "qTemperatura")
	private double qTemperatura;
	
	@Column(name = "qFosfato")
	private double qFosfato;
	
	@Column(name = "qNitrato")
	private double qNitrato;
	
	@Column(name = "qSulfato")
	private double qSulfato;
	
	@Column(name = "qPH")
	private double qPH;

	@ManyToOne
	@JoinColumn(name = "idTipoFactor")
	private TipoFactor tipofactor;

	public Factor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factor(int idFactor, double qPrecipitacion, double qHumedad, double qTemperatura, double qFosfato,
			double qNitrato, double qSulfato, double qPH, TipoFactor tipofactor) {
		super();
		this.idFactor = idFactor;
		this.qPrecipitacion = qPrecipitacion;
		this.qHumedad = qHumedad;
		this.qTemperatura = qTemperatura;
		this.qFosfato = qFosfato;
		this.qNitrato = qNitrato;
		this.qSulfato = qSulfato;
		this.qPH = qPH;
		this.tipofactor = tipofactor;
	}

	public int getIdFactor() {
		return idFactor;
	}

	public void setIdFactor(int idFactor) {
		this.idFactor = idFactor;
	}

	public double getqPrecipitacion() {
		return qPrecipitacion;
	}

	public void setqPrecipitacion(double qPrecipitacion) {
		this.qPrecipitacion = qPrecipitacion;
	}

	public double getqHumedad() {
		return qHumedad;
	}

	public void setqHumedad(double qHumedad) {
		this.qHumedad = qHumedad;
	}

	public double getqTemperatura() {
		return qTemperatura;
	}

	public void setqTemperatura(double qTemperatura) {
		this.qTemperatura = qTemperatura;
	}

	public double getqFosfato() {
		return qFosfato;
	}

	public void setqFosfato(double qFosfato) {
		this.qFosfato = qFosfato;
	}

	public double getqNitrato() {
		return qNitrato;
	}

	public void setqNitrato(double qNitrato) {
		this.qNitrato = qNitrato;
	}

	public double getqSulfato() {
		return qSulfato;
	}

	public void setqSulfato(double qSulfato) {
		this.qSulfato = qSulfato;
	}

	public double getqPH() {
		return qPH;
	}

	public void setqPH(double qPH) {
		this.qPH = qPH;
	}

	public TipoFactor getTipofactor() {
		return tipofactor;
	}

	public void setTipofactor(TipoFactor tipofactor) {
		this.tipofactor = tipofactor;
	}
	

}
