
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    private Map<String, Account> accounts;

    public AccountRepository() {
        accounts = new HashMap<>();

        // static data to start with
        accounts.put("123456", new Account("123456", "1234", 1000.0));
        accounts.put("123456", new Account("654321", "0000", 1560.0));
    }

    public Account findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean authenticate(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account != null && account.getPin().equals(pin);
    }
}