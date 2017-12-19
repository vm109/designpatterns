package com.designpatetrns.creation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.desigpatterns.creation.interfaces.PriceCatalog;

public class PriceCatalogImpl implements PriceCatalog{
	private static Map<String,Double> catalogMap = new HashMap<>();
	private static PriceCatalog pricecatalog = null;
	private  PriceCatalogImpl() {
		
	}
	public static synchronized PriceCatalog getInstance() {
		if(pricecatalog!=null) {
			return pricecatalog;
		}
		else
		{
			synchronized (catalogMap) {
				if(pricecatalog!=null)
					return pricecatalog;
				else
					return new PriceCatalogImpl();
			}
		}
			
	}
	@Override
	public double sayThePriceOfProduct(String productName) {
		return catalogMap.get(productName);
	}
	@Override
   public Set<String> getAllTheProductnames() {
	   return catalogMap.keySet();
   }
   @Override
   public void maintainProductCatalog(String productName, double productPrice) {
	   catalogMap.put(productName,productPrice);
   }

}
