public class Main {
    public static void main(String[] args) {

        int startAccount = 100;
        int amountUp = 1200;
        int bonus = amountUp / 100;
        int totalSum = startAccount + amountUp;
        boolean startBonus = amountUp > 1000;

        if (startBonus) {
            int finalBill = totalSum + bonus;
            System.out.println("Итоговая сумма на счету клиента - " + (finalBill) + " руб.");
            System.out.println("Бонус равен - " + bonus + " руб.");
        } else {
            int finalBill = totalSum;
            System.out.println("Итоговая сумма на счету клиента - " + (finalBill) + " руб.");
        }

    }
}
