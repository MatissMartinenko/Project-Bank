package com.projectbank.entity;

import com.projectbank.entity.enums.UserStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private UUID id;

    @ManyToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    private Manager manager;
    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private UserStatus status;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updateAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(taxCode, user.taxCode) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taxCode, email);
    }
}
