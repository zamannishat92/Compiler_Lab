package Assignment_1;

import java.util.Scanner;

public class Velidate_Password_Q3 {
    public static void pass_func(String pass){
        String[] s1 =new String[pass.length()];
        for(int i=0;i<pass.length();i++){
            s1[i] = pass.substring(i,i+1);
        }
        if(pass.length()>=8){
           for(int i=0;i<pass.length()-1;i++){
               if(pass.charAt(i)>=65 && pass.charAt(i)<=90 || pass.charAt(i)>=97 && pass.charAt(i)<=122 || pass.charAt(i)>=48 && pass.charAt(i)<=57 ||pass.charAt(i)==64 || pass.charAt(i)==35 || pass.charAt(i)==37 ||pass.charAt(i)==38){
                   if(s1[pass.length()-1].equals("P")){
                       System.out.println("Valid ");
                       break;
                   }else{
                       System.out.println("Not Valid");
                       break;
                   }
               }else{
                   System.out.println("Not Valid");
                   break;
               }
           }
        }else{
            System.out.println("not 1 Valid");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password--");
        String pass = sc.next();
        pass_func(pass);
    }
}