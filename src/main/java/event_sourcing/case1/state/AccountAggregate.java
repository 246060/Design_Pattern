package event_sourcing.case1.state;

import event_sourcing.case1.domain.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * This is the static accounts map holder class. This class holds the state of the accounts.
 */
public class AccountAggregate {

  private static Map<Integer, Account> accounts = new HashMap<>();

  private AccountAggregate() {
  }

  public static void putAccount(Account account) {
    accounts.put(account.getAccountNo(), account);
  }

  public static Account getAccount(int accountNo) {
    return Optional.of(accountNo)
        .map(accounts::get)
        .map(Account::copy)
        .orElse(null);
  }

  public static void resetState() {
    accounts = new HashMap<>();
  }
}
