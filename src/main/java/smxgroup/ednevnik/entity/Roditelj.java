package smxgroup.ednevnik.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="roditelj")
public class Roditelj {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roditelj_id")
	private int roditeljId;
	
	@Column(name="ime")
	private String ime;
	
	@Column(name="prezime")
	private String prezime;
	
	@OneToOne
	@JoinColumn(name="korisnicko_ime")
	private Korisnik korisnik;
	
	@ManyToMany
	@JoinTable(
			name="roditelj_ucenik",
			joinColumns=@JoinColumn(name="roditelj_id"),
			inverseJoinColumns=@JoinColumn(name="ucenik_id")
			)
	private List<Ucenik> ucenici;
	
	public Roditelj() {
		
	}
	
	public Roditelj(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public int getRoditeljId() {
		return roditeljId;
	}

	public void setRoditeljId(int roditeljId) {
		this.roditeljId = roditeljId;
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

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public List<Ucenik> getUcenici() {
		return ucenici;
	}

	public void setUcenici(List<Ucenik> ucenici) {
		this.ucenici = ucenici;
	}
	
	
	
	
}
