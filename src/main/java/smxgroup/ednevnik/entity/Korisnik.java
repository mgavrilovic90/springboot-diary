package smxgroup.ednevnik.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="korisnik")
public class Korisnik {

	@Id
	@Column(name="korisnicko_ime")
	private String korisnickoIme;

	@Column(name="lozinka")
	private String lozinka;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="uloga_korisnik",
	joinColumns=@JoinColumn(name="korisnicko_ime"),
	inverseJoinColumns=@JoinColumn(name="uloga_id")
	)
	private Set<Uloga> uloge;
	
	public Korisnik() {
		
	}
	

	public Korisnik(String korisnickoIme, String lozinka) {
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}


	public Set<Uloga> getUloge() {
		return uloge;
	}


	public void setUloge(Set<Uloga> uloge) {
		this.uloge = uloge;
	}

	

	
	
	
}
