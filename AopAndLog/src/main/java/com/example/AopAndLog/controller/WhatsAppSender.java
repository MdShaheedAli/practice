package com.example.AopAndLog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RequestMapping("/whatsapp")
@CrossOrigin("*")
@RestController
public class WhatsAppSender {

	
	@Value("${twilio.account_sid}")
    private String accountSid;

    @Value("${twilio.auth_token}")
    private String authToken;

    @Value("${twilio.whatsapp_number}")
    private String whatsappNumber;
    
    
	
	@PostMapping("/send")
	public String sayHello(@RequestBody SenderDetails senderDetails) {
		
		Twilio.init(accountSid, authToken);
		PhoneNumber to = new PhoneNumber(senderDetails.getRecipientPhoneNumber());
        PhoneNumber from = new PhoneNumber(whatsappNumber);
        Message message =Message.creator(to, from, senderDetails.getMessageBody()).create();
        System.out.println("WhatsApp message SID: " + message.getSid());
		
//		PhoneNumber to = new PhoneNumber("+"+recipientPhoneNumber);
//        PhoneNumber from = new PhoneNumber(whatsappNumber);
//        MessageCreator creator = Message.creator(to, from, messageBody);
//        creator.create();
		
		return "hello... "+senderDetails.getRecipientPhoneNumber();
	}
	
}
