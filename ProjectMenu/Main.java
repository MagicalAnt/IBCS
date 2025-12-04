import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
        Scanner scan = new Scanner(System.in);
        int choice;
        while (true) {
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                break;
            } else {
                System.out.println("Please enter an interger.");
                menu();
                scan.next();
                System.out.println(" ");
            }
        }
        boolean exit = false;
        System.out.println(" ");
    while (exit == false) {
        if (choice >= -1 && choice <= 10) {
        if (choice != -1){
        switch (choice) {
            case 1:
                Task1();
                break;
            case 2:
                Task2();
                break;
            case 3:
                Task3();
                break;
            case 4:
                Task4();
                break;
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;
        }
    }
        else if (choice == -1){
            System.out.println("Exiting the program. Thank you for playing!");
            exit = true;
            return;
        }
        }
        else {
            System.out.println("Please enter a number between 1 and 10, or -1 to exit.");
        }
        System.out.println(" ");
        System.out.println(" ");
        menu();
        while (true) {
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                break;
            } else {
                System.out.println("Please enter an interger.");
                menu();
                scan.next();
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
}


//Menu of all tasks
public static void menu(){
    System.out.println("---------------------------------------------------------------");
    System.out.println("Please select a task to run (1-10) by entering the task number:");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    System.out.println("1. Hello World");
    System.out.println("2. Distance Converter");
    System.out.println("3. Largest Number");
    System.out.println("4. Largest Number of 10");
    System.out.println("5. Secret Number Game");
    System.out.println("6. How many days in any month... ever?");
    System.out.println("7. Creating and Accessing Arrays");
    System.out.println("8. Parallel Arrays");
    System.out.println("9. 2D Arrays");
    System.out.println("10. Converting 2D Arrays into 1D Arrays");
    System.out.println("-1. Exit the prgram");
    System.out.println(" ");
}

    // Task 1 Hello World
    public static void Task1() {
        System.out.println("Hello, World!");
    }
    //Task 2 Distance Converter
    public static void Task2(){
        System.out.print("please enter your value(in km) that will be converted into miles: ");
        Scanner scan = new Scanner(System.in);
        int km;
        while (true) {
        if (scan.hasNextInt()) {
            km = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        double miles = km * 0.621371;
        System.out.println("the miles converted from km is " + miles);
    }
    //Task 3 Largest Number
    public static void Task3(){
        System.out.println("please enter the 1st number: ");
        Scanner scan = new Scanner(System.in);
        int Biggest;
        while (true) {
        if (scan.hasNextInt()) {
            Biggest = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }

        byte count = 2;
        while (count <= 3) {
        System.out.println("please enter the " + count + "st number: ");
        int Num;
        while (true) {
        if (scan.hasNextInt()) {
            Num = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        if (Biggest < Num) {
            Biggest = Num;
        }
        count++;
        }
        System.out.println("the biggest number is " + Biggest);
    }
    //Task 4 and 5: Largest Number of 10
    public static void Task4(){
        System.out.println("please enter the 1st number: ");
        Scanner scan = new Scanner(System.in);
        int Biggest;
        while (true) {
        if (scan.hasNextInt()) {
            Biggest = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }

        byte count = 2;
        while (count <= 10) {
        System.out.println("please enter the " + count + "st number: ");
        int Num;
        while (true) {
        if (scan.hasNextInt()) {
            Num = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        if (Biggest < Num) {
            Biggest = Num;
        }
        count++;
        }
        System.out.println("the biggest number is " + Biggest);
    }
    //Task 6: Secret Number Game
    public static void task5(){
    int SecretNumber = 83;
        System.out.println("Guess the secret number: ");
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int Guess;
        while (true) {
        if (scan.hasNextInt()) {
            Guess = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        while (count != 10 && Guess != SecretNumber) {
            if (Guess < SecretNumber) {
                System.out.println("Your Guess is too low! Try again: ");
            }
            else {
                System.out.println("Your Guess is too high! Try again: ");
            }
        while (true) {
        if (scan.hasNextInt()) {
            Guess = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
            count++;
        }
        if (count == 10) {
            System.out.println("Sorry, you've used all your attempts. The secret number was: " + SecretNumber);
        }
        else{
        System.out.println("Congratulations! You've guessed the secret number! The secret number is: " + SecretNumber);
    }
}
    //Task 7: How many days in any month... ever?
    public static void task6(){
        System.out.println("please enter the year: ");
        Scanner scan = new Scanner(System.in);
        double Year; 
        while (true) {
        if (scan.hasNextInt()) {
            Year = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        System.out.println("please enter the month: ");
        int Month;
        while (true) {
        if (scan.hasNextInt()) {
            Month = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
//checking the value to be correct:
        if (Month < 1 || Month > 12) {
            System.out.println("please reenter the month month:");
            scan.close();
            return;
        }
        if (Year < 0) {
            System.out.println("please reenter the year:");
            scan.close();
            return;
        }
//if Century Year:
        double Century = Year % 100;
        boolean isCentury = false;
        if (Century == 0) {
            isCentury = true;
        }
//is leap year:
        if (Year / 4 % 1 == 0 && isCentury == false || isCentury == true && Year / 400 % 1 == 0) {
            if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
                System.out.println("The month has 31 days, and it is a leap year");
            } else if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
                System.out.println("The month has 30 days, and it is a leap year");
            } else if (Month == 2) {
                System.out.println("The month has 29 days, and it is a leap year");
            }
        }
//not a leap year:
        else {
            if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
                System.out.println("the month has 31 days, and it is not a leap year");
            } else if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
                System.out.println("The month has 30 days, and it is not a leap year");
            } else if (Month == 2) {
                System.out.println("The month has 28 days, and it is not a leap year");
            }
        }
    }
    //Task 9: Creating and Accessing Arrays
    public static void task7(){
        int count = 1;
        Scanner scan = new Scanner(System.in);
        int[] Numbers = new int[10];
        while (count <= 10) {
            System.out.print("Please enter the " + count + "th number: ");
            int num;
        while (true) {
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
            Numbers[count - 1] = num;
            count++;
        }
        System.out.print("Please enter a number to search for: ");
        int searching;
        while (true) {
        if (scan.hasNextInt()) {
            searching = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        boolean end = false;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == searching) {
                System.out.println("Found " + searching + " at index " + i);
                end = true;
            }
        }
            if (end == false) {
            System.out.println(searching + " not found in this array.");
        }
    }
    //Task 10: Parallel Arrays
    public static void task8(){
        String[] studentFirstName = {"Benji", "Willy", "Andy", "Lucy", "Danny"};
        String[] studentFamilyName = {"Bei", "Zhang", "Li", "Chen", "Wang"};
        int[] studentHeight = {183, 182, 181, 300, 192};
        
        // Find the highest and lowest height
        int Highest = 0;
        int Lowest=0;

        for (int i = 1; i <= 4; i++) {
            if (studentHeight [i] > studentHeight[Highest]){
                Highest = i;
            }
            if (studentHeight [i] < studentHeight[Lowest]){
                Lowest = i;
            }
        }
        //finding the average height
        int totalHeight = 0;
        double averageHeight;
        for (int i = 0; i < studentHeight.length; i++) {
            totalHeight = totalHeight + studentHeight [i];
        }
        averageHeight = totalHeight / studentHeight.length;


        //The table
        System.out.println("First Name\tFamily Name\tHeight (cm)");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < studentFirstName.length; i++) {
            System.out.println(studentFirstName[i] + "\t\t" + studentFamilyName[i] + "\t\t" + studentHeight[i]);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("The average height is : " + averageHeight + " cm");
        System.out.println("The highest person is : " + studentFirstName[Highest] + " " + studentFamilyName[Highest]);
        System.out.println("The lowest person is : " + studentFirstName[Lowest] + " " + studentFamilyName[Lowest]);
    }
    //Task 11: 2D Arrays
    public static void task9(){
        int[][] TEMP = {
        {10, 11, 12, 13, 10},
        {10, 13, 14, 12, 12},
        {13, 13, 14, 15, 12},
        {16, 17, 17, 17, 16},
        {22, 23, 24, 24, 24},
        {26, 25, 24, 25, 26},
        {29, 28, 26, 27, 26},
        {29, 28, 27, 28, 28},
        {24, 23, 24, 25, 25},
        {20, 21, 22, 23, 24},
        {15, 16, 17, 18, 18},
        {12, 11, 13, 11, 11},
        };
        int month = 0;
        int city = 0;
        int finalMonth;
        int finalCity;
        for (month = 0; month < 12; month++) {
            finalMonth = month + 1;
            System.out.println("--------------------");
            System.out.println("Month: " + finalMonth);
            System.out.println("--------------------");
        for (city = 0; city <= 4; city++) {
            finalCity = city + 1;
            System.out.println("  City " + finalCity + ": " + TEMP[month][city] + " degrees");
            
        }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month (1-12): ");
        int inputMonth;
        while (true) {
        if (scan.hasNextInt()) {
            inputMonth = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        System.out.println("Enter the city (1-5): ");
        int inputCity;
        while (true) {
        if (scan.hasNextInt()) {
            inputCity = scan.nextInt();
            break;
            } else {
            System.out.println("Please enter an interger.");
            scan.next();
            System.out.println(" ");
            }
        }
        if (inputMonth >= 1 && inputMonth <= 12 && inputCity >= 1 && inputCity <= 5) {
            int temperature = TEMP[inputMonth - 1][inputCity - 1];
            System.out.println("The temperature for month " + inputMonth + " in city " + inputCity + " is: " + temperature + " degrees");
        } else {
            System.out.println("Please enter a month between 1 and 12 and a city between 1 and 5.");
        }
    }
    //Task 12: Converting 2D Arrays into 1D Arrays
    public static void task10(){
            int[][] TEMP = {
            {10, 11, 12, 13, 10},
            {10, 13, 14, 12, 12},
            {13, 13, 14, 15, 12},
            {16, 17, 17, 17, 16},
            {22, 23, 24, 24, 24},
            {26, 25, 24, 25, 26},
            {29, 28, 26, 27, 26},
            {29, 28, 27, 28, 28},
            {24, 23, 24, 25, 25},
            {20, 21, 22, 23, 24},
            {15, 16, 17, 18, 18},
            {12, 11, 13, 11, 11}
        };

        int[] city1 = new int[12];
        int[] city2 = new int[12];
        int[] city3 = new int[12];
        int[] city4 = new int[12];
        int[] city5 = new int[12];


        for (int month = 0; month < 12; month++) {
            city1[month] = TEMP[month][0];
            city2[month] = TEMP[month][1];
            city3[month] = TEMP[month][2];
            city4[month] = TEMP[month][3];
            city5[month] = TEMP[month][4];
        }

        // City names
        String[] names = {"London", "Dublin", "Beijing", "Rome", "New York"};
        int[][] cities = {city1, city2, city3, city4, city5};

        for (int c = 0; c < 5; c++) {
            System.out.println("\nCity " + (c + 1) + ": " + names[c]);
            for (int m = 0; m < 12; m++) {
                System.out.println("  Month " + (m + 1) + ": " + cities[c][m] + "°C");
            }
        }

        System.out.println("\n Averages:");
        for (int c = 0; c < 5; c++) {
            int sum = 0;
            for (int m = 0; m < 12; m++) {
                sum += cities[c][m];
            }
            System.out.println(names[c] + ": " + (sum / 12.0));
        }
    }
}