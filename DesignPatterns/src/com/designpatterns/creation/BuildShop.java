package com.designpatterns.creation;

import com.designpatterns.basepojos.Shop;

/* 
 * How do you build a shop with its attributes ?
 */
public class BuildShop extends Shop{
 
	Shop shop;
	
	public BuildShop(){
			this.shop = this;
	}
	public BuildShop withLocation(String location) {
		if(this.shop!=null) {
		setLocation(location);
		}
		return  (BuildShop) shop;
	}
	
	public  BuildShop withName(String name) {
		setName(name);
		return (BuildShop) shop;
	}
	
	public BuildShop withSittingType(boolean hasSitting) {
		setSittingFacility(hasSitting);
		return (BuildShop) shop;
	}
	
}
