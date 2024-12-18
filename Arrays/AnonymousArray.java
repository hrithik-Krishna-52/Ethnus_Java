public class AnonymousArray {

    static void printArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        printArray(new int[] {1, 2, 3 ,4 ,5});
        printArray(new int[] {10, 20, 30});
        printArray(new int[] {500, 2000});
    }
}