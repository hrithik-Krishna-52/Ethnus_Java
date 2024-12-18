public class SumArray {
    public static void main(String[] args) {
        float[] numbers = {10,20,30,40,50};
        float sum = 0;
        for(float num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}