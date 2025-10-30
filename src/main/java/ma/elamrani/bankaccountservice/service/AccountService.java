package ma.elamrani.bankaccountservice.service;

import ma.elamrani.bankaccountservice.dto.BankAccountRequestDTO;
import ma.elamrani.bankaccountservice.dto.BankAccountResponseDTO;
import ma.elamrani.bankaccountservice.entities.BankAccount;

public interface AccountService {

    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
