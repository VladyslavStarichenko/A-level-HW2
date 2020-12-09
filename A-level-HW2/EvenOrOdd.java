public class EvenOrOdd {
    public static void main(String[] args) {
        int experimentNumber = 25;
        String massage1 = "The number is odd";
        String massage2 = "The number is even";
        String result = (experimentNumber%2 != 0) ? massage1 : massage2;
        System.out.println(result);
    }
}
