package Assignment_1;

import java.util.Scanner;

public class Velidate_ID_Q1 {
    public static void main(String[] args){
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
}
