public class j2mp_2 {
    public static void main(String[] args) {
    SavingsAccount joshua = new SavingsAccount();
    joshua.balance = 50;
    joshua.withdrawal(35.35);
        System.out.println(joshua.withdrawals);
        System.out.println(joshua.balance);
        System.out.println(joshua.deposits);
        System.out.println(joshua.active);
        System.out.println(joshua.inactive);
        joshua.withdrawal(13.14);
        System.out.println(joshua.balance);
        joshua.deposit(25.30);
        joshua.monthlyProcess();
        System.out.println(joshua.balance);
    }

}

abstract class BankAccount{
    double balance;
    int deposits;
    int withdrawals;
    double interestRate;
    double serviceCharge;

    BankAccount(){}

    public abstract void deposit(double deposits);
    public abstract void withdrawal(double withdrawals);
    public abstract void calcInterest();
    public abstract void monthlyProcess();


}

class SavingsAccount extends BankAccount{
    public boolean active;
    public boolean inactive;

    @Override
    public void deposit(double deposits) {
        if(this.balance >= 25){
            this.active = true;
            this.inactive = false;
            this.balance += deposits;
            this.deposits++;
        }else if(this.balance <= 25){
            this.active = false;
            this.inactive = true;
            if(this.balance + deposits >= 25){
                this.balance += deposits;
                System.out.println("Deposit made");
            }else {
                System.out.println("This account is inactive deposit so balance is greater than $25");
            }
        }
    }

    @Override
    public void withdrawal(double withdrawals) {
        if(this.balance >= 25){
            this.active = true;
            this.inactive = false;
            this.balance -= withdrawals;
            this.withdrawals++;
            if(this.withdrawals > 4){
                this.serviceCharge++;
            }
        }else if(this.balance <= 25){
            this.active = false;
            this.inactive = true;
            System.out.println("This account is inactive");
            this.balance -= withdrawals;
        }

    }

    @Override
    public void calcInterest() {
        this.interestRate = .30;
        double monthlyRate = this.interestRate/12;
        double monthInterest = this.balance * monthlyRate;
        this.balance = this.balance + monthInterest;

    }

    @Override
    public void monthlyProcess() {
        if(this.withdrawals > 4) {
            this.serviceCharge = 1;
        }
           if(this.balance >= 25){
               this.active = true;
               this.inactive = false;
               this.balance -= this.serviceCharge;
               calcInterest();
               this.withdrawals = 0;
               this.deposits = 0;
               this.serviceCharge = 0;
           }else if(this.balance <= 25){
               this.active = false;
               this.inactive = true;
               System.out.println("Account is inactive");
           }


    }
}
