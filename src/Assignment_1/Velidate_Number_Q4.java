package Assignment_1;

import java.util.Scanner;

public class Velidate_Number_Q4 {
    public static void num_func(String num) {
        String[] array = new String[num.length()];
        for (int i = 0; i < num.length(); i++) {
            array[i] = num.substring(i, i + 1);
        }
        int flag1 = 0, flag2 = 0, flag3 = 0;
        if (array[num.length() - 1].equals(".")) {
            System.out.println("Not Valid");
        } else {
            if (num.length() == 1) {
                if (array[0].equals("0") || array[0].equals("1") || array[0].equals("2") || array[0].equals("3") || array[0].equals("4") || array[0].equals("5") || array[0].equals("6") || array[0].equals("7") || array[0].equals("8") || array[0].equals("9")) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Not Valid");
                }
            } else {

                if (array[0].equals("+") || array[0].equals("-") || array[0].equals(".") || array[0].equals("0") || array[0].equals("1") || array[0].equals("2") || array[0].equals("3") || array[0].equals("4") || array[0].equals("5") || array[0].equals("6") || array[0].equals("7") || array[0].equals("8") || array[0].equals("9")) {
                    for (int i = 1; i < num.length(); i++) {
                        if (num.charAt(i) >= 48 && num.charAt(i) <= 57) {
                            flag1++;
                        }
                        if (num.charAt(i) >= 33 && num.charAt(i) <= 45 || num.charAt(i) == 47 || num.charAt(i) >= 58 && num.charAt(i) <= 126) {
                            flag3++;
                        }if (num.charAt(i) == 46) {
                            flag2++;
                        }
                    }

                    if (flag3 == 0) {
                        if (flag1 != 0) {
                            if (flag2 == 0 || flag2 == 1) {
                                System.out.println("Valid");
                            } else {
                                System.out.println("Not Valid");
                            }
                        } else {
                            System.out.println("Not Valid");
                        }
                    } else {
                        System.out.println("Not Valid");
                    }
                }
            }
        }
    }


       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number--");
        String num = sc.next();
        num_func(num);
    }
}