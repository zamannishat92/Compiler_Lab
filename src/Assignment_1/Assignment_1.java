package Assignment_1;

import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {
        int n=0;
        while(n==0){
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Id validation.");
            System.out.println("2.mail validation.");
            System.out.println("3.Password Validation.");
            System.out.println("4.Number validation.");
            System.out.println("5.String validation.");
            System.out.println("6.Exit.");
            System.out.println("Enter your choice");
            int num=sc.nextInt();

            if(num==1){
                Validate_Id_Q1();
            }
            else if(num==2){
                Validate_Email_Q2();
            }
            else if(num==3){
                Validate_Password_Q3();
            }
            else if(num==4){
                Validate_Number_Q4();
            }
            else if(num==5){
                Validate_String_Q5();
            }
            else{
                n++;
            }

        }
    }
    public static void Validate_Id_Q1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the id--");
        String n = sc.next();
        int[] a = new int[n.length()];

        for(int i=0 ; i<n.length() ; i++){
            a[i] = Integer.parseInt(n.substring(i,i+1));
        }
        if(n.length()==9){
            if(a[0]== 0&& a[1]== 1&&a[2]==1){
                if(a[3]==0&& a[4]==5||a[3]==0&& a[4]==6||a[3]==0&& a[4]==7||a[3]==0&& a[4]==8||a[3]==0&& a[4]==9||a[3]==1&& a[4]==0||a[3]==1&& a[4]==1||a[3]==1&& a[4]==2||a[3]==1&& a[4]==3||a[3]==1&& a[4]==4||a[3]==1&& a[4]==5||a[3]==1&& a[4]==6||a[3]==1&& a[4]==7||a[3]==1&& a[4]==8||a[3]==1&& a[4]==9||a[3]==2&& a[4]==0){
                    if(a[5]==1||a[5]==2||a[5]==3) {
                        if (a[6] == 0 || a[6] == 1 || a[6] == 2 || a[6] == 3 || a[6] == 4 || a[6] == 5 || a[6] == 6 || a[6] == 7 || a[6] == 8 || a[6] == 9) {
                            if(a[7] == 0 || a[7] == 1 || a[7] == 2 || a[7] == 3 || a[7] == 4 || a[7] == 5 || a[7] == 6 || a[7] == 7 || a[7] == 8 || a[7] == 9){
                                if( a[8] == 1 || a[8] == 2 || a[8] == 3 || a[8] == 4 || a[8] == 5 || a[8] == 6 || a[8] == 7 || a[8] == 8 || a[8] == 9){
                                    System.out.println("Valid");
                                }else{
                                    System.out.println("In Valid");
                                }

                            }else{
                                System.out.println("In 1 Valid");
                            }

                        } else {
                            System.out.println("In 2 Valid");
                        }
                    }else{
                        System.out.println("in 3 valid");
                    }
                }else{
                    System.out.println("In 4 Valid");
                }
            }else{
                System.out.println("In 5 Valid");
            }
        }else{
            System.out.println("In 6 valid");
        }
    }
    public static void Validate_Email_Q2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email--");
        String email=sc.next();

        try{
            String[] splits=email.split("@");
            String l = splits[0];
            String r = splits[1];

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
        }catch(Exception e){
            System.out.println("Not valid");
        }
    }
    public static void Validate_Password_Q3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password--");
        String pass = sc.next();

        String[] s1 =new String[pass.length()];
        for(int i=0;i<pass.length();i++){
            s1[i] = pass.substring(i,i+1);
        }
        if(pass.length()>=8){
            for(int i=0;i<=pass.length()-1;i++){
                if(pass.charAt(i)>=65 && pass.charAt(i)<=90 || pass.charAt(i)>=97 && pass.charAt(i)<=122 || pass.charAt(i)>=48 && pass.charAt(i)<=57 ||pass.charAt(i)==64 || pass.charAt(i)==35 || pass.charAt(i)==37 ||pass.charAt(i)==38){
                    if(i==pass.length()-1){
                        if(s1[pass.length()-1].equals("P")){
                            System.out.println("Valid ");
                            break;
                        }else{
                            System.out.println("Not Valid");
                            break;
                        }
                    }

                }else{
                    System.out.println("Not Valid");
                    break;
                }
            }
        }else{
            System.out.println("not  Valid");
        }
    }
    public static void Validate_Number_Q4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number--");
        String num = sc.next();

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
    public static void Validate_String_Q5(){
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
                            System.out.println("Not  Valid");
                            break;
                        }
                    } else {
                        System.out.println("Not  Valid");
                        break;
                    }

                }


            }
        }else{
            System.out.println("InValid");

        }
    }
}


