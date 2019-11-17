package smxgroup.ednevnik.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="odeljenje")
public class Odeljenje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="odeljenje_id")
	private int odeljenjeId;
	
	@Column(name="razred")
	private String razred;
	
	@Column(name="indeks")
	private String indeks;
	
	@Column(name="broj_ucenika")
	private int brojUcenika;
	
	@OneToOne
	@JoinColumn(name="ucitelj_id")
	private Ucitelj ucitelj;
	
	@OneToMany(mappedBy="odeljenje")
	private List<Ucenik> ucenici;
	
	public Odeljenje() {
		
	}

	public Odeljenje(String razred, String indeks, int brojUcenika) {
		this.razred = razred;
		this.indeks = indeks;
		this.brojUcenika = brojUcenika;
	}

	public int getOdeljenjeId() {
		return odeljenjeId;
	}

	public void setOdeljenjeId(int odeljenjeId) {
		this.odeljenjeId = odeljenjeId;
	}
	

	public String getRazred() {
		return razred;
	}

	public void setRazred(String razred) {
		this.razred = razred;
	}

	public List<Ucenik> getUcenici() {
		return ucenici;
	}

	public void setUcenici(List<Ucenik> ucenici) {
		this.ucenici = ucenici;
	}

	public String getIndeks() {
		return indeks;
	}

	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}

	public int getBrojUcenika() {
		return brojUcenika;
	}

	public void setBrojUcenika(int brojUcenika) {
		this.brojUcenika = brojUcenika;
	}

	public Ucitelj getUcitelj() {
		return ucitelj;
	}

	public void setUcitelj(Ucitelj ucitelj) {
		this.ucitelj = ucitelj;
	}

	
	
	
	
}
