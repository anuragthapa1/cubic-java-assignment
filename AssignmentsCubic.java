//Cubic Technologies
//Assignments by Anurag Thapa

package Assignments;

import java.util.Scanner;


public class AssignmentsCubic {
    
//1. Write a program to display Greetings in three lines.

public static void main(String[] args) {
    System.out.println("Hello Everyone!");
    System.out.println("I hope ya'll are doing fine.");
    System.out.println("Pleasant to have you here!");

//2. Write a program to display your Introduction in three lines.
    System.out.println("My name is Anurag Thapa!");
    System.out.println("I'm an aspiring Software Developer.");
    System.out.println("I have a Bachelor's degree in Computer Science.");

//3. Write a program to find the sum and average of two numbers input by User (using Scanner class)

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Please enter the second number: ");
    int num2 = scanner.nextInt();

    int sum = num1 + num2;
    int avg = sum/2;

    System.out.println("The sum of the numbers that you provided is: " + sum);
    System.out.println("The average of the numbers that you provided is: " + avg);

//4. Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100

    System.out.print("Please enter the Principal amount 'P': ");
    double P = scanner.nextDouble();

    System.out.print("Please enter the Time 'T': ");
    double T = scanner.nextDouble();

    System.out.print("Please enter the Rate 'R': ");
    double R = scanner.nextDouble();

    double SI = (P*T*R)/100;

    System.out.println("The simple interest on the values you provided is: " + SI);

//5. Write a program to find the area of a circle, rectangle, and triangle.

    //For Circle
    System.out.print("Please enter the Radius of the circle: ");
    double r = scanner.nextDouble();

    double areaOfCirlce = Math.PI*r*r;
    System.out.println("The area of the circle is: " + areaOfCirlce);

    //For Rectangle
    System.out.println("Please enter the Length and Breadth of the rectangle: ");
    System.out.print("Length: ");
    double l = scanner.nextDouble();
    System.out.print("Breadth: ");
    double b = scanner.nextDouble();

    double areaOfRectangle = l*b;
    System.out.println("The area of the rectangle is: " + areaOfRectangle);

    //For Triangle

    System.out.println("Please enter the base and height of the triangle: ");
    System.out.print("Base: ");
    double base = scanner.nextDouble();
    System.out.print("Height: ");
    double height = scanner.nextDouble();

    double areaOfTriangle = 0.5 * base * height;
    System.out.println("The area of the triangle is: " + areaOfTriangle);

//6. Write a program to find the perimeter of a circle, triangle, and rectangle

    //Lets use the same input from the previous question.
    
    //For Circle
    double perimeterOfCircle = 2*Math.PI*r;
    System.out.println("The perimeter of the cirlce with the radius that you input before is: " + perimeterOfCircle);

    //For triangle
    System.out.println("Please enter three sides of the triangle: ");
    System.out.print("Side1: ");
    double s1 = scanner.nextDouble();
    System.out.print("Side2: ");
    double s2 = scanner.nextDouble();
    System.out.print("Side3: ");
    double s3 = scanner.nextDouble();

    double perimeteOfTriangle = s1 + s2 + s3;
    System.out.println("The perimeter of the triangle with the sides of your choice is "+ perimeteOfTriangle);

    //For Rectangle
    double perimeterOfRectangle = 2*(l+b);
    System.out.println("The perimeter of rectangle based on length and breadth that you input before is: " + perimeterOfRectangle);

//7. Write a program that reads the radius and length of a cylinder and computes volume.

    System.out.print("Please enter the radius of the cylinder: ");
    double cylinRadius = scanner.nextDouble();

    System.out.print("Please enter the length of the cylinder: ");
    double cylinLength = scanner.nextDouble();

    double volumeOfCylinder = Math.PI*cylinRadius*cylinRadius*cylinLength;
    System.out.println("The volume of the cylinder is: " + volumeOfCylinder);

//8. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.

    // Fahrenheit to Celsius conversion
    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    double celsiusFromFahrenheit = (fahrenheit - 32) * 5/9;  
    System.out.println(fahrenheit + "°F is equal to " + celsiusFromFahrenheit + "°C");

    // Celsius to Fahrenheit conversion
    System.out.print("Enter temperature in Celsius: ");
    double celsius = scanner.nextDouble();
    double fahrenheitFromCelsius = (celsius * 9/5) + 32;  
    System.out.println(celsius + "°C is equal to " + fahrenheitFromCelsius + "°F");

//9. Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].

    System.out.print("Please enter any number of pounds as you wish: ");
    double pounds = scanner.nextDouble();

    double kg = pounds*0.454;
    System.out.println("The " + pounds + " that you entered equals to " + kg + " in kilograms");
    
//10. Write a Program for the following Mathematical Function.

    //To calculate Displacement 
    System.out.print("Enter the initial velocity (u) in meters per second: ");
    double u = scanner.nextDouble();

    System.out.print("Enter the acceleration (a) in meters per second squared: ");
    double a = scanner.nextDouble();

    System.out.print("Enter the time (t) in seconds: ");
    double t = scanner.nextDouble();

    double s = (u * t) + (0.5 * a * t * t);
    System.out.println("The displacement (s) is: " + s + " meters");

    //To calculate the Area of a Triangle Using Heron's Formula
    System.out.print("Enter the first side of the triangle (a): ");
    double a1 = scanner.nextDouble();

    System.out.print("Enter the second side of the triangle (b): ");
    double b1 = scanner.nextDouble();

    System.out.print("Enter the third side of the triangle (c): ");
    double c1 = scanner.nextDouble();

        // Calculating the semi-perimeter (s)
    double semiPerimeter = (a1 + b1 + c1) / 2;

        // Calculating the area using Heron's formula
    double area = Math.sqrt(semiPerimeter * (semiPerimeter - a1) * (semiPerimeter - b1) * (semiPerimeter - c1));

        // Displaying the result
    System.out.println("The area of the triangle is: " + area);

//11. Write a program to swap two numbers

//a) using temp variable
System.out.print("Enter the first number: ");
int number1 = scanner.nextInt();

System.out.print("Enter the second number: ");
int number2 = scanner.nextInt();

int temp = number1;
number1 = number2;
number2 = temp;

System.out.println("After swapping:");
System.out.println("First number: " + number1);
System.out.println("Second number: " + number2);

//b) without temp variable
System.out.print("Enter the first number: ");
int numA = scanner.nextInt();

System.out.print("Enter the second number: ");
int numB = scanner.nextInt();

numA = numA + numB;  
numA = numA - numB;  
numA = numA - numB;  

System.out.println("After swapping:");
System.out.println("First number: " + numA);
System.out.println("Second number: " + numB);

//12. Write a program to accept the age, name, and nationality of the person and display those values in good format.
System.out.print("Please enter your age: ");
int age = scanner.nextInt();

System.out.print("Please enter your name: ");
String name = scanner.next();

System.out.print("Please enter your nationality: ");
String nationality = scanner.next();

System.out.println("Hi " + name + " of age "+ age + " and with "+ nationality+ " as the nationality.");

//13. Write a program to print the number entered by the user only if the number entered is negative.

System.out.print("Please enter any number: ");
int yourNum = scanner.nextInt();
if(yourNum<0){
    System.out.println(yourNum);
}
else{
    System.out.println("We only want an input of a negative number.");
}


//14. Write a program to relate two integers entered by the user using = =or > or < sign.

System.out.print("Please enter any number to initiate relation: ");
int userNum = scanner.nextInt();

System.out.print("Please enter any other number to initiate relation: ");
int userNum1 = scanner.nextInt();

if(userNum == userNum1){
    System.out.println("Both numbers are equal.");
} else if(userNum > userNum1){
    System.out.println("The first number is greater than the second number.");
} else{
    System.out.println("The first number is less than the second number.");
}

//15. Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].

System.out.print("Enter an ASCII code(between 0 and 128): ");
int asciiCode = scanner.nextInt();

if(asciiCode >=0 && asciiCode <=128){
    char character = (char) asciiCode;
    System.out.println("The character of ASCII code "+ asciiCode+ " is: " + character);
} else{
    System.out.println("Please enter a valid ASCII code between 0 and 128.");
}


//16. Write a program to find if the given number is even or odd.
System.out.print("Please enter any number to check whether odd or even: ");
int givenNum = scanner.nextInt();
if(givenNum%2==0){
    System.out.println("The number you entered is an even number");
} else{
    System.out.println("The number you entered is odd.");
}

//17. Write a program to calculate leap years.

System.out.print("Enter a year to check if it's a leap year: ");
int year = scanner.nextInt();  

        
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println(year + " is a leap year.");
} else {
    System.out.println(year + " is not a leap year.");
        }

//18. Write a program to display the largest number from given three values.

System.out.print("Please enter any three numbers ");

System.out.print("Num1 : ");
int yourNum1 = scanner.nextInt();

System.out.print("Num2 : ");
int yourNum2 = scanner.nextInt();

System.out.print("Num3 : ");
int yourNum3 = scanner.nextInt();

if(yourNum1>yourNum2 && yourNum1>yourNum3){
    System.out.println("Num1 is the greatest.");
}
else if(yourNum2>yourNum1 && yourNum2>yourNum3){
    System.out.println("Num2 is the greatest");
}
else{
    System.out.println("Num 3 is the greatest");
}


//19. Write a Program to accept three sides of a triangle and display which kind of triangle is formed.

System.out.print("Enter the first side of the triangle: ");
int side1 = scanner.nextInt();

System.out.print("Enter the second side of the triangle: ");
int side2 = scanner.nextInt();

System.out.print("Enter the third side of the triangle: ");
int side3 = scanner.nextInt();

        // Check if the sides form a valid triangle
if (side1 <= 0 || side2 <= 0 || side3 <= 0 || 
    side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
        System.out.println("The sides do not form a valid triangle.");
} 
else {
// Determine the type of triangle
if (side1 == side2 && side2 == side3) {
    System.out.println("The triangle is Equilateral.");
}
else if (side1 == side2 || side2 == side3 || side1 == side3) {
    System.out.println("The triangle is Isosceles.");
} 
else {
    System.out.println("The triangle is Scalene.");
    }
}

//20. Write a program to create the equivalent of a four-function calculator. The program to enter two integer’s numbers and an operator. It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers. Finally, it displays the result.

System.out.print("Enter the first number: ");
int numFirst = scanner.nextInt();

System.out.print("Enter an operator(+, -, *, /): ");
char operator = scanner.next().charAt(0);

System.out.print("Enter the second number: ");
int numSecond = scanner.nextInt();

int result;
switch (operator){
    case '+':
        result = numFirst + numSecond;
        System.out.println("Result: "+ result);
        break;
    case '-':
        result = numFirst - numSecond;
        System.out.println("Result: "+ result);
        break;
    case '*':
        result = numFirst * numSecond;
        System.out.println("Result: "+ result);
        break;
    case '/':
        if(numSecond != 0){
            result = numFirst / numSecond;
            System.out.println("Result: "+ result);
        }
        else{
            System.out.println("Error! Division by zero is not allowed.");
        }
        break;
    default:
        System.out.println("Error! Inavalid Operator.");
        
    
}

//21. Program to input the number of (1...7) and translate to its equivalent name of the day of the week.

System.out.print("Enter a number (1-7) to get the corresponding day: ");
int dayNumber = scanner.nextInt();

        
String day;
switch (dayNumber) {
    case 1:
        day = "Sunday";
        break;
    case 2:
        day = "Monday";
        break;
    case 3:
        day = "Tuesday";
        break;
    case 4:
        day = "Wednesday";
        break;
    case 5:
        day = "Thursday";
        break;
    case 6:
        day = "Friday";
        break;
    case 7:
        day = "Saturday";
        break;
    default:
        day = "Invalid input! Please enter a number between 1 and 7.";
    }
    System.out.println("Day: " + day);
    
   

//22. Write a program to print the table of given numbers.

System.out.print("Please enter any number to print its multiplication table: ");
int multiNum = scanner.nextInt();

System.out.println("Multiplication Table for "+ multiNum + ":");
for(int i=1;i<=10;i++){
    System.out.println(multiNum + " x " + i + " = "+ (multiNum*i));
}

//23. Write a Program to sum 1 to nth natural numbers.

System.out.print("Enter a number to sum 1 to nth natural numbers: ");
int nthNum = scanner.nextInt();

int sumNth = nthNum *(nthNum+1)/2;

System.out.println("The sum of natural numbers from 1 to "+ nthNum + " is: " + sumNth);

//24. Write a program to print the factorial number of given numbers.

System.out.print("Enter a number to find the factorial: ");
int factNum = scanner.nextInt();

long factorial = 1;

for(int i=1;i<=factNum;i++){
    factorial *= i;
}
System.out.println("The factorial of " + factNum + " is: " + factorial);

//25. Write a program that prompts the user to enter the number of students and each student’s name and score. Finally display the student with the highest score.

System.out.print("Please enter the number of students: ");
int studNum = scanner.nextInt();

String topStud = "";
int highestScore = -1;

for(int i=1;i<=studNum;i++){
    System.out.print("Enter student " + i + "'s name: ");
    String studName = scanner.nextLine();

    System.out.print("Enter " + studName + "'s score: ");
    int studScore = scanner.nextInt();

    if(studScore > highestScore){
        highestScore = studScore;
        topStud = studName;
    }
}
System.out.println("The student with the highest score is " + topStud + " with a score of " + highestScore);

//26. Write a Program to reverse the given number. //123 => 321

System.out.print("Enter a number to reverse: ");
    int numbeReverse = scanner.nextInt();

    int reversedNumber = 0;

    while (numbeReverse != 0) {
        int digit = numbeReverse % 10;
        reversedNumber = reversedNumber * 10 + digit;
        numbeReverse /= 10;
    }
    System.out.println("Reversed number: " + reversedNumber);

//27. Write a Program to sum each digit of a given number as well as product. //456 =>4*5*6 and 4+5+6

System.out.print("Enter a number: ");
    int numbEx = scanner.nextInt();

    int sumEx = 0;
    int prodEx = 1;

    while (numbEx != 0) {
        int digit = numbEx % 10;
        sumEx += digit;
        prodEx *= digit;
        numbEx /= 10;
    }

    System.out.println("Sum of digits: " + sumEx);
    System.out.println("Product of digits: " + prodEx);



scanner.close();
    
}

}












    

    


