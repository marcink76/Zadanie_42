import java.util.Scanner;

public class InputDay {


    public static int inputDayNumber(){

        int dayNumber = 0;
        boolean checkLoop = false;

        Scanner readDayNumber = new Scanner(System.in);
        do {
            System.out.println("Podaj numer dnia do wyświetlenia: ");
            dayNumber = readDayNumber.nextInt();

            if (dayNumber > 7 || dayNumber < 1) {
                System.out.println("BLAD!!! Podaj numer z zakresu od 1-7");
                checkLoop = false;

            } else {
                checkLoop = true;
            }

        }while (!checkLoop);

        return dayNumber - 1;
    }

}
