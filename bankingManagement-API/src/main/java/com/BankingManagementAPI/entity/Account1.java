package com.BankingManagementAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Account1_TBL")
public class Account1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account1_id_seq")
    @SequenceGenerator(name = "account1_id_seq", sequenceName = "account1_id_sequence", allocationSize = 1)
    @Column(name="Account_Number")
    private Integer accountNumber; // use Integer to avoid default 0

    @Column(name="Account_Type")
    private String accountType;

    @Column(name="Account_Balance")
    private double accountBalance;

    @ManyToOne
    @JoinColumn(name ="Cust_ID")
    private Customer1 customer1;

    @ManyToOne
    @JoinColumn(name = "Branch_ID")
    private Branch1 branch1;

}
