package com.java.test;

public enum ErrorCode {

	PROMOCODE_SUCCESS(0, true),
    INVALID_PROMOCODE(11100, false);
	
	final int            errorNumber;
    final Boolean        callStatus;
    String 		 errorMessage;
    
    private ErrorCode(int errorNumber, Boolean callStatus) {
        this.errorNumber = errorNumber;
        this.callStatus = callStatus;
    }
    
    public int getErrorNumber() {
        return this.errorNumber;
    }

    public String getErrorNumberString() {
        return Integer.toString(this.errorNumber);
    }

    public String getErrorMessage() {
		return errorMessage;
	}
    
	public void setErrorMessage( String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
