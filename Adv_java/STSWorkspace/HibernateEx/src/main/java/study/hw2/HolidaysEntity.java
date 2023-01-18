package study.hw2;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="holiday")
public class HolidaysEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="holdiay_name")
	private String nameOfHoldiay;
	
	@Column(name="holiday_year")
	Date dateInCurrentYear;
	
	public HolidaysEntity() {}

	public HolidaysEntity(int id, String nameOfHoldiay, Date dateInCurrentYear) {
		super();
		this.id = id;
		this.nameOfHoldiay = nameOfHoldiay;
		this.dateInCurrentYear = dateInCurrentYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfHoldiay() {
		return nameOfHoldiay;
	}

	public void setNameOfHoldiay(String nameOfHoldiay) {
		this.nameOfHoldiay = nameOfHoldiay;
	}

	public Date getDateInCurrentYear() {
		return dateInCurrentYear;
	}

	public void setDateInCurrentYear(Date dateInCurrentYear) {
		this.dateInCurrentYear = dateInCurrentYear;
	}

	@Override
	public String toString() {
		return "HolidaysEntity [id=" + id + ", nameOfHoldiay=" + nameOfHoldiay + ", dateInCurrentYear="
				+ dateInCurrentYear + "]";
	}
	
	

}
