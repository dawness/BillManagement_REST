
##BillManagement System
## Overview
 This tool is for storing the details of all the bills we get from stores and to retrieve details of the bills based on a month or a date
or a store. This tool has the option to update a bill or delete a bill. This gives a general idea of expenses in a household.

## How to use it

User has the end points

1.POST    /Bills/createBill  billNo,billDate,storeName,amount     will store the bill details in the Document Bills in MongoDB

2.GET  	  /Bills/getBills						retrive all the bills from MongoDB

3.PUT	    /Bills/updateBill   Bill Details 				will update the bill based on billNo.
4.DELETE  /Bills/deleteBill	billNo				will delete the bill based on billNo.
5.GET     /Bills/getBillsFrom   storeName			get bills from that particular store
6.GET	    /Bills/getBillsOn	month				get bills on that particular month


Response will be in json format.
Used SpringBoot,MongoDB to create this restful webservice. Used POSTMAN to test the api.
 
