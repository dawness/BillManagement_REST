package com.bills.Dao;

import java.util.List;

import com.bills.BillDetails;

public interface BillDao {
	
	
	public BillDetails findByBillNo(String billNo); 
	public List<BillDetails> findByStoreName(String storeName);
	public List<BillDetails> findByDate(String date);
	public void deleteByBillNo(String billNo);
	public void createBill(BillDetails bill);
	public List<BillDetails> findAll();
	public void updateBill(BillDetails bill);
	public List<BillDetails> getBillsbyMonth(String month); 
	

}
