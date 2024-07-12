package com.luckraw.stock_ms.services;

import com.luckraw.stock_ms.dtos.TransactionDTO;
import com.luckraw.stock_ms.entities.Transaction;
import com.luckraw.stock_ms.exceptions.ResourceNotFoundException;
import com.luckraw.stock_ms.mappers.TransactionMapper;
import com.luckraw.stock_ms.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public TransactionService(TransactionRepository transactionRepository, TransactionMapper transactionMapper) {
        this.transactionRepository = transactionRepository;
        this.transactionMapper = transactionMapper;
    }

    public TransactionDTO saveTransaction(TransactionDTO transactionDTO) {
        Transaction transaction = transactionMapper.toEntity(transactionDTO);
        Transaction savedTransaction = transactionRepository.save(transaction);
        return transactionMapper.toDTO(savedTransaction);
    }

    public List<TransactionDTO> getAllTransactions() {
        return transactionRepository.findAll().stream()
                .map(transactionMapper::toDTO)
                .collect(Collectors.toList());
    }

    public TransactionDTO getTransactionById(Long id) throws ResourceNotFoundException {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Transaction not found"));
        return transactionMapper.toDTO(transaction);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}
