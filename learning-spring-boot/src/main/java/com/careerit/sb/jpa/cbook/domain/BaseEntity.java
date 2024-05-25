package com.careerit.sb.jpa.cbook.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Column(name = "created_date",nullable = false,updatable = false)
    private LocalDateTime createdDate;
    @Column(name = "updated_date",nullable = false)
    private LocalDateTime updatedDate;
    @Column(name = "created_by",nullable = false,updatable = false)
    private String createdBy;
    @Column(name = "updated_by",nullable = false)
    private String updatedBy;

    @Column(name = "deleted",nullable = false)
    private boolean deleted;

    @PrePersist
    public void onPersist() {
        this.createdDate = LocalDateTime.now(ZoneOffset.UTC);
        this.updatedDate = LocalDateTime.now(ZoneOffset.UTC);
        this.createdBy = "system";
        this.updatedBy = "system";
    }

    @PreUpdate
    public void onUpdate() {
        this.updatedDate = LocalDateTime.now(ZoneOffset.UTC);
        this.updatedBy = "system";
    }


}
