package smxgroup.ednevnik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ucitelj")
public class Ucitelj {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ucitelj_id")
	private int uciteljId;
	
	@Column(name="ime")
	private String ime;
	
	@Column(name="prezime")
	private String prezime;
	
	@OneToOne
	@JoinColumn(name="korisnicko_ime")
	private Korisnik korisnik;
	
	@OneToOne(mappedBy="ucitelj")
	private Odeljenje odeljenje;
	
	public Ucitelj() {
		
	}
	
	public Ucitelj(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public int getUciteljId() {
		return uciteljId;
	}

	public void setUciteljId(int uciteljId) {
		this.uciteljId = uciteljId;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Odeljenje getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(Odeljenje odeljenje) {
		this.odeljenje = odeljenje;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	
	

	
	
	
}
