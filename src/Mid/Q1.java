package Mid;

import java.util.Scanner;

public class Q1 {
    public static void Validate_String() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email--");
        String email = sc.next();

        try {
            String[] splits = email.split("UIU");
            String l = splits[0];
            String r = splits[1];
            String[] a1=new String[l.length()];
            for(int i=0;i<l.length();i++){
                a1[i]=l.substring(i, i+1);
            }
            int flag = 0;
            int m = l.length() - 1;
            for (int i = 0; i < m; i++) {
                if (l.charAt(i) >= 97 && l.charAt(i) <= 122) {
                    flag++;
                }
            }
            int j = 0;
            int[] array1 = new int[1];
            for (int i = m; i < l.length(); i++) {
                array1[j] = Integer.parseInt(a1[i]);
                j++;
            }
            if(flag!=0){
                if(array1[0]==35 || array1[0]==36 || array1[0]==64){
                    String[] a=new String[r.length()];
                    for(int i=0;i<r.length();i++){
                        a[i]=r.substring(i, i+1);
                    }
                    if(r.length()==5){
                        if(a[0].equals("1")||a[0].equals("2")||a[0].equals("3")){
                            if(a[1].equals("0")||a[1].equals("1")||a[1].equals("2")||a[1].equals("3")||a[1].equals("4")||a[1].equals("5")||a[1].equals("6")||a[1].equals("7")||a[1].equals("8")||a[1].equals("9")){
                                if(a[2].equals("0")||a[2].equals("1")||a[2].equals("2")||a[2].equals("3")||a[2].equals("4")||a[2].equals("5")||a[2].equals("6")||a[2].equals("7")||a[2].equals("8")||a[2].equals("9")){
                                    if(a[3].equals("1")||a[3].equals("2")||a[3].equals("3")||a[3].equals("4")||a[3].equals("5")||a[3].equals("6")||a[3].equals("7")||a[3].equals("8")||a[3].equals("9")){
                                        if(a[4].equals("+")||a[4].equals("-")){
                                            System.out.println("Valid");
                                        }else{
                                            System.out.println("InValid");
                                        }

                                    }else{
                                        System.out.println("InValid");
                                    }

                                    }else{
                                    System.out.println("InValid");
                                }
                            }else{
                                System.out.println("INValid");
                            }

                        }else{
                            System.out.println("InValid");

                        }
                    }else{
                        System.out.println("INValid");

                    }
                }else{
                    System.out.println("Not Valid");
                }

            }
        }catch(Exception e){
            System.out.println("Not valid");
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
