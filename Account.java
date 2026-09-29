public class Account {public int balance;

    public Account() {
        balance = 1000;
    }

    public Account(int b, int x) {
        balance = b;
    }
 public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

 class Accountrun {
    public static void main(String args[]) {
        Account a = new Account();
        a.deposit(500);
        System.out.println(a.balance);

        Account a1 = new Account(2000, 20);
        a1.withdraw(500);
        System.out.println(a1.balance);
    }
}
