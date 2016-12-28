package com.java.test;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

public class TestAWSSNS {
	public static void main(String[] args) {
		AmazonSNSClient snsClient = new AmazonSNSClient();
		String message = "My SMS message";
		String phoneNumber = "+1XXX5550100";
		Map<String, MessageAttributeValue> smsAttributes = new HashMap<String, MessageAttributeValue>();
		// <set SMS attributes>
		//sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
	}
	/**
	public static void sendSMSMessage(AmazonSNSClient snsClient, String message, String phoneNumber,
			Map<String, MessageAttributeValue> smsAttributes) {
		PublishResult result = snsClient.publish(new PublishRequest().withMessage("Hi").withPhoneNumber(phoneNumber)
				.withMessageAttributes(smsAttributes));
		System.out.println(result.getMessageId()); // Prints the message ID.
	}
	*/
}
