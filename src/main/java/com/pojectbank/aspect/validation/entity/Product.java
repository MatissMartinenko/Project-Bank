package com.pojectbank.aspect.validation.entity;

import com.pojectbank.aspect.validation.entity.enums.CurrencyCode;
import com.pojectbank.aspect.validation.entity.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;
    @JoinColumn(name = "manager_id")
    private int managerID;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ProductStatus status;
    @Column(name = "currency_code")
    @Enumerated
    private CurrencyCode currencyCode;
    @Column(name = "interest_rate")
    private double interestRate;
    @Column(name = "limit")
    private double limit;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @ManyToMany(mappedBy = "products")
    private List<Account> accounts = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, interestRate, limit, createdAt, updateAt);
    }
}
