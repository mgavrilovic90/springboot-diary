package smxgroup.ednevnik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uloga")
public class Uloga {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="uloga_id")
	private int ulogaId;
	
	@Column(name="naziv")
	private String naziv;
	
	public Uloga() {
		
	}

	public Uloga(String naziv) {
		this.naziv = naziv;
	}

	public int getUlogaId() {
		return ulogaId;
	}

	public void setUlogaId(int ulogaId) {
		this.ulogaId = ulogaId;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
}
