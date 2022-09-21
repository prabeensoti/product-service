package edu.miu.cs590.productservice.controller;

import edu.miu.cs590.productservice.dto.VendorDto;
import edu.miu.cs590.productservice.entity.Vendor;
import edu.miu.cs590.productservice.service.VendorService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    @Autowired
    VendorService vendorService;

    @GetMapping
    public List<VendorDto> getAllVendors(){
        return vendorService.getAllVendors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendorDto> getVendorById(@PathVariable("id") long id){
        return new ResponseEntity<>(vendorService.getVendorById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VendorDto> addVendor(@RequestBody VendorDto vendor){
        return new ResponseEntity<>(vendorService.addVendor(vendor),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<VendorDto> updateVendor(@RequestBody VendorDto vendor) {
        return new ResponseEntity<>(vendorService.updateVendor(vendor),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Vendor> deleteById(@PathVariable("id") long id){
        vendorService.deleteVendor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
