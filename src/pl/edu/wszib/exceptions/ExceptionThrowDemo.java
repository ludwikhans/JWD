package pl.edu.wszib.exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo atd = new ExceptionThrowDemo();
        int hours = -5;
        int mumberOfSecond = 0;

        try {
            mumberOfSecond = atd.getNumbersOfSeconds(hours);
        } catch (IllegalArgumentException e){
            System.out.println("UWAGA! Korekta danych wejściowych");
            mumberOfSecond = atd.getNumbersOfSeconds(hours*-1);
        }
        System.out.println(mumberOfSecond);
    }

    public int getNumbersOfSeconds(int hours){
        if (hours<0){
            throw new IllegalArgumentException("Wartość godzin musi być >= = " + hours);
        }
        return hours*3600;
    }

}
