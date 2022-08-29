package Practice_Evaluation;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_Evaluation {
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
            }  if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                int m = stack.pop();
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
                    float temp=1;
                    while (value1!=0){
                        temp*=value2;
                        --value1;
                    }
                    st.push(temp);
                }else {
                    float temp=1;
                    while (value1!=0){
                        temp*=value2;
                        ++value1;
                    }

                    temp=1/temp;
                    st.push(temp);
                }

            }else {
                st.push(Float.parseFloat(String.valueOf(arr[i])));
            }
        }
        return st.peek();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix-");
        String in=sc.next();
        float output=evalPostfix(in);
        System.out.println(output);

    }
}
