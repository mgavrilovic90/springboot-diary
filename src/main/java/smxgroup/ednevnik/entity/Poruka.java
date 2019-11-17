package smxgroup.ednevnik.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="poruka")
public class Poruka {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="poruka_id")
	private int porukaId;
	
	@Column(name="tekst")
	private String tekst;
	
	@Column(name="datum")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datum;
	
	@ManyToOne
	@JoinColumn(name="ucitelj_id")
	private Ucitelj ucitelj;
	
	@ManyToOne
	@JoinColumn(name="roditelj_id")
	private Roditelj roditelj;
	
	public Poruka() {
		
	}

	public Poruka(String tekst) {
		this.tekst = tekst;
		this.datum = new Date();
	}

	public int getPorukaId() {
		return porukaId;
	}

	public void setPorukaId(int porukaId) {
		this.porukaId = porukaId;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Ucitelj getUcitelj() {
		return ucitelj;
	}

	public void setUcitelj(Ucitelj ucitelj) {
		this.ucitelj = ucitelj;
	}

	public Roditelj getRoditelj() {
		return roditelj;
	}

	public void setRoditelj(Roditelj roditelj) {
		this.roditelj = roditelj;
	}
	
	
}
