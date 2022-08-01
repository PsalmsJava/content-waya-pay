package com.contentwaya.pay.models;

import lombok.*;
import java.time.LocalDate;

@Data
public class WalletModel {
    private int id;
    private int creatorId;
    private int contentId;
    private String walletId;
    private double amount;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
