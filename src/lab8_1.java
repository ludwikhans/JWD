public class lab8_1 {

    public static void main(String[] args) {


        int[] arr = {4, 1, 1, 4, 2, 3,2,2,2,2,2,2, 4, 4, 1, 2, 4, 9, 3};
        int[]counters = new int[10];
        for (int i = 0; i < arr.length; i++) {

            counters[arr[i]]++;
        }
        for (int stat : counters){
            System.out.print(stat + " ");
        }

        int mostFrequent = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }
        System.out.print("\nNajczęściej występującą cyfrą w tablicy jest cyfra " + mostFrequent);
        System.out.print(" Wystąpiła " + counters[mostFrequent] + " razy");
    }
}
