package com.luckraw.stock_ms.mappers;

import com.luckraw.stock_ms.dtos.ProductDTO;
import com.luckraw.stock_ms.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO productDTO);
}
