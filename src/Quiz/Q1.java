package Quiz;

import java.util.Scanner;

public class Q1 {
    public static void func(String input) {
        String[] s1 = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            s1[i] = input.substring(i, i + 1);
        }
        int l=s1.length-5;
        int flag=0,flag1=0;
        for (int i = 0; i < s1.length; i++) {
            if (s1.length >= 12 && s1.length <= 16) {
                if (s1[0].endsWith("+") || s1[0].endsWith("-") || s1[0].endsWith("null")) {
                    if (s1[1].endsWith("U") && s1[2].endsWith("I") && s1[3].endsWith("U")) {
                        if (s1[4].endsWith("@") || s1[4].endsWith("#") || s1[4].endsWith("$")) {
                            for (int j = 5; j <= l; j++) {
                                if (input.charAt(j) >= 97 && input.charAt(j) <= 122) {
                                    flag++;
                                }
                            }
                            if (flag != 0) {
                                if (s1[l + 1].endsWith("1") || s1[l + 1].endsWith("2") || s1[l + 1].endsWith("3") || s1[l + 1].endsWith("4") || s1[l + 1].endsWith("5")) {
                                    if (s1[l + 2].endsWith("0") || s1[l + 2].endsWith("1") || s1[l + 2].endsWith("2") || s1[l + 2].endsWith("3") || s1[l + 2].endsWith("4") || s1[l + 2].endsWith("5") || s1[l + 2].endsWith("6") || s1[l + 2].endsWith("7") || s1[l + 2].endsWith("8") || s1[l + 2].endsWith("9")) {
                                        if (s1[l + 3].endsWith("0") || s1[l + 3].endsWith("1") || s1[l + 3].endsWith("2") || s1[l + 3].endsWith("3") || s1[l + 3].endsWith("4") || s1[l + 3].endsWith("5") || s1[l + 3].endsWith("6") || s1[l + 3].endsWith("7") || s1[l + 3].endsWith("8") || s1[l + 3].endsWith("9")) {
                                            if (s1[l + 4].endsWith("1") || s1[l + 4].endsWith("2") || s1[l + 4].endsWith("3") || s1[l + 4].endsWith("4") || s1[l + 4].endsWith("5") || s1[l + 4].endsWith("6") || s1[l + 4].endsWith("7") || s1[l + 4].endsWith("8") || s1[l + 4].endsWith("9")) {
                                                if (input.charAt(input.length() - 1) >= 97 && input.charAt(input.length() - 1) <= 122) {
                                                    flag1++;
                                                }
                                            } else {
                                                System.out.println("Invalid");
                                                break;
                                            }
                                        } else {
                                            System.out.println("Invalid.");
                                            break;

                                        }
                                    }
                                }

                            } else {
                                System.out.println("Invalid.");
                                break;
                            }
                        }
                        else{
                                System.out.println("Invalid.");
                                break;
                            }
                        } else {
                            System.out.println("Invalid.");
                            break;
                        }
                    } else {
                        System.out.println("InValid");
                        break;
                    }
                }
            }
        if(flag!=0){
            System.out.println("valid");
        }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        int x=0;
        while(x==0){
            int x1 = sc.nextInt();
            if(x1==1){
                func(input);
            }

        }

    }
}
