package com.contentwaya.pay.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "wallet_id")
    private String walletId;

    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "amount")
    private double amount;

    @Column(name = "content_id")
    private int contentId;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;
}
