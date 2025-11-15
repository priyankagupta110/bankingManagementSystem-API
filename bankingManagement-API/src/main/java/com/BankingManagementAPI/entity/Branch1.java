package com.BankingManagementAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table(name="Branch1_TBL")
public class Branch1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch1_id_seq" )
    @SequenceGenerator(name="branch1_id_seq", sequenceName = "branch1_id_sequence", allocationSize = 1)

    @Column(name="Branch_ID")
    private Integer branchId; // changed to Integer

    @Column(name="Branch_Name")
    private String branchName;

    @Column(name="Branch_Address")
    private String branchAddress;

    @ManyToOne
    @JoinColumn(name = "Bank_Code")
    private Bank1 bank1;

    @OneToMany(mappedBy = "branch1")
    private Set<Loan1> loan1;

    @OneToMany(mappedBy = "branch1")
    private Set<Account1> account1;

}
