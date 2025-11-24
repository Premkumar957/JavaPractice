//Encapsulation
class Customer {
    private String name;
    private String email;
    private String phoneNumber;

    Customer(String name, String email, String phoneNumber) {
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    Customer(Customer other) {
        setName(other.name);
        setEmail(other.email);
        setPhoneNumber(other.phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Phone must be 10 Digit");
        }
        this.phoneNumber = phoneNumber;
    }

    public void showCustomerInfo() {
        System.out.println("Customer name: " + name);
        System.out.println("Customer email: " + email);
        System.out.println("Customer phonenNumber: "+ phoneNumber);
    }


}

class BankAccount {
    private String accountNumber;
    private double balance;
    private Customer owner;

    BankAccount(String accountNumber, double balance, Customer owner) {
        setAccountNumber(accountNumber);
        setBalance(balance);
        setOwner(owner);
    }

    BankAccount(BankAccount other) {
       this(other.accountNumber, other.balance, other.owner);
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        if (balance <= 0) {
            throw new IllegalArgumentException("Balance must be greater than 0");
        }
        this.balance = balance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0 || checkBalance() < amount) {
            throw new IllegalArgumentException("You cannot withdraw reason insufficient funds or your entered amount is less than 0");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);

    }

    public Customer getOwner() {
        return new Customer(owner);
    }

    public void  setOwner(Customer newOwner) {
        if (newOwner == null) {
            throw new IllegalArgumentException("owner cannot be null");
        }
        this.owner = new Customer(newOwner);
    }

    public void showAccountInfo() {
        System.out.println(getAccountNumber());
        System.out.println(checkBalance());
        owner.showCustomerInfo();
    }
}