public class Main {
    public static void main(String[] args) {
        BankAccount jonibek = new BankAccount();
        jonibek.deposit(15000);

        while (true){
            System.out.println(jonibek.getAmount());
            try {
                jonibek.withDraw(6000);
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                try {
                    jonibek.withDraw(limitException.getRemainingAmount());
                    System.out.println(jonibek.getAmount());
                }catch (LimitException A){
                    System.out.println(A.getMessage());
                }
                break;
            }
        }

    }
}