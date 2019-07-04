package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="financialyear")
@Data
public class FinancialYear {

	@Id
	@GeneratedValue
	private int fId;
	private String finYear;
	public FinancialYear() {
		super();
	}
	public FinancialYear(String finYear) {
		super();
		this.finYear = finYear;
	}
	public FinancialYear(int fId, String finYear) {
		super();
		this.fId = fId;
		this.finYear = finYear;
	}
	
	
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getFinYear() {
		return finYear;
	}
	public void setFinYear(String finYear) {
		this.finYear = finYear;
	}
	@Override
	public String toString() {
		return "FinancialYear [fId=" + fId + ", finYear=" + finYear + "]";
	}
	
	
	
	
	
	
}
