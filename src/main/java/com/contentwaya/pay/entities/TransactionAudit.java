package com.contentwaya.pay.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "transaction_audit")
public class TransactionAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "payment_id", nullable = false)
    private int paymentId;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "percentage", nullable = false)
    private double percentage;

    @Column(name = "wallet_id", nullable = false)
    private String walletId;

    @Column(name = "created_at", nullable = false)
    private int createdAt;

    @Column(name = "updated_at", nullable = false)
    private int updatedAt;
}
