package util;

import service.AnimalService;

import java.util.Scanner;

public class MenuUtill {
    static AnimalService animalService = new AnimalService();

    public static void main() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello, welcome to PARKZOO!");
            System.out.println("Select the category you are interested in! \n" +
                    "1. Aquatic \n" +
                    "2. Terrestrial \n" +
                    "3. Exit the system");
            int num = sc.nextInt();
            if (num == 1) {
                sc = new Scanner(System.in);
                System.out.println("1. to add carnivorous fish \n" +
                        "2. to see the list of carnivous fish \n" +
                        "3. to add non-carnivorous fish \n" +
                        "4. to see the list of non-carnivous fish");
                int aquaticCategory = sc.nextInt();
                switch (aquaticCategory) {
                    case 1:
                        animalService.addAquaticCarnivorous();
                        break;
                    case 2:
                        animalService.getAllAquaticCarnivorous();
                        break;
                    case 3:
                        animalService.addAquaticNonCarnivorous();
                        break;
                    case 4:
                        animalService.getAllAquaticNonCarnivorous();
                        break;
                }
            } else if (num == 2) {
                sc = new Scanner(System.in);
                System.out.println("1. Yirtici quruda yasayan heyvan elave etmek ucun \n" +
                        "2. Yirtici quruda yasayan heyvanlarin siyahisini gormek ucun \n" +
                        "3. Yirtici olmayan quruda yasayan heyvan elave etmek ucun \n" +
                        "4. Yirtici olmayan quruda yasayan heyvanlarin siyahisini gormek ucun");
                int terrestrialCategory = sc.nextInt();
                switch (terrestrialCategory) {
                    case 1:
                        animalService.addATerrestrialCarnivorous();
                        break;
                    case 2:
                        animalService.getAllTerrestrialCarnivorous();
                        break;
                    case 3:
                        animalService.addATerrestrialNonCarnivorous();
                        break;
                    case 4:
                        animalService.getAllTerrestrialNonCarnivorous();
                        break;
                }
            } else if (num == 3) {
                System.exit(0);
                break;
            }
        }
    }
}