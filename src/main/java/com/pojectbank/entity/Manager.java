package com.pojectbank.entity;

import com.pojectbank.entity.enums.ManagerStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manager")
public class Manager {
    @Id
    @Column(name = "manager_id")
    private UUID id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ManagerStatus status;
    @Column(name = "created_at")
    private String createdAt;
    @Column(name = "update_at")
    private String updateAt;

    @OneToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "manager_id")
    private Account account;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return id == manager.id&& status == manager.status && Objects.equals(firstName, manager.firstName)
                && Objects.equals(lastName, manager.lastName) && Objects.equals(createdAt, manager.createdAt) && Objects.equals(updateAt, manager.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, createdAt, updateAt);
    }
}
