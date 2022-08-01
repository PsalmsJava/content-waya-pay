package com.contentwaya.pay.repositories;

import com.contentwaya.pay.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Long> {
    Wallet findByWalletId(String walletId);

    Wallet findByParentId(int parentId);
}
