public class NestedIfExample {
    public static void main(String[] args) {
        int number = 35;


        if(number > 30) {
            if(number%2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

    }
}
