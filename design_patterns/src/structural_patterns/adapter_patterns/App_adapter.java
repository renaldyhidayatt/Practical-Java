package structural_patterns.adapter_patterns;

import structural_patterns.adapter_patterns.legacy.LegacyBankAccount;

public class App_adapter {
    public static void kentang() {
        LegacyBankAccount legacyBankAccount = new LegacyBankAccount(1, "John Smith");
        PersonalInfoDB personalInfoDB = new PersonalInfoDB();
        personalInfoDB.setName("John Smith");
        personalInfoDB.setEmail("john@smith.com");
        personalInfoDB.setAmount(1000L);

        BankAccountAdapter bankAccountAdapter = new BankAccountAdapter(legacyBankAccount, personalInfoDB);

        AccountCreationService accountCreationService = new AccountCreationService(bankAccountAdapter.getID(),
                bankAccountAdapter.getName(), bankAccountAdapter.getEmail(), bankAccountAdapter.getAmount());
        accountCreationService.createAccount();

    }
}
