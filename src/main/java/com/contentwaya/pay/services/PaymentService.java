package com.contentwaya.pay.services;

import com.contentwaya.pay.entities.Wallet;
import com.contentwaya.pay.models.PaymentModel;
import com.contentwaya.pay.repositories.WalletRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PaymentService {
    private static WalletRepository walletRepository;

    private static final String CLIENT_WALLET_ID = "12AD2G";

    public PaymentService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public static ResponseEntity<?> processPayment(PaymentModel paymentModel) {
        Wallet creatorWallet = walletRepository.findByWalletId(paymentModel.getWalletId());
        creatorWallet.setAmount(paymentModel.getAmount() * 0.85);
        creatorWallet.setUpdatedAt(LocalDate.now());
        walletRepository.saveAndFlush(creatorWallet);

        Wallet parentWallet = walletRepository.findByParentId(creatorWallet.getParentId());
        parentWallet.setAmount(paymentModel.getAmount() * 0.1);
        parentWallet.setUpdatedAt(LocalDate.now());
        walletRepository.saveAndFlush(parentWallet);


        return ResponseEntity.ok("Transaction Successful");
    }
}
