package OOP_java_sem2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import OOP_java_sem2.shipment.Beverage;
import OOP_java_sem2.shipment.Food;
import OOP_java_sem2.shipment.Hot_beverage;
import OOP_java_sem2.shipment.Product;
                                                    //Загрузка товаров в лист продажи
public class BaseProduct {

    public ArrayList <Product> getBase(){
        ArrayList <Product> my_list = new ArrayList<>();
        my_list.add(new Food(15,"Twix", 80, 10, new GregorianCalendar(2026, 10, 15, 0, 0),80));
        my_list.add(new Food(16,"Mars", 90, 9, new GregorianCalendar(2026, 10,0, 0, 0), 150));
        my_list.add(new Food(13,"Snickers", 60, 15, new GregorianCalendar(2026, 10,0, 0, 0),150));
        my_list.add(new Food(14,"Bounty", 85, 18, new GregorianCalendar(2026, 9, 13, 0, 0, 0), 120));
        my_list.add(new Beverage(32,"Coca-Cola", 150, 7, new GregorianCalendar(2026, 3, 8, 0, 0, 0), 0.5));
        my_list.add(new Hot_beverage(21,"Nesсafe", 150, 35, 
                    new GregorianCalendar(2024, 5, 12, 0, 0, 0), 0.33, 25));
        my_list.add(new Hot_beverage(22,"Jacobs", 120, 3, 
                    new GregorianCalendar(2024, 6, 07, 0, 0, 0), 0.33, 20));
        my_list.add(new Hot_beverage(24,"Bushido", 170, 12, 
                    new GregorianCalendar(2024, 03, 11, 0, 0, 0), 0.6, 25));
        return my_list;

    }
}
