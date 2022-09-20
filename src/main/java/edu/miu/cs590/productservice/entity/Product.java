package edu.miu.cs590.productservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;
    private String units;
    private String addressId;
    private String description;
    private String image;
    private String price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;



}
