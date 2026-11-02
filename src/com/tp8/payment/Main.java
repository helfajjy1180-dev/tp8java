package com.tp8.payment;

public class Main {

	
	 public static void main(String[] args) {
	        // Test avec carte bancaire
	        PaymentProcessor cardProcessor = new CreditCardProcessor("4111-1111-1111-1111");
	        PaymentService cardService = new PaymentService(cardProcessor);
	       
	        cardService.pay(50.0);

	        System.out.println("\n" + "=".repeat(40) + "\n");

	        // Test avec virement
	        PaymentProcessor transferProcessor = new BankTransferProcessor("FR76-3000-6000-0112-3456");
	        PaymentService transferService = new PaymentService(transferProcessor);
	        transferService.pay(150.0);
}}
