package smxgroup.ednevnik.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ucenik")
public class Ucenik {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ucenik_id")
	private int ucenikId;
	
	@Column(name="ime")
	private String ime;
	
	@Column(name="prezime")
	private String prezime;
	
	@Column(name="datum_rodjenja")
	@Temporal(TemporalType.DATE)
	private Date datumRodjenja;
	
	@Column(name="izostanci_opravdani")
	private int izostanciOpravdani;
	
	@Column(name="izostanci_neopravdani")
	private int izostanciNeopravdani;
	
	@ManyToOne
	@JoinColumn(name="odeljenje_id")
	private Odeljenje odeljenje;
	
	@ManyToMany
	@JoinTable(
			name="roditelj_ucenik",
			joinColumns=@JoinColumn(name="ucenik_id"),
			inverseJoinColumns=@JoinColumn(name="roditelj_id")
			)
	private List<Roditelj> roditelji;
	
	@OneToMany(mappedBy="ucenik")
	private List<Ocena> ocene;
	
	public Ucenik() {
		
	}

	public Ucenik(String ime, String prezime, Date datumRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
	}

	public int getUcenikId() {
		return ucenikId;
	}

	public void setUcenikId(int ucenikId) {
		this.ucenikId = ucenikId;
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

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public int getIzostanciOpravdani() {
		return izostanciOpravdani;
	}

	public void setIzostanciOpravdani(int izostanciOpravdani) {
		this.izostanciOpravdani = izostanciOpravdani;
	}

	public int getIzostanciNeopravdani() {
		return izostanciNeopravdani;
	}

	public void setIzostanciNeopravdani(int izostanciNeopravdani) {
		this.izostanciNeopravdani = izostanciNeopravdani;
	}

	public Odeljenje getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(Odeljenje odeljenje) {
		this.odeljenje = odeljenje;
	}

	public List<Roditelj> getRoditelji() {
		return roditelji;
	}

	public void setRoditelji(List<Roditelj> roditelji) {
		this.roditelji = roditelji;
	}

	public List<Ocena> getOcene() {
		return ocene;
	}

	public void setOcene(List<Ocena> ocene) {
		this.ocene = ocene;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
