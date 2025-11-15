package com.BankingManagementAPI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity // To map with the db table.
@Table(name="Bank1_TBL") // to tell which table to map with which entity.
//If table name and entity name both are same than @Table not required.

public class Bank1 {

    @Id // for primary key. (Foreign Key )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank1_code_seq")
    //for auto increment = @GeneratedValue, GenerationType have
    //1)Identity = whenever we insert the record automatically it will inc the record.
    //2) Sequence = If table is supporting the sequence than use it ex - postgreSQL.
    //3) Table = Based upon table if we want to inc the value than we go for it.
    //4) Uid =Throud universal identity number, it will auto inc the no.
    //5) Auto = depends upon the presistance provider ex for persistance are: hibernate
    // now mention the generator name which we have generated in down line.

    @SequenceGenerator(name = "bank1_code_seq", sequenceName = "bank1_code_sequence", allocationSize = 1)
    //provide the unique sequence name in @SequenceGenerator and in sequenceName= provide the sequence name provide in db.
    // allocation Size mean it is increment by 1. Therefore allocation size in prog. and increment size in db sequence should match.

    @Column(name="Bank_Code")
    private Integer bankCode; // changed to Integer

    @Column(name="Bank_Name")
    private String bankName;

    @Column(name = "Bank_Address")
    private String bankAddress;

    @OneToMany(mappedBy = "bank1")
    private Set<Branch1> branch1;

}
