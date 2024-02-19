public class Main {
    public static void main(String[] args) {
        int[] list = {12,232,42,31,56,57,543,86};
        double average = 0.0;
        double sum = 0;
        for(int i : list){
            sum += i;
        }

        average = sum / list.length;
        System.out.println(average);
        System.out.println(sum);
        System.out.println(132.375 *8);

    }
}