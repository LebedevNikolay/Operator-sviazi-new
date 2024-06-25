public class Main {
    public static void main(String[] args) {
        int score = 2;// Основной счет клиента.
        int bonusAccount = 1500; //счет клиента для накопления бонусов.

        int bonus;

        if (bonusAccount > 1000) {
            bonus = bonusAccount / 100; //формула подсчета бонусных рублей за каждые внесенные 100р.
        } else {
            bonus = 0;
        }
        int balance = score + bonusAccount + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }

}
