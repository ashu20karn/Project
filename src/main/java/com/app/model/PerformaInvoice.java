package com.app.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Table(name="performainvoice")
@Data
public class PerformaInvoice {


	@Id
	@GeneratedValue
	private int pId;
	private String piNumber;
	@Temporal(TemporalType.DATE)
	private Date piDate;
	private Double piAmount;
	private MultipartFile[] file;
	
	public PerformaInvoice() {
		super();
	}

	public PerformaInvoice(String piNumber, Date piDate, Double piAmount, MultipartFile[] file) {
		super();
		this.piNumber = piNumber;
		this.piDate = piDate;
		this.piAmount = piAmount;
		this.file = file;
	}

	public PerformaInvoice(int pId, String piNumber, Date piDate, Double piAmount, MultipartFile[] file) {
		super();
		this.pId = pId;
		this.piNumber = piNumber;
		this.piDate = piDate;
		this.piAmount = piAmount;
		this.file = file;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPiNumber() {
		return piNumber;
	}

	public void setPiNumber(String piNumber) {
		this.piNumber = piNumber;
	}

	public Date getPiDate() {
		return piDate;
	}

	public void setPiDate(Date piDate) {
		this.piDate = piDate;
	}

	public Double getPiAmount() {
		return piAmount;
	}

	public void setPiAmount(Double piAmount) {
		this.piAmount = piAmount;
	}

	public MultipartFile[] getFile() {
		return file;
	}

	public void setFile(MultipartFile[] file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "PerformaInvoice [pId=" + pId + ", piNumber=" + piNumber + ", piDate=" + piDate + ", piAmount="
				+ piAmount + ", file=" + Arrays.toString(file) + "]";
	}

	
}
