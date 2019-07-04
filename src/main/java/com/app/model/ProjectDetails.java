package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="projectdetails")
@Data
public class ProjectDetails{

	
	@Id
	@GeneratedValue
	private int pdId;
	private String projNumber;
	private String projName;
	private String cloudAccNumber;
	private String remarks;
	private Double amtRecvFrmUser;
	private Double TdsAmount;
	private String status;
	private String loc;
	private String year;
	@OneToMany
	@JoinColumn(name="pIdFK")
	private List<PerformaInvoice> pi = new ArrayList<>();
	@OneToMany
	@JoinColumn(name="bIdFK")
	private List<Billing> bill = new ArrayList<>();
	public ProjectDetails() {
		super();
	}
	public ProjectDetails(String projNumber, String projName, String cloudAccNumber, String remarks,
			Double amtRecvFrmUser, Double tdsAmount, String status, String loc, String year, List<PerformaInvoice> pi,
			List<Billing> bill) {
		super();
		this.projNumber = projNumber;
		this.projName = projName;
		this.cloudAccNumber = cloudAccNumber;
		this.remarks = remarks;
		this.amtRecvFrmUser = amtRecvFrmUser;
		TdsAmount = tdsAmount;
		this.status = status;
		this.loc = loc;
		this.year = year;
		this.pi = pi;
		this.bill = bill;
	}
	public ProjectDetails(int pdId, String projNumber, String projName, String cloudAccNumber, String remarks,
			Double amtRecvFrmUser, Double tdsAmount, String status, String loc, String year, List<PerformaInvoice> pi,
			List<Billing> bill) {
		super();
		this.pdId = pdId;
		this.projNumber = projNumber;
		this.projName = projName;
		this.cloudAccNumber = cloudAccNumber;
		this.remarks = remarks;
		this.amtRecvFrmUser = amtRecvFrmUser;
		TdsAmount = tdsAmount;
		this.status = status;
		this.loc = loc;
		this.year = year;
		this.pi = pi;
		this.bill = bill;
	}
	
	
	
	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	public String getProjNumber() {
		return projNumber;
	}
	public void setProjNumber(String projNumber) {
		this.projNumber = projNumber;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getCloudAccNumber() {
		return cloudAccNumber;
	}
	public void setCloudAccNumber(String cloudAccNumber) {
		this.cloudAccNumber = cloudAccNumber;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Double getAmtRecvFrmUser() {
		return amtRecvFrmUser;
	}
	public void setAmtRecvFrmUser(Double amtRecvFrmUser) {
		this.amtRecvFrmUser = amtRecvFrmUser;
	}
	public Double getTdsAmount() {
		return TdsAmount;
	}
	public void setTdsAmount(Double tdsAmount) {
		TdsAmount = tdsAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<PerformaInvoice> getPi() {
		return pi;
	}
	public void setPi(List<PerformaInvoice> pi) {
		this.pi = pi;
	}
	public List<Billing> getBill() {
		return bill;
	}
	public void setBill(List<Billing> bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "ProjectDetails [pdId=" + pdId + ", projNumber=" + projNumber + ", projName=" + projName
				+ ", cloudAccNumber=" + cloudAccNumber + ", remarks=" + remarks + ", amtRecvFrmUser=" + amtRecvFrmUser
				+ ", TdsAmount=" + TdsAmount + ", status=" + status + ", loc=" + loc + ", year=" + year + ", pi=" + pi
				+ ", bill=" + bill + "]";
	}
	
	
}
