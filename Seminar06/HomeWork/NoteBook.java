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
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
условиям.
 */
package Seminar06.HomeWork;

public class NoteBook {
    private String brand;
    private String model;
    private int size;
    private String cpu;
    private int ramSize;
    private int price;

    /**
     * конструктор класса NoteBook
     * 
     * @param brand   название бренда
     * @param model   модель ноутбука
     * @param size    размер (диагональ)
     * @param cpu     марка процессора
     * @param ramSize объём оперативной памяти
     * @param price   цена
     */
    public NoteBook(String brand, String model, int size, String cpu, int ramSize, int price) {
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

    public int getSize() {
        return size;
    }

    public String getCPU() {
        return cpu;
    }

    public int getRAMSize() {
        return ramSize;
    }

    public int getHDDSize() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAMSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setHDDSize(int hddSize) {
        this.price = hddSize;
    }

}
