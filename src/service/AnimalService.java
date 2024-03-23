package service;

import db.Database;
import model.AquaticCarnivorous;
import model.AquaticNonCarnivorous;
import model.TerrestrialCarnivorous;
import model.TerrestrialNonCarnivorous;
import util.MenuUtill;

import java.util.Scanner;

import static db.Database.*;

public class AnimalService {
    MenuUtill menuUtill = new MenuUtill();

    public void addAquaticCarnivorous() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type: ");
        String spec = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Can it swim? (Enter: true or false)");
        boolean canSwim = scanner.nextBoolean();
        aquaticCarnivorous.add(new AquaticCarnivorous(spec, age, canSwim));
        System.out.println("carnivorous fish added to the database");
        System.out.println();
    }

    public void getAllAquaticCarnivorous() {
        for (int i = 0; i < aquaticCarnivorous.size(); i++) {
            System.out.println(aquaticCarnivorous.get(i));
        }
        System.out.println();
    }

    public void addAquaticNonCarnivorous() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type:  ");
        String spec = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Can it swim? (Enter: true or false): ");
        boolean canSwim = scanner.nextBoolean();
        Database.aquaticNonCarnivorous.add(new AquaticNonCarnivorous(spec, age, canSwim));
        System.out.println("non-carnivorous fish added to the database");
        System.out.println();
    }

    public void getAllAquaticNonCarnivorous() {
        for (int i = 0; i < aquaticNonCarnivorous.size(); i++) {
            System.out.println(aquaticNonCarnivorous.get(i));
        }
        System.out.println();
    }

    public void addATerrestrialCarnivorous() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Novu daxil edin: ");
        String spec = scanner.nextLine();
        System.out.println("Yasi daxil edin: ");
        int age = scanner.nextInt();
        System.out.println("Nece ayaqli heyvan oldugunu daxil edin: : ");
        int numberOfLegs = scanner.nextInt();
        Database.terrestrialCarnivorous.add(new TerrestrialCarnivorous(spec, age, numberOfLegs));
        System.out.println("Yirtici heyvan DB-ya ugurla elave olundu");
        System.out.println();
    }

    public void getAllTerrestrialCarnivorous() {
        if (terrestrialCarnivorous.isEmpty()) {
            System.out.println("Zehmet olmasa DB-ya yiritici canli elave din !");
        }
        for (int i = 0; i < terrestrialCarnivorous.size(); i++) {
            System.out.println(terrestrialCarnivorous.get(i));
        }
        System.out.println();
    }

    public void addATerrestrialNonCarnivorous() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Novu daxil edin: ");
        String spec = scanner.nextLine();
        System.out.println("Yasi daxil edin: ");
        int age = scanner.nextInt();
        System.out.println("Nece ayaqli heyvan oldugunu daxil edin: : ");
        int numberOfLegs = scanner.nextInt();
        Database.terrestrialNonCarnivorous.add(new TerrestrialNonCarnivorous(spec, age, numberOfLegs));
        System.out.println("Yirtici olmayan heyvan DB-ya ugurla elave olundu");
        System.out.println();
    }

    public void getAllTerrestrialNonCarnivorous() {
        for (int i = 0; i < terrestrialNonCarnivorous.size(); i++) {
            System.out.println(terrestrialNonCarnivorous.get(i));
        }
        System.out.println();
    }
}