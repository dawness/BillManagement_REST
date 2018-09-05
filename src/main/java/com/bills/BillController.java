package com.bills;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bills.service.BillsService;


@RestController
@RequestMapping("/Bills")
public class BillController {
@Autowired
	BillsService billService;

@RequestMapping(value= "/createBill" ,method = RequestMethod.POST)
public void createBill(BillDetails bill)	{
	billService.createBill(bill);
}


@RequestMapping(value="/updateBill", method= RequestMethod.PATCH)
public void updateBill(BillDetails bill) {
	billService.updateBill(bill);
}

@RequestMapping(value="/getBills", method= RequestMethod.GET)
public List<BillDetails> getBills(){
	
	return billService.getBills();
}
@RequestMapping(value="/deleteBill", method= RequestMethod.DELETE)
public void deleteBill(String billNo) {
	billService.deleteBill(billNo);
}

@RequestMapping(value="/getBillDetails", method= RequestMethod.GET)
public BillDetails getBillDetails(String billNo) {
	return billService.findByBillNo(billNo);
	
}

@RequestMapping(value="/getBillsFrom", method= RequestMethod.GET)
public List<BillDetails> getBillsFrom(String storeName) {
	return billService.findByStoreName(storeName);
	
}

@RequestMapping(value="/getBillsOn", method= RequestMethod.GET)
public List<BillDetails> getBillsOn(String date) {
	return billService.findByDate(date);
	
}

@RequestMapping(value="/getBillsByMonth", method= RequestMethod.GET)
public List<BillDetails> getBillsByMonth(String month) {
	return billService.getBillsByMonth(month);


}
}
