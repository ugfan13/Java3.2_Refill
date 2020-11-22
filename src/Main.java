public class Main {
    public static void main(String[] args) {
        int percent;
        int payment = 2000;
        int refill = 1_000;
        if (payment >= refill) {
            percent = 1;
            }
        else {
            percent = 0;
        }

        int startaccount = 100;
        int bonus = payment * percent /100;
        int account = startaccount + payment + bonus;
        System.out.println(bonus);
        System.out.println(account);
    }
}
