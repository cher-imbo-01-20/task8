package com.company;

public abstract class Furniture {
    int cost;
    int quantity;
    int index;
    String name;
    String titul;

    public Furniture() {
    }

    public Furniture(int cost, int quantity, int index, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.index = index;
        this.name = name;
        this.titul=titul;
    }

    public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    boolean isInStock () {
        if (quantity!=0) return true;
        else return false;
    }

    boolean isAvailable (int amount, int money) {
        if (money>=amount*cost) return true;
        else return false;
    }

    void buy (int amount, int money) {
        if ((isAvailable(amount, money))&&(isInStock())) {
            quantity=quantity-amount;
            money=money-amount*cost;
            System.out.println("Покупка успешно совершена. Спасибо! <3");
        }
        else System.out.println("Данного товара нет в желаемом количестве или у вас недостаточно средств."
                +"\n"+"Количество товара на складе: "+quantity+"\n"+"Ваш баланс: "+money);
    }


}
