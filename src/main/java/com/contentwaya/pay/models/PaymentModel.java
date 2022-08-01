package com.contentwaya.pay.models;

import lombok.*;
import java.time.LocalDate;

@Data
public class PaymentModel{
    private int creatorId;
    private int contentId;
    private int parentId;
    private String walletId;
    private double amount;
    private String transactionRef;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}