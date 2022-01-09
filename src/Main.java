public class Main {
    public static void main(String[] args) {

        int startAccount = 100;
        int amountUp = 1100;
        int bonus = amountUp / 100;
        int totalSum = startAccount + amountUp;

        if (amountUp > 1000) {
            System.out.println("Итоговая сумма на счету клиента - " + (totalSum + bonus) + " руб.");
            System.out.println("Бонус равен - " + bonus + " руб.");
        } else {
            System.out.println("Итоговая сумма на счету клиента - " + totalSum + " руб.");
        }

    }
}
