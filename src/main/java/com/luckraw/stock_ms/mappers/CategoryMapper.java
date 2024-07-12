package com.luckraw.stock_ms.mappers;

import com.luckraw.stock_ms.dtos.CategoryDTO;
import com.luckraw.stock_ms.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO toDTO(Category category);
    Category toEntity(CategoryDTO categoryDTO);
}
