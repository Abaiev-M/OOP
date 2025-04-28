package com.gmail.aba.homework01;

/*
Создайте пользовательский класс для описания товара (предположим, это задел для
интернет-магазина). В качестве свойств товара можете использовать значение цены,
описание, вес товара. Создайте пару экземпляров вашего класса и протестируйте их
работу.
*/

public class MainProduct {
    public static void main(String[] args) {
        Product iPhone15 = new Product("Iphone 15", 42.343, 20.4, "20.05.2024");
        Product samsungGalaxyX43 = new Product("Samsung Galaxy x43", 65.343, 32.0, "20.05.2025");

        Product iPad = new Product();
        iPad.setProductName("iPad mini");
        iPad.setPrice(34.032);
        iPad.setWeight(87.0);
        iPad.setDateOfManufacture("20.05.2024");

        System.out.println(iPhone15.toString());
        System.out.println(samsungGalaxyX43.toString());
        System.out.println(iPad.toString());

    }
}
