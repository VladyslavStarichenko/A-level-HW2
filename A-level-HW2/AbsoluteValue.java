public class AbsoluteValue {

    public static void main(String[] args) {

        double firstNumber = -8.5426;
        double secondNumber = -33.21;
        double thirdNumber = 21.11;
        double result;

        double module1 = (firstNumber < 0) ? firstNumber * (-1) : firstNumber;
        double module2 = (secondNumber < 0) ? secondNumber * (-1) : secondNumber;
        double module3 = (thirdNumber < 0) ? thirdNumber * (-1) : thirdNumber;

        if(module1 <= module2 && module1 <= module3){
            result = module1;
        }else if(module2 <= module3 && module2 <= module1 ){
            result = module2;
        }else {
            result = module3;
        }

        System.out.println("The smallest absolute value is:" + " " + result);
    }

}
