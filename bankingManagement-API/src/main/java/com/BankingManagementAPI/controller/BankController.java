package com.BankingManagementAPI.controller;


import com.BankingManagementAPI.exception.Bank1DetailsNotFoundException;
import com.BankingManagementAPI.model.Bank1DTO;
import com.BankingManagementAPI.service.Bank1Service;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api/v1/banks")
public class BankController {

    @Autowired
    private Bank1Service bank1Service;

    //http://localhost:9092/api/v1/banks    GET
    @GetMapping
    public ResponseEntity<List<Bank1DTO>> getAllBanks1() {
        log.info("Fetching all banks");
        List<Bank1DTO> bank1DTO = null;

        try{
            bank1DTO = bank1Service.getAllBanks1();
            log.info("Successfully fetched all banks");
        } catch (Bank1DetailsNotFoundException ex) {
            log.error("Bank details not found: {}", ex.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            log.error("Error fetching banks: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            log.error("Error fetching banks: {}",e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(bank1DTO, HttpStatus.OK);
    }


}
