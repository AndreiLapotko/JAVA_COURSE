package Seminar06.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

// import javax.swing.*;
import static javax.swing.JOptionPane.showInputDialog;

public class ComputerShop {
    public static void main(String[] args) {

        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(new Laptop("Asus", "T800", (byte) 13, "Intel", 8, 1500.00));
        laptops.add(new Laptop("Asus", "T1000", (byte) 15, "Intel", 16, 2000));
        laptops.add(new Laptop("Acer", "XT", (byte) 13, "AMD", 8, 1000));
        laptops.add(new Laptop("Acer", "HD555", (byte) 17, "Intel", 16, 1500));
        laptops.add(new Laptop("Радио", "86РК", (byte) 12, "КР580ВМ80", 1, 100));
        laptops.add(new Laptop("Орион", "128", (byte) 17, "КР580ВМ80", 2, 150));
        laptops.add(new Laptop("Lenovo", "Carbon1", (byte) 15, "Intel", 64, 2500));
        laptops.add(new Laptop("Lenovo", "Carbon2", (byte) 17, "Intel", 128, 2700));
        laptops.add(new Laptop("DEXP", "Aquilon", (byte) 15, "AMD", 8, 300));
        laptops.add(new Laptop("MSI", "Modern", (byte) 15, "Intel", 16, 500));
        laptops.add(new Laptop("MSI", "Modern", (byte) 15, "Intel", 16, 500));

        // for (Laptop laptop : laptops) {
        // System.out.println(laptop.getCPU());
        // System.out.println();
        // }

        String[] parameters = { "Бренд", "Модель", "Размер (диагональ)", "Процессор", "Объём памяти", "Цена" };

        // System.out.println(filtersList);

        String filter = (String) showInputDialog(
                null,
                "Выберите критерий фильтрации",
                "Фильтр",
                JOptionPane.QUESTION_MESSAGE,
                null,
                parameters,
                parameters[0]);

        Set<String> parametersList = new TreeSet<>();

        switch (filter) {
            case "Бренд":
                for (Laptop laptop : laptops) {
                    parametersList.add(laptop.getBrand());
                }
                break;
            case "Модель":
                for (Laptop laptop : laptops) {
                    parametersList.add(laptop.getModel());
                }
                break;
            case "Размер (диагональ)":
                for (Laptop laptop : laptops) {
                    parametersList.add("" + laptop.getSize());
                }
                break;
            case "Процессор":
                for (Laptop laptop : laptops) {
                    parametersList.add(laptop.getCPU());
                }
                break;
            case "Объём памяти":
                for (Laptop laptop : laptops) {
                    parametersList.add("" + laptop.getRAMSize());
                }
                break;
            case "Цена":
                for (Laptop laptop : laptops) {
                    parametersList.add("" + laptop.getPrice());
                }
                break;
        }

        String filter2 = (String) showInputDialog(
                null,
                "Выберите параметр из списка",
                "Фильтр",
                JOptionPane.QUESTION_MESSAGE,
                null,
                parametersList.toArray(),
                parameters[0]);

        System.out.println(filter + " " + filter2);

        if (filter.equals("Размер (диагональ)")) {
            byte resultFilter = Byte.parseByte(filter2);
            System.out.println("Ноутбуки с диагональю экрана" + filter2 + " и больше:");
            for (Laptop l : filterBySomething(laptops, resultFilter)) {
                System.out.println(l.getBrand() + " " + "\t" + l.getModel());
            }
        } else if (filter.equals("Цена")) {
            double resultFilter = Double.parseDouble(filter2);
            System.out.println("Ноутбуки с ценой " + filter2 + " и больше:");
            for (Laptop l : filterBySomething(laptops, resultFilter)) {
                System.out.println(l.getBrand() + " " + "\t" + l.getModel());
            }
        } else if (filter.equals("Объём памяти")) {
            int resultFilter = Integer.parseInt(filter2);
            System.out.println("Ноутбуки с объёмом памяти " + filter2 + " и больше:");
            for (Laptop l : filterBySomething(laptops, resultFilter)) {
                System.out.println(l.getBrand() + " " + "\t" + l.getModel());
            }
        } else if (filter.equals("Модель")) {
            System.out.println("Ноутбуки соответствующие выбранным критериям:");
            for (Laptop l : filterByModel(laptops, filter2)) {
                System.out.println(l.getBrand() + " " + "\t" + l.getModel());
            }
        } else if (filter.equals("Бренд")) {
            System.out.println("Ноутбуки соответствующие выбранным критериям:");
            for (Laptop l : filterByBrand(laptops, filter2)) {
                System.out.println(l.getBrand() + " " + "\t" + l.getModel());
            }
        } else {
            System.out.println("Ноутбуки соответствующие выбранным критериям:");
            for (Laptop l : filterByCPU(laptops, filter2)) {
                System.out.println(l.getBrand() + " " + "\t" + l.getModel());
            }
        }

    }

    private static List<Laptop> filterBySomething(List<Laptop> lap, byte digitalValue) {
        return lap.stream().filter(laptop -> laptop.getSize() >= digitalValue).collect(Collectors.toList());
    }

    private static List<Laptop> filterBySomething(List<Laptop> lap, int digitalValue) {
        return lap.stream().filter(laptop -> laptop.getRAMSize() >= digitalValue).collect(Collectors.toList());
    }

    private static List<Laptop> filterBySomething(List<Laptop> lap, double digitalValue) {
        return lap.stream().filter(laptop -> laptop.getPrice() >= digitalValue).collect(Collectors.toList());
    }

    private static List<Laptop> filterByBrand(List<Laptop> lap, String stringValue) {
        return lap.stream().filter(laptop -> laptop.getBrand().equals(stringValue)).collect(Collectors.toList());
    }

    private static List<Laptop> filterByModel(List<Laptop> lap, String stringValue) {
        return lap.stream().filter(laptop -> laptop.getModel().equals(stringValue)).collect(Collectors.toList());
    }

    private static List<Laptop> filterByCPU(List<Laptop> lap, String stringValue) {
        return lap.stream().filter(laptop -> laptop.getCPU().equals(stringValue)).collect(Collectors.toList());
    }
}
