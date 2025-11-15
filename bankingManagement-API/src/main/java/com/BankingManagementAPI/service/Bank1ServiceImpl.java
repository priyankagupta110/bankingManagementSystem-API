package com.BankingManagementAPI.service;

import com.BankingManagementAPI.entity.Bank1;
import com.BankingManagementAPI.exception.Bank1DetailsNotFoundException;
import com.BankingManagementAPI.model.Bank1DTO;
import com.BankingManagementAPI.repository.Bank1Repository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // for service layer - bean creation

public class Bank1ServiceImpl implements Bank1Service{

    private static final Log log = LogFactory.getLog(Bank1ServiceImpl.class);
    @Autowired//Injecting bankRepository

    public Bank1Repository bank1Repository;
    //Injecting the Bank1Repository in Bank1Serviceimpl.

    public Bank1ServiceImpl(Bank1Repository bank1Repository) {
        this.bank1Repository = bank1Repository;
    }

    @Override
    public List<Bank1DTO> getAllBanks1() throws Bank1DetailsNotFoundException {
        log.info("BankServiceImpl.getAllBanks1: Fetching all bank details.");
        List<Bank1> bank1 = bank1Repository.findAll();
        if (bank1.isEmpty()) {
            log.info("BankServicImpl.getAllBanks: No bank details found.");
            throw new Bank1DetailsNotFoundException("No bank details found.");
        }

        log.info("Bank1ServiceImpl.getAllBanks: Successfully fetched bank details.");
        return bank1DTO;1

    }