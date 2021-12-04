package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int money;
        Scanner input = new Scanner(System.in);
        FurnitureShop Alevtina = new FurnitureShop(){};
        System.out.println("Добро пожаловать в наш мебельный магазин Алевтина! Магазин, в котором каждый товар имеет не только имя, но и душу!");
        do {
            System.out.println("Пожалуйста, введите, сколько средств Вы готовы у нас потратить (в рублях): ");
            money = input.nextInt();
            if (money <= 0) { System.out.println("Кажется, Вы не заинтересованы в покупке. Возвращайтесь, когда Вы не будете нищебродом!");
            };
        } while (money <= 0);

        System.out.println("Прекрасно! Представляем наш ассортимент:" + "\n" +
                "1." + Alevtina.chair1.getTitul() + " "+ Alevtina.chair1.getName()+"\n" +
                "2." + Alevtina.chair2.getTitul() + " "+ Alevtina.chair2.getName()+"\n" +
                "3." + Alevtina.sofa1.getTitul() + " "+ Alevtina.sofa1.getName()+"\n" +
                "4." + Alevtina.sofa2.getTitul() + " "+ Alevtina.sofa2.getName()+"\n" +
                "5." + Alevtina.sofa3.getTitul() + " "+Alevtina.sofa3.getName()+"\n" +
                "6." + Alevtina.sofa4.getTitul() + " "+ Alevtina.sofa4.getName()+"\n" +
                "7." + Alevtina.table1.getTitul() + " "+ Alevtina.table1.getName()+"\n" +
                "8." + Alevtina.table2.getTitul() + " "+ Alevtina.table2.getName());
        Furniture item = new Furniture() {};
        do {
            int choice;
            int amount;
            do {
            do {
                System.out.println("Введите номер желаемого товара: ");
                choice = input.nextInt();
                if ((choice < 1) || (choice > 8)) {
                    System.out.println("Такого товара нет, пожалуйста, повторите попытку");
                }
            } while ((choice < 1) || (choice > 8));
            switch (choice) {
                case 1: {
                    item = Alevtina.chair1;
                    break;
                }
                case 2: {
                    item = Alevtina.chair2;
                    break;
                }
                case 3: {
                    item = Alevtina.sofa1;
                    break;
                }
                case 4: {
                    item = Alevtina.sofa2;
                    break;
                }
                case 5: {
                    item = Alevtina.sofa3;
                    break;
                }
                case 6: {
                    item = Alevtina.sofa4;
                    break;
                }
                case 7: {
                    item = Alevtina.table1;
                    break;
                }
                case 8: {
                    item = Alevtina.table2;
                    break;
                }
            }

            System.out.println("Вы выбрали " + item.getTitul() + " " + item.getName() + "\n" + "Нажмите 1, если выбор верен, или 0, если Вы хотите вернуться к выбору товара");
        } while (input.nextInt()==0);
            System.out.println("Сколько желаете приобрести?");
            amount = input.nextInt();
            System.out.println("Вы уверены?"+"\n"+"Нажмите 1, если да, или 0, если нет: ");
            if (input.nextInt()==1) {
                item.buy(amount,money);
            }
            System.out.println("Если хотите выйти из режима покупки, нажмите 0, если хотите продолжить - 1");
            if (input.nextInt() == 0) break;
        } while (money>0);
        System.out.println("До новых встреч!");
    }
}
