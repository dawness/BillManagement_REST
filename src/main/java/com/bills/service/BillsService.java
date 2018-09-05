package com.bills.service;

import java.util.List;

import com.bills.BillDetails;


public interface BillsService {
	public void createBill(BillDetails bill);
	public List<BillDetails> getBills();
	public BillDetails findByBillNo(String billNo);
	public List<BillDetails> findByStoreName(String storeName);
	public List<BillDetails> findByDate(String date);
	public void updateBill(BillDetails bill);
	public void deleteBill(String billNo);
	public List<BillDetails> getBillsByMonth(String month);

}
