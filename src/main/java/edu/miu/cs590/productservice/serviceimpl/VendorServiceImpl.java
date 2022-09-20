package edu.miu.cs590.productservice.serviceimpl;

import edu.miu.cs590.productservice.dto.ProductDto;
import edu.miu.cs590.productservice.dto.VendorDto;
import edu.miu.cs590.productservice.entity.Product;
import edu.miu.cs590.productservice.entity.Vendor;
import edu.miu.cs590.productservice.mapper.ProductMapper;
import edu.miu.cs590.productservice.mapper.VendorMapper;
import edu.miu.cs590.productservice.repository.ProductRepository;
import edu.miu.cs590.productservice.repository.VendorRepository;
import edu.miu.cs590.productservice.service.ProductService;
import edu.miu.cs590.productservice.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {
    @Autowired
    VendorRepository vendorRepository;

    @Autowired
    VendorMapper vendorMapper;


    @Override
    public List<VendorDto> getAllVendors() {
        try {
            List<Vendor> products = vendorRepository.findAll();
            return vendorMapper.toVendorDtos(products);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public VendorDto getVendorById(long id) {
        return vendorMapper.toVendorDto(vendorRepository.findById(id));
    }

    @Override
    public VendorDto addVendor(VendorDto vendor) {
        return vendorMapper.toVendorDto(vendorRepository.save(vendorMapper.dtoToEntity(vendor)));
    }

    @Override
    public VendorDto updateVendor(VendorDto vendor) {
        Vendor ven = vendorMapper.dtoToEntity(vendor);
        if (ven != null) {
            return vendorMapper.toVendorDto(vendorRepository.save(ven));
        }
        return null;
    }

    @Override
    public void deleteVendor(long id) {
        vendorRepository.deleteById(id);
    }
}
