public class Main {
    public static void main(String[] args) {
        int balance = 100; //начальный баланс клиента
        int add = 1500; //переменная для суммы пополнения
        int newBalance; //переменная для итогового баланса
        int cashback; //переменная для бонусов

        if (add > 1000) {
            cashback = add / 100;
            newBalance = balance + add + cashback;
        } else {
            cashback = 0;
            newBalance = balance + add;
        }
        System.out.println("Кэшбек:" + cashback);
        System.out.println("Ваш баланс:" + newBalance);
    }
}
