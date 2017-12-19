package com.desigpatterns.creation.interfaces;

import java.util.Set;

public interface PriceCatalog {

  double sayThePriceOfProduct(String productName);
  Set<String> getAllTheProductnames();
  void maintainProductCatalog(String productName, double productPrice) ;
  
}
