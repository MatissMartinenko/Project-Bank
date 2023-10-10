package com.pojectbank.aspect.validation.entity;

import com.pojectbank.aspect.validation.entity.enums.AccountStatus;
import com.pojectbank.aspect.validation.entity.enums.CurrencyCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    @Enumerated
    private AccessType type;
    @Column(name = "account_status")
    @Enumerated(EnumType.STRING)
    public AccountStatus accountStatus;
    @Column(name = "balance")
    private double balance;
    @Column(name = "currency_code")
    @Enumerated
    private CurrencyCode currencyCode;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;


    @ManyToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private User user;


    @OneToMany
    private List<Agreement> agreements;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(name, account.name) && Objects.equals(createdAt, account.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createdAt);
    }
}