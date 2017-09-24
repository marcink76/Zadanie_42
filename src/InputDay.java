import java.util.Scanner;

public class InputDay {


    public static int inputDayNumber(){

        int dayNumber = 0;

        Scanner readDayNumber = new Scanner(System.in);

        do {
            System.out.println("Podaj numer dnia do wyświetlenia: ");
            dayNumber = readDayNumber.nextInt();

            if (dayNumber > 7 || dayNumber < 1) {
                System.out.println("BLAD!!! Numer który podałeś: "+dayNumber+" jest z poza zakresu 1-7, podaj prosze " +
                        "jeszcze raz!");
            }

        }while ((dayNumber > 7 || dayNumber < 1));

        return dayNumber;
    }
}
