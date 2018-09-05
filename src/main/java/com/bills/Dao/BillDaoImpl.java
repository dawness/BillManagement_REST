package com.bills.Dao;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import com.bills.BillDetails;


@Repository
public class BillDaoImpl  implements BillDao{
	@Autowired
	MongoTemplate mongoTemplate;
	//= new MongoTemplate(new MongoClient ("localhost"), "test");

	@Override
	public BillDetails findByBillNo(String billNo) {
	Query query = new Query();
		query.addCriteria(Criteria.where("billNo").is(billNo));
		return mongoTemplate.findOne(query, BillDetails.class);
		
		
	}

	@Override
	public List<BillDetails> findByStoreName(String storeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BillDetails> findByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByBillNo(String billNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBill(BillDetails bill) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(bill);
		
	}

	@Override
	public List<BillDetails> findAll() {
	
	
		return mongoTemplate.findAll(BillDetails.class);
	}
	
	@Override
	public void updateBill(BillDetails bill) {
		Query query = new Query();
		Update update = new Update();
		query.addCriteria(Criteria.where("billNo").is(bill.getBillNo()));
		update.set("storeName", bill.getStoreName());
		update.set("date", bill.getDate());
		update.set("amount", bill.getAmount());
		mongoTemplate.updateFirst(query, update, BillDetails.class);
		
	}
	
	@Override
	public List<BillDetails> getBillsbyMonth(String month) {
	Query query = new Query();
	
	
	String pattern = ".?"+ month +".*";
	query.addCriteria(Criteria.where("date").regex(Pattern.compile(pattern)));
	List<BillDetails> bills = mongoTemplate.find(query, BillDetails.class, "Bills");

	BigDecimal su =bills.stream()
			.map(a-> a.getAmount())
			.reduce(new BigDecimal(0),(sum,amount)->sum.add( amount));
	
	bills.add(new BillDetails("The total amount ","For the month ", month, su));
	return bills;
	}
}





 




