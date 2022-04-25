package bankapp1;

public class Account {
    int balance;
    int amount;
    String customerName;
    String customerId;
    boolean valueSet;

    Account() {}
    Account(int b) {
        this.balance = b;
    }

    public synchronized void deposit(int amount) {
        while(valueSet) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }

        if(getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to deposit $ " + amount);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex) { }
            this.amount = amount;
            setBalance(getBalance()+amount);
            display();
            System.out.println(Thread.currentThread().getName() + " completes the deposit of $ " + amount);
        }
        else {
            System.out.println("Not enought in account for " + Thread.currentThread().getName()
                                + " to withdraw " + getBalance());
        }

        valueSet = true;
        notify();
    }

    public synchronized int withdraw() {
        while(!valueSet) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }

        if(amount != 0) {
            System.out.println("Going to withdraw $: " + amount);
            balance -= amount;
            setBalance(balance);
            display();
        }
        valueSet = false;
        notify();
        return amount;
    }

    public synchronized void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    synchronized void display() {
        System.out.println("So du tai khoan la: "+ balance);
    }
}
