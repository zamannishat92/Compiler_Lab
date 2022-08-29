package Mid;

import java.util.Scanner;

public class Q2 {
    public static void Validate_String() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number--");
        String num = sc.next();
        int flag1=0;
        if (num.charAt(0) == 66 && num.charAt(num.length() - 1) == 66) {
            if(num.charAt(1)==1 ||num.charAt(1)==3 ||num.charAt(1)==5 ||num.charAt(1)==7 ||num.charAt(1)==9 ){
                if(num.charAt(2)==1 ||num.charAt(2)==3 ||num.charAt(2)==5 ||num.charAt(2)==7 ||num.charAt(2)==9 ){
                    if(num.charAt(3)==1 ||num.charAt(3)==3 ||num.charAt(3)==5 ||num.charAt(3)==7 ||num.charAt(3)==9 ){
                        flag1++;
                    }else{
                        System.out.println("InValid");
                    }

                }else{
                    System.out.println("INValid");
                }
            }
            int m= num.length()-4;
            String[] array1 = new String[num.length()];
            for (int i = m; i < num.length(); i++) {
                array1[i] = num.substring(i, i + 1);
            }
            if(array1[m].equals("t")&&array1[m+1].equals("r")&&array1[m+2].equals("u")&&array1[m+3].equals("e")||array1[m].equals("f")&&array1[m+1].equals("a")&&array1[m+2].equals("l")&&array1[m+3].equals("s")&&array1[m+4].equals("e")){

            }


        }else{
            System.out.println("InValid");
        }
    }
    public static void main(String[] args) {
        int n = 0;
        while (n == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.String validation.");
            System.out.println("2.Exit.");
            System.out.println("Enter your choice");
            int num = sc.nextInt();

            if (num == 1) {
                Validate_String();
            } else {
                n++;
            }
        }
    }
}
