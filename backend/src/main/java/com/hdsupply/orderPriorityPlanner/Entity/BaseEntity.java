package com.hdsupply.orderPriorityPlanner.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor 
@AllArgsConstructor 
@MappedSuperclass 
@Data 
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp 
    private LocalDateTime createdAt;
    @UpdateTimestamp 
    private LocalDateTime updatedAt;
 

    // @PrePersist 
    // void created() { 

    //     this.updatedAt = LocalDateTime.now();
    //     this.createdAt = LocalDateTime.now();

    // }

    // @PreUpdate
    // void updated() {
    //     updatedAt = LocalDateTime.now();

    // }

}
