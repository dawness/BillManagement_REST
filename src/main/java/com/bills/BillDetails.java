package com.bills;

import java.math.BigDecimal;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bills")
public class  BillDetails {
	
	private String billNo;
	private String storeName;
	private String date;
	private BigDecimal amount;
	
	
	
	public BillDetails(String billNo,String storeName, String date, BigDecimal amount) {
		super();
		this.billNo=billNo;
		this.storeName = storeName;
		this.date = date;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return String.format("BillNo = %s Date = %s Store = %s Amount = %.2f ",billNo, date, storeName,amount);
	}
	
	public String getBillNo() {
		return billNo;
	}
	
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	

}
