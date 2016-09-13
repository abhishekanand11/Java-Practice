package com.java.test;

public class ErrorCodeTest {

	public static void main(String[] args) throws AException {
		// TODO Auto-generated method stub
		ErrorCode ec = getErrorCode();
		try{
			getException(ec);
		}
		catch(AException ae){
			System.out.println("The exception error code and message is : "
			+ ae.getErrorCode().getErrorMessage());
		}
	}
	
	public static ErrorCode getErrorCode(){
		ErrorCode x;
		x = ErrorCode.INVALID_PROMOCODE;
		x.setErrorMessage("Invalid Promo Code");
		return x;
	}
	
	public static AException getException(ErrorCode  ec) throws AException{
		throw new AException(ec);
	}

}
