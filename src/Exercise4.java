public class Exercise4 {

    public static void main(String[] args) {

        // get the total number of seconds in 5 year
        int numberOfYear = 5;
        double secondsInFiveYear = getTotalSecondsInFiveYear(numberOfYear);

        //calculate total number of births in 5 year
        int totalNewBirthInFiveYear = (int)(secondsInFiveYear/7);
        System.out.println(totalNewBirthInFiveYear);

        //calculate total number of deaths in 5 year
        int totalNewDeathInFiveYear = (int)(secondsInFiveYear/14);
        System.out.println(totalNewDeathInFiveYear);

        // finally, calculate projected population in 5 year
        int populationInFiveYear = (int) (331002651 + totalNewBirthInFiveYear - totalNewDeathInFiveYear);
        System.out.println(populationInFiveYear);

    }// end of main

    static double getTotalSecondsInFiveYear(int totalYear){
        final int daysInYear = 365;
        final int hourInDay = 24;
        final int minuteInHour = 60;
        final int secondInMinute = 60;
        double secondsInFiveYear = totalYear * daysInYear * hourInDay * minuteInHour * secondInMinute;
        return secondsInFiveYear;
    }

} // end of class
