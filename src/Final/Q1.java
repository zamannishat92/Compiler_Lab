package Final;

import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        String output= " ";
        try {
            File f = new File("In.txt");
            Scanner sc1 = new Scanner(f);
            String sc2 = sc1.nextLine();
            int v1 = 0;
            int v2 = 0;
            if(sc2.length()==2) {
                String[] split = sc2.split(" ");
                String l = split[0];
                v1 = Integer.parseInt(String.valueOf(l));
                String r = split[1];
                v2 = Integer.parseInt(String.valueOf(r));
            }else{
                System.out.println("Invalid!!");
            }
            File f1 = new File("Op.txt");
            Scanner sc3 = new Scanner(f);
            String sc4 = sc1.next();
            if(sc4.length()==1) {
                if (sc4 == "+") {
                    output = (String.valueOf(v1 + v2));
                } else if (sc4 == "-") {
                    output = (String.valueOf(v1 - v2));
                } else if (sc4 == "*") {
                    output = (String.valueOf(v1 * v2));;
                } else if (sc4 == "/") {
                    output = (String.valueOf(v1 / v2));
                }
            }else {
                System.out.println("Invalid!");
            }
            FileWriter out = new FileWriter("Out.txt",true);
            out.write(output);
            out.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
