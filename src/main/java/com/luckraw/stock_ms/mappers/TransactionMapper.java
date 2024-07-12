package com.luckraw.stock_ms.mappers;

import com.luckraw.stock_ms.dtos.TransactionDTO;
import com.luckraw.stock_ms.entities.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    TransactionDTO toDTO(Transaction transaction);
    Transaction toEntity(TransactionDTO transactionDTO);
}
