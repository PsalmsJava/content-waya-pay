package com.contentwaya.pay.utilities;

import com.contentwaya.pay.entities.Wallet;
import com.contentwaya.pay.repositories.WalletRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class DatabaseMockUp implements CommandLineRunner {

    private WalletRepository walletRepository;

    public DatabaseMockUp(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Wallet> mockWallets = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Wallet wallet = new Wallet();
            wallet.setWalletId(Helper.generateRandomWalletID(6));
            wallet.setContentId(Helper.generateRandom());
            wallet.setAmount(Helper.generateRandomAmount());
            wallet.setParentId(i + Helper.generateRandom());
            wallet.setCreatedAt(LocalDate.now());
            wallet.setUpdatedAt(LocalDate.now());
            mockWallets.add(wallet);
        }

        walletRepository.saveAll(mockWallets);
        log.info("Database Created");
    }
}
