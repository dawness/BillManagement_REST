package com.bills.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bills.BillDetails;
import com.bills.Dao.BillDao;


@Service
public class BillsServieimpl implements BillsService{
	
	@Autowired
	private BillDao billDao;

	@Override
	public void createBill(BillDetails bill) {
		billDao.createBill(bill);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BillDetails> getBills() {
		return billDao.findAll();
		
		
	}

	@Override
	public void updateBill(BillDetails bill) {
		
	
		billDao.updateBill(bill);
		
	}
	
	@Override

	public BillDetails findByBillNo(String billNo) {
		
		return billDao.findByBillNo(billNo);
	}

	@Override
	public void deleteBill(String billNo) {
		// TODO Auto-generated method stub
		billDao.deleteByBillNo(billNo);
		
	}
	
@Override
public List<BillDetails> findByStoreName(String storeName) {
	
	return billDao.findByStoreName(storeName);
}
	
@Override
public List<BillDetails> findByDate(String date) {
	
	return billDao.findByDate(date);
}	

@Override
public List<BillDetails> getBillsByMonth(String month) {
	
	return billDao.getBillsbyMonth(month);
}
}
