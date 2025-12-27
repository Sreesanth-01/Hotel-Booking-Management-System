package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Payment;
import com.examly.springapp.repository.PaymentRepo;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    public Payment addPayment(Payment payment) {
        return paymentRepo.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepo.findAll();
    }

    public Payment getPaymentById(int id) {
        return paymentRepo.findById(id).orElse(null);
    }
}
