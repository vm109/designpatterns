package com.designpatetrns.basepojos;

/**
 * @author yvxm035
 *
 */
public class Shop {
   private String name;
   private String location;
   private boolean sittingFacility;
  protected  Shop(){
	   
   }
public boolean isSittingFacility() {
	return sittingFacility;
}
protected  void setSittingFacility(boolean sittingFacility) {
	this.sittingFacility = sittingFacility;
}
public String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
protected void setLocation(String location) {
	this.location = location;
}

protected Shop getInstance() {
	return new Shop();
}
}
