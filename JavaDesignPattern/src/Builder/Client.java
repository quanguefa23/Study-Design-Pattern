package Builder;

public class Client {

    public static void main(String[] args) {
        BankAccount.BankAccountBuilder newBuilder = new BankAccount.
                BankAccountBuilder("Nguyen Ha Quang", "0123456789")
                .withEmail("nhqnhq1@gmail.com")
                .wantNewsViaEmail(true);
        BankAccount newAccount = newBuilder.build();
        System.out.println(newAccount);
    }
}