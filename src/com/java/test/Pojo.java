package com.java.test;

import org.codehaus.jackson.annotate.JsonProperty;

public class Pojo {
	
    private String		 lob;
    private String		 mob_merchant_id;
    
	public String getLob() {
		return lob;
	}
	public void setLob(String lob) {
		this.lob = lob;
	}
	
	public String getMobMerchantId() {
		return mob_merchant_id;
	}
	@JsonProperty("mob_merchant_id")
	public void setMobMerchantId(String mob_merchant_id) {
		this.mob_merchant_id = mob_merchant_id;
	}
    
    

}
