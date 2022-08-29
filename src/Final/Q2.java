package Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Q2 {
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
    static float evalPostfi(String express) {
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

            }else {
                st.push(Float.parseFloat(String.valueOf(arr[i])));
            }
        }
        return st.peek();
    }

    public static void main(String[] args){
        try {
            File f = new File("expression.txt");
            Scanner sc1 = new Scanner(f);
            String sc2 = sc1.next();
            if(sc2.length()==3) {
                String expression = infix_to_Postfix(sc2);
                float evaluate = (float) evalPostfi(expression);
                float res = evaluate * evaluate * evaluate;
                FileWriter out = new FileWriter("CubeOutput.txt", true);
                out.write(String.valueOf(res));
                out.close();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
