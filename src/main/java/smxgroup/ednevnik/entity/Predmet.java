package smxgroup.ednevnik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="predmet")
public class Predmet {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="predmet_id")
	private int predmetId;
	
	@Column(name="naziv")
	private String naziv;
	
	@Column(name="status")
	private String status;
	
	
	public Predmet() {
		
	}
	
	
	
	public Predmet(String naziv, String status) {
		this.status = status;
		this.naziv = naziv;
	}

	public int getPredmetId() {
		return predmetId;
	}

	public void setPredmetId(int predmetId) {
		this.predmetId = predmetId;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	

	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	
	
	
	
}
