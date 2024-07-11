package com.luckraw.stock_ms.repositories;

import com.luckraw.stock_ms.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByProductId(Long productId);
}
