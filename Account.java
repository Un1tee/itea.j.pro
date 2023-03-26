package Lesson9_tasks;
import java.util.Date;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    static class Operation {
        private String type;
        private double amount;
        private double balance;
        private Date date;

        public Operation(String type, double amount, double balance) {
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            this.date = new Date();
        }

        public String getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }

        public double getBalance() {
            return balance;
        }

        public Date getDate() {
            return date;
        }
    }
}