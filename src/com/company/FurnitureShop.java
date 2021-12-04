package com.company;

public class FurnitureShop {
    Chair chair1;
    Chair chair2;
    Sofa sofa1;
    Sofa sofa2;
    Sofa sofa3;
    Sofa sofa4;
    Table table1;
    Table table2;
    public FurnitureShop() {
        chair1 = new Chair (1599, 50, 1, "Антон");
        chair2 = new Chair (2799, 30, 2,"Ярослав");
        sofa1 = new Sofa (54998, 200,3,"Василиса");
        sofa2 = new Sofa (36899, 150,4,"Соня");
        sofa3 = new Sofa (178999, 15,5,"Захар");
        sofa4 = new Sofa (15999, 100,6,"Дора");
        table1 = new Table (18997, 13,7,"Максим");
        table2 = new Table (24599, 17,8,"Сергей");
    }
}
