package smxgroup.ednevnik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="obavestenje")
public class Obavestenje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="obavestenje_id")
	private int obavestenjeId;
	
	@Column(name="tekst")
	private String tekst;
	
	public Obavestenje() {
		
	}
	
	public Obavestenje(String tekst) {
		this.tekst = tekst;
	}

	public int getObavestenjeId() {
		return obavestenjeId;
	}

	public void setObavestenjeId(int obavestenjeId) {
		this.obavestenjeId = obavestenjeId;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	

}
