package Assignment_1;

import java.util.Objects;
import java.util.Scanner;

public class Velidate_String_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String--");
        String n = sc.next();

        String[] split = n.split("UIU[0-9]");

        if (split.length == 2) {

            String[] arr1 = new String[split[0].length()];
            for (int i = 0; i < split[0].length(); i++) {
                arr1[i] = split[0].substring(i, i + 1);
            }
            String[] arr2 = new String[split[1].length()];
            for (int i = 0; i < split[1].length(); i++) {
                arr2[i] = split[1].substring(i, i + 1);
            }
            if (arr1.length == arr2.length) {
                for (int i = 0; i < arr1.length; i++) {
                    if (split[0].charAt(i) >= 97 && split[0].charAt(i) <= 122 || split[1].charAt(i) >= 97 && split[1].charAt(i) <= 122) {
                        if (arr1[i].equals(arr2[i])) {
                            System.out.println("Valid");
                            break;
                        }else{
                            System.out.println("Not 2 Valid");
                            break;
                        }
                    } else {
                        System.out.println("Not 1 Valid");
                        //break;
                    }

                }


            }
        }else{
            System.out.println("InValid");

        }
    }
}


