package CodeAcademy.Access_Encapsulation_Scope;

public class MainBank {
    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.getAccountOne().getBalance());
        bankOfGods.getAccountOne().setBalance(5000);
        System.out.println(bankOfGods.getAccountOne().getBalance());
        System.out.println(bankOfGods.getAccountOne().calculateNextMonthInterest());
    }
}
