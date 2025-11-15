package com.BankingManagementAPI.model;

import lombok.Getter;
import lombok.Setter;

//Model package created to hold DTO classes for data transfer, separating them from entity classes.
//Transfering the data from service to controller in form of TO(Transfer Object) or DTO(Data Transfer Object).
@Getter
@Setter
public class Bank1DTO {
     Integer bankCode; // changed to Integer
     String bankName;
    String bankAddress;
}
