
public class Accounts {
    
    public static void transfer(Account from, Account to, double howMuch) {
        if(from.balance() > howMuch) {
            from.withdrawal(howMuch);
            to.deposit(howMuch);
        }
    }
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account first = new Account("A", 100.0);
        Account second = new Account("B", 0.0);
        Account third = new Account("C", 0.0);
        transfer(first, second, 50.0);
        transfer(second, third, 25.0);
    }


}
