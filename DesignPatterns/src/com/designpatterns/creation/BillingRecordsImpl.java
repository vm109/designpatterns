package com.designpatterns.creation;

import java.util.HashMap;
import java.util.Map;

import com.desigpatterns.creation.interfaces.BillingRecords;

/* 
 * Billing design Patterns
 */
public class BillingRecordsImpl implements BillingRecords{
    
	private static BillingRecords billingRecords= null;
	Map <String,Boolean> billingRecordsDataMap = new HashMap<>();

	private  BillingRecordsImpl() {
		
	}
	
	public static synchronized BillingRecords getInstance() {
		if(billingRecords!=null) {
			return null;
		}
		else
			synchronized (billingRecords) {
				if(billingRecords!=null)
				return new BillingRecordsImpl();
				else
					return billingRecords;
			}
			
	}
	@Override
	public void saveCustomerId(String customerId) {
		this.billingRecordsDataMap.put(customerId, true);
	}

	@Override
	public boolean didCustomerPaidBill(String customerId) {
		return this.billingRecordsDataMap.get(customerId);
		
	}
	
	
}
