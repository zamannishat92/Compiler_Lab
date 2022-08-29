package Assignment_3;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Assign_3 {
    public static int check_Precedence(char c){
        if(c=='+'||c=='-'){
            return 1;
        }else if(c=='*'||c=='/'){
            return 2;
        }else if(c=='^'){
            return 3;
        }
        return -1;
    }
    static float evalPostfix(String express) {
        Stack<Float> st = new Stack<>();
        char[] arr = express.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+') {
                float value1 = st.pop();
                float value2 = st.pop();
                st.push(value2 + value1);
                break;
            } else if (arr[i] == '-') {
                float value1 = st.pop();
                float value2 = st.pop();
                st.push(value2 - value1);
                break;
            } else if (arr[i] == '*') {
                float value1 = st.pop();
                float value2 = st.pop();
                st.push(value2 * value1);
                break;
            } else if (arr[i] == '/') {
                float value1 = st.pop();
                float value2 = st.pop();
                st.push(value2 / value1);
                break;
            } else if (arr[i] == '^') {
                float value1 = st.pop();
                float value2 = st.pop();
                float r=value2;
                if(value1>0){
                    for(int j=0;j<value1-1;i++){
                        r=r*value2;
                    }
                    st.push(r);
                }else {
                    for(int j=0;j<value1*(-1)-1;j++){
                        r=r*value2;
                    }
                    r=1/r;
                    st.push(r);
                }

            }else {
                st.push(Float.parseFloat(String.valueOf(arr[i])));
            }
        }
        return st.peek();
    }

    public static String infix_to_Postfix(String sc2) {
        String output = " ";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sc2.length(); i++) {
            char c = sc2.charAt(i);
            if (check_Precedence(c) > 0) {
                while (stack.isEmpty() == false && check_Precedence(stack.peek()) >= check_Precedence(c)) {
                    output += stack.pop();
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                char m = stack.pop();
                while (c != '(') {
                    output += m;
                    m = stack.pop();
                }
            } else {
                output += c;
            }
        }
        for (int j = 0; j <= stack.size(); j++) {
            output += stack.pop();
        }
        return output;
    }
    public static String modifyString(String expression){
        String[] array=new String[expression.length()];
        for (int i = expression.length()-1; i>=0;i--) {
            array[expression.length()-1-i]=expression.substring(i, i+1);
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(")")){
                array[i]="(";
            }else if(array[i].equals("(")){
                array[i]=")";
            }
        }
        StringBuilder builder = new StringBuilder();
        for(String s:array){
            builder.append(s);
        }
        String expression1=builder.toString();
        return expression1;
    }
    public static String infix_To_Prefix(String sc2){
        String input=modifyString(sc2);
        String output = " ";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <input.length(); i++) {
            char c = input.charAt(i);
            if (check_Precedence(c) > 0) {
                while (stack.isEmpty() == false && check_Precedence(stack.peek()) >= check_Precedence(c)) {
                    output += stack.pop();
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                char m = stack.pop();
                while (c != '(') {
                    output += m;
                    m = stack.pop();
                }
            } else {
                output += c;
            }
        }
        for (int j = 0; j <= stack.size(); j++) {
            output += stack.pop();
        }
        String[] arr=new String[output.length()];
        for(int i=output.length()-1;i>=0;i--){
            arr[output.length()-1-i]=output.substring(i, i+1);
        }
        StringBuilder builder = new StringBuilder();
        for(String s:arr){
            builder.append(s);
        }
        String output1=builder.toString();
        return output1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String s1="console";
        String s2="file";
        String s3="Exit";
        if(input.equals(s1)){
            System.out.println("Enter the reguler Expression-");
            String exp = sc.next();
            System.out.println(exp);
            System.out.println("Enter your Choice-");
            System.out.println("1.Infix to Prefix");
            System.out.println("2.Infix to PostFix");
            int x = sc.nextInt();
            if(x==1){
                System.out.println("The Prefix Expression-"+infix_To_Prefix(exp));
            }else if(x==2){
                System.out.println("The Postfix Expression-"+infix_to_Postfix(exp));
            }


        }else if(input.equals(s2)){
            System.out.println("Enter the file path-");
            String path = sc.next();
            try {
                File f = new File(path);
                Scanner sc1 = new Scanner(f);
                String sc2 = sc1.next();
                System.out.println(sc2);
                System.out.println("Enter your Choice-");
                System.out.println("1.Infix to Prefix");
                System.out.println("2.Infix to PostFix");
                int x = sc.nextInt();
                if(x==1){
                    FileWriter out = new FileWriter(path,true);
                    out.write(String.valueOf(infix_To_Prefix(sc2)));
                    out.close();
                }else if(x==2){
                    FileWriter out = new FileWriter(path,true);
                    out.write(String.valueOf(infix_to_Postfix(sc2)));
                    out.close();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else if(input.equals(s3)){

        }
    }
}
