package com.BankingManagementAPI.exception;

public class Bank1DetailsNotFoundException extends Exception {

    public Bank1DetailsNotFoundException(String message) {
        super(message);
    }

    public Bank1DetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
