PaymentsApi.PUBLIC_KEY = "YOUR_PUBLIC_API_KEY";
PaymentsApi.PRIVATE_KEY = "YOUR_PRIVATE_API_KEY";
 
Payment payment = Payment.create(new PaymentsMap()
        .set("amount", 1000)
        .set("currency", "USD")
        .set("description", "payment description")
        .set("reference", "7a6ef6be31")
        .set("token", "[TOKEN ID]")
);
 
if ("APPROVED".equals(payment.get("paymentStatus"))) {
    System.out.println("Payment approved");
}