package util;
import service.AnimalService;
import java.util.Scanner;

public class MenuUtill {
    static AnimalService animalService = new AnimalService();

    public static void mein() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello, welcome to PARK-ZOO!");
            System.out.println("Select the category you are interested in! \n" +
                    "1 -> Aquatic \n" +
                    "2 -> Terrestrial \n" +
                    "3 -> Exit the system");
            int num = sc.nextInt();
            if (num == 1) {
                sc = new Scanner(System.in);
                System.out.println("1 -> to add aquatic carnivorous \n" +
                        "2. to see a list of aquatic carnivores \n" +
                        "3. to add aquatic non-carnivorous \n" +
                        "4. to see a list of aquatic non-carnivores");
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
                System.out.println("1 -> to add terrestrial carnivorous \n" +
                        "2 -> to see a list of terrestrial carnivores \n" +
                        "3 -> to add terrestrial non-carnivorous \n" +
                        "4 -> to see a list of terrestrial non-carnivores");
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