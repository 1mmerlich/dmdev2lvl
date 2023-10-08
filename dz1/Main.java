package com.dmdev.lvl2.dz1;

import java.util.ArrayList;
import java.util.List;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
class Room {
    private boolean isPassage;

    public Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public boolean isPassage() {
        return isPassage;
    }

    public void print() {
        System.out.println("Проходная комната: " + isPassage);
    }
}

class Apartment {
    private int number;
    private List<Room> rooms;

    public Apartment(int number) {
        this.number = number;
        this.rooms = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void print() {
        System.out.println("Квартира номер: " + number);
        for (Room room : rooms) {
            room.print();
        }
    }
}

class Floor {
    private int number;
    private List<Apartment> apartments;

    public Floor(int number) {
        this.number = number;
        this.apartments = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public void print() {
        System.out.println("Этаж " + number + ", количество квартир: " + apartments.size());
        for (Apartment apartment : apartments) {
            apartment.print();
        }
    }
}

class House {
    private int number;
    private List<Floor> floors;

    public House(int number) {
        this.number = number;
        this.floors = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void print() {
        System.out.println("Дом номер: " + number);
        for (Floor floor : floors) {
            floor.print();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        House house = createHouse();
        printAllInformation(house);
    }

    public static House createHouse() {
        House house = new House(1);

        Floor floor1 = new Floor(1);
        floor1.addApartment(new Apartment(1));
        floor1.addApartment(new Apartment(2));
        floor1.addApartment(new Apartment(3));

        Floor floor2 = new Floor(2);
        floor2.addApartment(new Apartment(4));
        floor2.addApartment(new Apartment(5));

        house.addFloor(floor1);
        house.addFloor(floor2);

        return house;
    }

    public static void printAllInformation(House house) {
        house.print();
    }
}
