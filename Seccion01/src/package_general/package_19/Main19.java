package package_general.package_19;

import java.util.Set;
import java.util.TreeSet;


public class Main19 {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Mario");
        conjunto.add("Mario"); // No se permiten datos repetidos
        conjunto.add("Alberto");
        conjunto.add("Pablo");

        System.out.println("Nombres en Set");
        conjunto.forEach(System.out::println);
        conjunto.remove("Pablo");
        System.out.println("Nombres en Set posterior a remove");
        conjunto.forEach(System.out::println);
    }
}
