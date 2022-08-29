package Assignment_2;

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment_2_main {
    ArrayList<List> arr= new ArrayList<>();
    List list = new List();
    void insert(){
        int colon = 0;
        int comma = 0;
        int equal = 0;
        int flag=0;
        String name = null;
        String value = null;
        String Type = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String data = sc.nextLine();
        try {
            String[] splits = data.split(" ");
            Type = splits[0];
            String r = splits[1];
            for (int i = 0; i < r.length(); i++) {
                if (r.charAt(i) == ';') {
                    colon++;
                }
            }
            if (colon != 0) {
                for (int i = 0; i < r.length(); i++) {
                    if (r.charAt(i) == ',') {
                        comma++;
                    }
                }
                if (comma == 0) {
                    for (int i = 0; i < r.length(); i++) {
                        if (r.charAt(i) == '=') {
                            equal++;
                        }
                    }
                    if (equal == 0) {
                        String[] splits1 = r.split(";");
                        name = splits1[0];
                    } else {
                        String[] splits1 = r.split(";");
                        String[] splits2 = splits1[0].split("=");
                        name = splits2[0];
                        value = splits2[1];

                    }
                }
                else{
                    String[] splits1=r.split(";");
                    String[] splits2 =splits1[0].split(",");
                    for(int i=0;i<comma+1;i++){
                        for (int j = 0; j < splits2[i].length(); i++) {
                            if (splits2[i].charAt(j) == '=') {
                                equal++;
                            }
                        }
                        if (equal == 0) {
                            name = splits2[i];
                        } else {
                            String[] splits3 = splits2[i].split("=");
                            name = splits3[0];
                            value = splits3[1];
                        }
                        arr.add(new List(name,Type,value));
                        flag++;
                    }
                }
            }else{
                System.out.println("No semi-colon");
            }
        } catch (Exception e) {
            System.out.println("not Valid!");
        }
        if(flag==0){
            arr.add(new List(name,Type,value));
        }
        System.out.println("Yes insert!");

    }
    void remove(String name){
        int count=0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i).name.equals(name)){
                count=i;
                break;
            }
        }
        arr.remove(count);
        System.out.println("Yes Remove!");

    }
    void update(String name,String new_name,String new_value){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).name.equals(name)){
                arr.get(i).type=new_name;
                arr.get(i).value=new_value;
                break;
            }
        }
    }
    void print(){
        int j=1;
        for(int i=0;i<arr.size();i++){
            System.out.print(j+++"  ");
            System.out.println(arr.get(i).name+"  "+arr.get(i).type+"  "+arr.get(i).value);
        }

    }
    public static void main(String[] args){
        Assignment_2_main assig = new Assignment_2_main();
        int n=0;
        while (n == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Insert.");
            System.out.println("2.Remove.");
            System.out.println("3.Update.");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Insert choice-");
            int num = sc.nextInt();
            if(num==1){
                assig.insert();
            }else if(num==2){
                System.out.println("Enter the remove name");
                String rv=sc.next();
                assig.remove(rv);
            }else if(num==3){
                System.out.println("Enter the updated name");
                String name=sc.next();
                System.out.println("Enter the new type");
                String type=sc.next();
                System.out.println("Enter the new value");
                String value=sc.next();
                assig.update(name, type, value);
            }else if(num==4){
                assig.print();
            }else{
                n++;
            }
        }
    }
}