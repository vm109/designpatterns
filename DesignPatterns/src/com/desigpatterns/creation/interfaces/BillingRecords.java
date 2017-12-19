package com.desigpatterns.creation.interfaces;

public interface BillingRecords {
  void saveCustomerId(String customerId);
  
  boolean didCustomerPaidBill(String customerId);
}
