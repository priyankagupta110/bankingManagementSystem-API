package com.BankingManagementAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Loan1_TBL")
public class Loan1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loan1_id_seq")
    @SequenceGenerator(name = "loan1_id_seq", sequenceName = "loan1_id_sequence", allocationSize = 1)
    @Column(name="Loan_ID")
    private Integer loanId; // changed to Integer

    @Column(name="Loan_Type")
    private String loanType;

    @Column(name="Loan_Amount")
    private int loanAmount;

    @ManyToOne
    @JoinColumn(name="Branch_ID")
    private Branch1 branch1;

    @ManyToOne
    @JoinColumn(name = "Cust_ID")
    private Customer1 customer1;

}
