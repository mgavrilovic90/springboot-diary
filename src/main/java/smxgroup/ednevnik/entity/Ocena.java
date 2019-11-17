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
@Table(name="ocena")
public class Ocena {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ocena_id")
	private int ocenaId;
	
	@Column(name="ocena_numericka")
	private int ocenaNumericka;

	@Column(name="ocena_opisna")
	private String ocenaOpisna;
	
	@Column(name="datum")
	@Temporal(TemporalType.DATE)
	private Date datum;
	
	@ManyToOne
	@JoinColumn(name="predmet_id")
	private Predmet predmet;
	
	@ManyToOne
	@JoinColumn(name="ucenik_id")
	private Ucenik ucenik;
	
	public Ocena() {
		
	}

	public int getOcenaId() {
		return ocenaId;
	}

	public void setOcenaId(int ocenaId) {
		this.ocenaId = ocenaId;
	}

	public int getOcenaNumericka() {
		return ocenaNumericka;
	}

	public void setOcenaNumericka(int ocenaNumericka) {
		this.ocenaNumericka = ocenaNumericka;
	}

	public String getOcenaOpisna() {
		return ocenaOpisna;
	}

	public void setOcenaOpisna(String ocenaOpisna) {
		this.ocenaOpisna = ocenaOpisna;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public Ucenik getUcenik() {
		return ucenik;
	}

	public void setUcenik(Ucenik ucenik) {
		this.ucenik = ucenik;
	}
	
	
	
	

}
