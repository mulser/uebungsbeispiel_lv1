public class ZinsDemo {
    String owner = "";
    double balance = 0;
    double zinsen = 0;
    int months = 0;
    public void initKonto(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double calculate(int months, double zinsen) {
        this.months = months;
        this.zinsen = zinsen;

        double zins = 0;
        for (int month = 0; month < 5; month++) {
            zins = (balance/100)*zinsen;
            System.out.println("Add for this  month: " + (zins));
            balance = balance+zins;
            System.out.println("Balance is now: "+balance);
        }
        this.balance = balance;
        return balance;
    }

    public void kontoStand() {
        System.out.println("Name: "+ this.owner);
        System.out.println("Current balance: " + this.balance);
        System.out.println("Last zinsen: " + this.zinsen);
    }
}
