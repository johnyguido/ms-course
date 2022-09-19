package com.johny.hrpayroll.resources;

import com.johny.hrpayroll.entities.Payment;
import com.johny.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{id}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id, @PathVariable Integer days){
        Payment payment = paymentService.getPayment(id, days);
        return ResponseEntity.ok(payment);
    }

}
