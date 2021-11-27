public class DayCounter {
    public static void main(String[] args) {

        int yearIn = 4001;
        int monthin =6;
        if (args.length > 0){
            monthin = Integer.parseInt(args[0]);
        }
        if (args.length > 1) {
            yearIn = Integer.parseInt(args[1]);
        }

        System.out.println(monthin + "/" + yearIn + " ma " +  countDays(yearIn,monthin) + " dni.");


    }

    static int countDays(int month, int years) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
            case 2:
                if (years % 4 ==0){
                    count = 29;
                }else {
                    count = 28;
                    }
                if ((years % 100 == 0) && (years % 400 != 400)){
                    count = 28;
                }
        }
        return count;
    }
}
