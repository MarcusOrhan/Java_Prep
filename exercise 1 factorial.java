
int factorial = 1;
int number = 5;
int original = number;

do {
    factorial = factorial * number;
    number--
} while (number > 0);

System.out.println(original + " factorial is " + factorial);
