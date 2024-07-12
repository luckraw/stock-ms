package com.luckraw.stock_ms.services;

import com.luckraw.stock_ms.dtos.SupplierDTO;
import com.luckraw.stock_ms.entities.Supplier;
import com.luckraw.stock_ms.exceptions.ResourceNotFoundException;
import com.luckraw.stock_ms.mappers.SupplierMapper;
import com.luckraw.stock_ms.repositories.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;
    private final SupplierMapper supplierMapper;

    public SupplierService(SupplierRepository supplierRepository, SupplierMapper supplierMapper) {
        this.supplierRepository = supplierRepository;
        this.supplierMapper = supplierMapper;
    }

    public SupplierDTO saveSupplier(SupplierDTO supplierDTO) {
        Supplier supplier = supplierMapper.toEntity(supplierDTO);
        Supplier savedSupplier = supplierRepository.save(supplier);
        return supplierMapper.toDTO(savedSupplier);
    }

    public List<SupplierDTO> getAllSuppliers() {
        return supplierRepository.findAll().stream()
                .map(supplierMapper::toDTO)
                .collect(Collectors.toList());
    }

    public SupplierDTO getSupplierById(Long id) throws ResourceNotFoundException {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Supplier not found"));
        return supplierMapper.toDTO(supplier);
    }

    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
