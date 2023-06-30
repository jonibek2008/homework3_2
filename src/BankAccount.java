public class BankAccount {
    private double amount;
    public double getAmount(){
        return amount;
    }
    public void deposit (double sum) {
        this.amount += sum;
    }
    public void withDraw(double sum ) throws LimitException{
        if (sum > this.amount){
            throw new LimitException("У вас на счёту не достаточно денег.Будет снято остаток. Вас счёт :" + amount,amount);
        }
        this.amount -= sum;
        System.out.println("Успешно снято");
    }
}
