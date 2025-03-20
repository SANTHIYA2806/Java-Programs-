public class StandardDeviation {

    public static void main(String[] args) {
        int[] numArray = {1, 2};
        int SD = calculateSD(numArray);

        System.out.println("Standard Deviation = " + SD);
    }

    public static int calculateSD(int numArray[]) {
        int sum = 0;
        int standardDeviation = 0;
        int length = numArray.length;

        for (int num : numArray) {
            sum += num;
        }

        int mean = sum / length;
        System.out.println(mean);

        for (int num : numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return (int) Math.sqrt(standardDeviation / length);
    }
}
