public class CheckDay {

    public static void checkDay(Day day){
        int dayNumber = InputDay.inputDayNumber();
        switch (dayNumber){
            case 1:
                day.setDayName("Poniedziałek");
                break;
            case 2:
                day.setDayName("Wtorek");
                break;
            case 3:
                day.setDayName("Sroda");
                break;
            case 4:
                day.setDayName("Czwartek");
                break;
            case 5:
                day.setDayName("Piątek");
                break;
            case 6:
                day.setDayName("Sobota");
                break;
            case 7:
                day.setDayName("Niedziela");
                break;
        }
        if (day.getDayName() == "Niedziela" || day.getDayName() == "Sobota"){
            System.out.println("Wprowadziłeś numer dnia: "+ dayNumber +"\nto "+ day.getDayName() + " Dzie wolny od " +
                    "pracy");
        }else
            System.out.println("Wprowadziłeś numer dnia: "+ dayNumber +"\nto "+ day.getDayName() + ", więc do " +
                    "roboty!!!");
        //return day;
    }

}
