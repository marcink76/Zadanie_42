public class CheckDay {

    public static void checkDay(){
        String dayName = "";
        int dayNumber = InputDay.inputDayNumber();
        switch (dayNumber){
            case 1:
                dayName = "Poniedziałek";
                break;
            case 2:
                dayName = "Wtorek";
                break;
            case 3:
                dayName = "Sroda";
                break;
            case 4:
                dayName = "Czwartek";
                break;
            case 5:
                dayName = "Piątek";
                break;
            case 6:
                dayName = "Sobota";
                break;
            case 7:
                dayName = "Niedziela";
                break;
        }
        if (dayName == "Niedziela" || dayName == "Sobota"){
            System.out.println("Wprowadziłeś numer dnia: "+ dayNumber +"\nto "+ dayName + " Dzie wolny od " +
                    "pracy");
        }else
            System.out.println("Wprowadziłeś numer dnia: "+ dayNumber +"\nto "+ dayName + ", więc do " +
                    "roboty!!!");
        //return day;
    }

}
