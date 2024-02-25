/*
-Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
-Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
условиям.
 */
package Seminar06.HomeWork;

import java.util.Objects;

public class Laptop {
    private String brand;
    private String model;
    private byte size;
    private String cpu;
    private int ramSize;
    private double price;

    /**
     * конструктор класса Laptop
     * 
     * @param brand   наименование бренда
     * @param model   модель ноутбука
     * @param size    размер (диагональ экрана)
     * @param cpu     микропроцессор
     * @param ramSize объём памяти
     * @param price   цена
     */
    public Laptop(String brand, String model, byte size, String cpu, int ramSize, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public byte getSize() {
        return size;
    }

    public String getCPU() {
        return cpu;
    }

    public int getRAMSize() {
        return ramSize;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAMSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String getInfo() {
        return String.format(
                "Наименование: \t\t%s %s \nРазмер (диагональ): \t%d \nПроцессор: \t\t%s \nОбъём памяти: \t\t%d Гб\nЦена: \t\t\t%d",
                brand, model, size, cpu, ramSize, price);
    }
    // @Override
    // public String toString() {
    // return getInfo();
    // }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, size, cpu, ramSize, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return brand.equals(laptop.brand) && model.equals(laptop.model) && size == laptop.size && cpu.equals(laptop.cpu) && ramSize == laptop.ramSize;// && price == laptop.price;
    }
}
