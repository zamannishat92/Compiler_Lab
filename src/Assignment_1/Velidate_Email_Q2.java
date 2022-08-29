package Assignment_1;

import java.util.Scanner;


public class Velidate_Email_Q2 {
    public static void left_Check(String l,String r) {
        String[] a1=new String[l.length()];
        for(int i=0;i<l.length();i++){
            a1[i]=l.substring(i, i+1);
        }
        int flag = 0;
        int m = l.length() - 6;
        for (int i = 0; i < m; i++) {
            if (l.charAt(i) >= 97 && l.charAt(i) <= 122) {
                flag++;
            }
        }
        int j = 0;
        int[] array1 = new int[6];
        for (int i = m; i < l.length(); i++) {
            array1[j] = Integer.parseInt(a1[i]);
            j++;
        }
        if (flag != 0) {
            if(array1[0]==0||array1[0]==1||array1[0]==2 && array1[1]==0||array1[1]==1||array1[1]==2||array1[1]==3||array1[1]==4||array1[1]==5||array1[1]==6||array1[1]==7||array1[1]==8||array1[1]==9){
                if(array1[2]==1||array1[2]==2||array1[2]==3){
                    if(array1[3]==0||array1[3]==1||array1[3]==2||array1[3]==3||array1[3]==4||array1[3]==5||array1[3]==6||array1[3]==7||array1[3]==8||array1[3]==9){
                        if(array1[4]==0||array1[4]==1||array1[4]==2||array1[4]==3||array1[4]==4||array1[4]==5||array1[4]==6||array1[4]==7||array1[4]==8||array1[4]==9){
                            if(array1[5]==0||array1[5]==1||array1[5]==2||array1[5]==3||array1[5]==4||array1[5]==5||array1[5]==6||array1[5]==7||array1[5]==8||array1[5]==9){
                                right_Check(r);
                            }else{
                                System.out.println("Not  valid");
                            }
                        }else{
                            System.out.println("Not  valid");
                        }
                    }else{
                        System.out.println("Not  valid");
                    }
                }else{
                    System.out.println("Not  valid");
                }
            }else{
                System.out.println("Not  valid");
            }
        }
    }
    public static void right_Check(String r) {
        String[] a=new String[r.length()];
        for(int i=0;i<r.length();i++){
            a[i]=r.substring(i, i+1);
        }
        if(r.length()==15){
            if(a[0].endsWith("b")&&a[1].endsWith("s")&&a[2].endsWith("c")||a[2].endsWith("e")&&a[3].endsWith("s")||a[3].endsWith("e")&&a[4].endsWith("e")&&a[5].endsWith(".")){
                if(a[6].endsWith("u")&&a[7].endsWith("i")&&a[8].endsWith("u")&&a[9].endsWith(".")){
                    if(a[10].endsWith("a")&&a[11].endsWith("c")&&a[12].endsWith(".")){
                        if(a[13].endsWith("b")&&a[14].endsWith("d")){
                            System.out.println("Valid");
                        }else{
                            System.out.println("Not valid");
                        }
                    }else{
                        System.out.println("Not valid");
                    }
                }else{
                    System.out.println("Not valid");
                }
            }else{
                System.out.println("Not valid");
            }
        }else{
            System.out.println("Not Valid");
        }

    }

    public static void email(String email) {
        try{
            String[] splits=email.split("@");
            String m = splits[0];
            String n = splits[1];
            left_Check(m,n);
        }catch(Exception e){
            System.out.println("Not valid");
        }

    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email--");
        String email=sc.next();
        email(email);

    }

}

