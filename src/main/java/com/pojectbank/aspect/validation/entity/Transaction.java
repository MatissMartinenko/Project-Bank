package com.pojectbank.aspect.validation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
class Transaction {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "transaction_id")
    private UUID id;
    @ManyToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "debit_account_id", referencedColumnName = "account_id")
    private Account debitAccount;
    @ManyToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_account_id", referencedColumnName = "account_id")
    private Account creditAccount;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private int type; //
    @Column(name = "amount")
    private double amount;
    @Column(name = "description")
    private LocalDateTime description;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(amount, that.amount) == 0 && Objects.equals(id, that.id) && Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, createdAt);
    }

}
