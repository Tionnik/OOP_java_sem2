package OOP_java_sem2;

import java.util.ArrayList;

import OOP_java_sem2.buyer.Add_Order;
import OOP_java_sem2.shipment.Product;


public class main {
    public static void main(String[] args) {

        ArrayList <Product> list_products = new ArrayList<>();

        list_products = new BaseProduct().getBase();                // Загрузка базы продуктов
        new Add_Order().getList_order(list_products);               // Передача базы продуктов для оформления заказа
    }
}
