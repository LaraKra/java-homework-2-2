public class Main {
    public static void main(String[] args) {
        float startAccount = 100;
        float amountUp = 1200;
        int bonus;
        if (amountUp > 1000) {
            System.out.println("Бонус равен - " + (bonus = (int) amountUp / 100) + " руб.");
            System.out.println("Итоговая сумма на счету клиента - " + (startAccount = bonus + amountUp + startAccount) + " руб.");
        }
        if (amountUp < 1000) {
            System.out.println(bonus = 0);
            System.out.println("Итоговая сумма на счету клиента - " + (startAccount = startAccount + amountUp) + " руб.");
        }

    }
}
