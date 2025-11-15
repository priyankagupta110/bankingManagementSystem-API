package com.BankingManagementAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="Customer1_TBL")
public class Customer1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer1_id_seq")
    @SequenceGenerator(name = "customer1_id_seq", sequenceName = "customer1_id_sequence", allocationSize = 1)
    @Column(name="Cust_ID")
    private Integer customerId; // changed to Integer to avoid default 0 being used as FK

    @Column(name="Cust_Name")
    private String customerName;

    @Column(name="Cust_Phone")
    private int customerPhone;

    @Column(name="Cust_Address")
    private String customerAddress;

    @OneToMany(mappedBy = "customer1")
    private Set<Account1> account1;

    @OneToMany(mappedBy = "customer1")
    private Set<Loan1> loan1;

}
