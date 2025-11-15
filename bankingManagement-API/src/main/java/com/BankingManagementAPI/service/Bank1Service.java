package com.BankingManagementAPI.service;

import com.BankingManagementAPI.exception.Bank1DetailsNotFoundException;
import com.BankingManagementAPI.model.Bank1DTO;

import java.util.List;

public interface Bank1Service {
    List<Bank1DTO> getAllBanks1() throws Bank1DetailsNotFoundException;
}
