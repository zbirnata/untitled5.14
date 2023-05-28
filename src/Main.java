import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Завдання 1
        String str1 = "";
        String str2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 5 слів");
        for (int i = 0; i < 5 ; i++) {
            str2 = sc.next();
            str1 = str1.concat(str2 + " ");
        }
        System.out.println(str1);

        //Завдання 2
        Scanner scan = new Scanner(System.in);
        String word = "";
        System.out.println("Введіть 5 слів");
        for (int i = 0; i < 5; i++) {
            word = scan.next();
            System.out.println(word.substring(0, 1));
        }

        //Завдання 3
        Scanner scann = new Scanner(System.in);

        double num1, num2, num3, maxNum;

        System.out.print("Введіть перше дробове число: ");
        if(scann.hasNextDouble()){
            num1 = scann.nextDouble();
            System.out.print("Введіть друге дробове число:");
            if(scann.hasNextDouble()){
                num2 = scann.nextDouble();
                System.out.print("Введіть третє дробове число: ");
                if(scann.hasNextDouble()){
                    num3 = scann.nextDouble();
                    maxNum = num1;
                    if (num2 > maxNum){
                        maxNum = num2;
                    }

                    if (num3 > maxNum){
                        maxNum = num3;
                    }
                    System.out.println("Найбільше дробове число: " + maxNum);
                } else {
                    System.out.println("Ви ввели не дробове число");
                }
            } else {
                System.out.println("Ви ввели не дробове число");
            }
        } else {
            System.out.println("Ви ввели не дробове число");
        }

        //Завдання 4
        Scanner input = new Scanner(System.in);
        String st1, st2 = "";

        System.out.println("Вкажіть перше ім'я");
        st1 = input.next();
        System.out.println("Вкажіть друге ім'я");
        st2 = input.next();

        if(st1.equalsIgnoreCase(st2)){
            System.out.println("Імена ідентичні");
        } else {
            System.out.println("Імена не ідентичні");
        }

        //Завдання 5
        Scanner scannner = new Scanner(System.in);
        String string1 = "";
        String string2 = "";


        System.out.println("Введіть рядок ");
        string1 = scannner.next();
        System.out.println("Введіть ще один рядок ");
        string2 = scannner.next();

        if(string1.length() > string2.length()){
            System.out.println("Перший рядок за кількістю символів більший від другого рядка");
        } else if (string2.length() > string1.length()){
            System.out.println("Другий рядок за кількістю символів більший від першого рядка");
        } else {
            System.out.println("Кількість символів у рядках рівна!");
        }
    }
}