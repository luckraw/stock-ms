package com.luckraw.stock_ms.mappers;

import com.luckraw.stock_ms.dtos.SupplierDTO;
import com.luckraw.stock_ms.entities.Supplier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    SupplierDTO toDTO(Supplier supplier);
    Supplier toEntity(SupplierDTO supplierDTO);
}
