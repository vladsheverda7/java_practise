package CodeAcademy;

import java.util.ArrayList;

/*
For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print CodeAcademy.FizzBuzz.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            numbers.add(Integer.toString(i));
        }
//        ArrayList<String> result = generateFizzBuzzList(100);
//        System.out.println(result);

        ArrayList<String> result = replaceNumbers(numbers);

        System.out.println(result);
    }

    public static ArrayList<String> replaceNumbers(ArrayList<String> list) {

        for(int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) % 3 == 0 && Integer.parseInt(list.get(i)) % 5 == 0) {
                list.set(i, "CodeAcademy.FizzBuzz");
            } else if (Integer.parseInt(list.get(i)) % 3 == 0) {
                list.set(i, "Fizz");
            } else if (Integer.parseInt(list.get(i)) % 5 == 0) {
                list.set(i, "Buzz");
            }
            else {
                continue;
            }
        }

        return list;
    }

    /*
    public static ArrayList<String> generateFizzBuzzList(int limit) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("CodeAcademy.FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }

        return list;
    }
     */
}
