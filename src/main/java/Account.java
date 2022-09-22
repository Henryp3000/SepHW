public class Account {


    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    if (balance<=0){
        System.out.println(" A negative balance");

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account () {
        balance =1000;
    }


}
