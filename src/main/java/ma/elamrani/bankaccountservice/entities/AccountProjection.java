package ma.elamrani.bankaccountservice.entities;

import ma.elamrani.bankaccountservice.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {

    String getId();
    AccountType getType();
    Double getBalance();
}
