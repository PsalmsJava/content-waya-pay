package com.contentwaya.pay.viewmodels;


import com.contentwaya.pay.models.PaymentModel;
import com.contentwaya.pay.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api")
public class PaymentViewModel {
    private PaymentService paymentService;

    @Autowired
    public PaymentViewModel(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process-payment")
    public ResponseEntity<?> processPayment(@RequestBody PaymentModel paymentModel){
        System.out.println(paymentModel);
        return PaymentService.processPayment(paymentModel);
    }
}
