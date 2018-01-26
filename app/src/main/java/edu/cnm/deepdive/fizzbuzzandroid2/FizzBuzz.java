package edu.cnm.deepdive.fizzbuzzandroid2;

public class FizzBuzz {


  public static final int DEFAULT_LIMIT = 100;

  public static void main(String[] args) {
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
    count(limit);
  }

  public static String count(int fizzLimit) {
    String output = null;
    for (int i = 1; i <= fizzLimit; i++) {
      output = "";
      if (i % 3 == 0) {
        output += "Fizz";
      }
      if (i % 5 == 0) {
        output += "Buzz";
      }
      if (output.isEmpty()) {
        output = Integer.toString(i);
      }


    }
    return output;
  }
  }


