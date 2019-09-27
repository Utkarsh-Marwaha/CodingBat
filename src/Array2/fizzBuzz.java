package Array2;

public class fizzBuzz {

    public static String[] fizzBuzz(int start, int end) {


        String fizzBuzzArray[] = new String[end - start];
        int index = 0;

        for (int i = start; i < end; i++){

            if (i % 3 == 0 && i % 5 == 0){
                fizzBuzzArray[index++] = "FizzBuzz";
            } else if (i % 3 == 0){
                fizzBuzzArray[index++] = "Fizz";
            } else if (i % 5 == 0){
                fizzBuzzArray[index++] = "Buzz";
            } else {
                fizzBuzzArray[index++] = String.valueOf(i);
            }
        }

        return fizzBuzzArray;
    }
}
