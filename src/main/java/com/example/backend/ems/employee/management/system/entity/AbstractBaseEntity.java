package com.example.backend.ems.employee.management.system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.YesNoConverter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class AbstractBaseEntity implements Serializable {

    @Column(name = "RUN_ID")
    private String runIdentifier;

    @CreatedDate
    @Column(name = "CRTE_DTTM", updatable = false)
    private Instant createdDatetime;

    @CreatedBy
    @Column(name = "CRTE_BY_ID", updatable = false)
    private String createdById;

    @LastModifiedDate
    @Column(name = "UPDT_DTTM")
    private Instant updatedDatetime;

    @LastModifiedBy
    @Column(name = "UPDT_BY_ID")
    private String updatedById;

    @Convert(converter = YesNoConverter.class)
    @Column(name = "ERR_FLG_IND")
    private Boolean errorFlagIndicator;

    @Column(name = "ERR_TXT")
    public String errorText;

}
