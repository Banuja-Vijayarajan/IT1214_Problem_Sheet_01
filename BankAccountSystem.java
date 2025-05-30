public class BankAccountSystem {


    static class BankAccount {
        private int accountNumber;
        private String accountHolder;
        private double balance;

        public BankAccount(int accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }


        public String toString() {
            return "Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + balance;
        }
    }

    
    static class Bank {
        private BankAccount[] accounts = new BankAccount[5];
        private int count = 0;

        public void addAccount(BankAccount account) {
            if (count < accounts.length) {
                accounts[count++] = account;
            } else {
                System.out.println("Bank is at full capacity.");
            }
        }

        
            System.out.println("Account not found: " + accountNumber);
        }

       
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));

        bank.withdrawFromAccount(1001, 6000.0); 
        bank.withdrawFromAccount(1002, 1000.0); 

        bank.displayAccounts();
    }
}
