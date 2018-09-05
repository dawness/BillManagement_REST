package com.bills.Dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bills.BillDetails;

@Repository
public interface BillRepository extends MongoRepository<BillDetails,String> {
	
	public BillDetails findByBillNo(String billNo); 
	public List<BillDetails> findByStoreName(String storeName);
	public List<BillDetails> findByDate(String date);
	public void deleteByBillNo(String billNo);
	//public void updateByBillNo(String billNo);

}
