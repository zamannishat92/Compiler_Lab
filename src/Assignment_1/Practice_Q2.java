package Assignment_1;

import java.util.Scanner;

public class Practice_Q2 {
    public static void left_Check(String l) {
        String[] a1 = new String[l.length()];
        int flag = 0;
        int m = l.length() - 6;
        for (int i = 0; i < m; i++) {
            if (l.charAt(i) >= 97 && l.charAt(i) <= 122) {
                flag++;
            }
        }
        int j = 0;
        int[] a3 = new int[6];
        for (int i = m; i < l.length(); i++) {
            a3[j] = Integer.parseInt(a1[i]);
            j++;
        }
        if (flag != 0) {
            if (a3[3] == 0 && a3[4] == 5 || a3[3] == 0 && a3[4] == 6 || a3[3] == 0 && a3[4] == 7 || a3[3] == 0 && a3[4] == 8 || a3[3] == 0 && a3[4] == 9 || a3[3] == 1 && a3[4] == 0 || a3[3] == 1 && a3[4] == 1 || a3[3] == 1 && a3[4] == 2 || a3[3] == 1 && a3[4] == 3 || a3[3] == 1 && a3[4] == 4 || a3[3] == 1 && a3[4] == 5 || a3[3] == 1 && a3[4] == 6 || a3[3] == 1 && a3[4] == 7 || a3[3] == 1 && a3[4] == 8 || a3[3] == 1 && a3[4] == 9 || a3[3] == 2 && a3[4] == 0) {
                if (a3[5] == 1 || a3[5] == 2 || a3[5] == 3) {
                    if (a3[6] == 0 || a3[6] == 1 || a3[6] == 2 || a3[6] == 3 || a3[6] == 4 || a3[6] == 5 || a3[6] == 6 || a3[6] == 7 || a3[6] == 8 || a3[6] == 9) {
                        if (a3[7] == 0 || a3[7] == 1 || a3[7] == 2 || a3[7] == 3 || a3[7] == 4 || a3[7] == 5 || a3[7] == 6 || a3[7] == 7 || a3[7] == 8 || a3[7] == 9) {
                            if (a3[8] == 1 || a3[8] == 2 || a3[8] == 3 || a3[8] == 4 || a3[8] == 5 || a3[8] == 6 || a3[8] == 7 || a3[8] == 8 || a3[8] == 9) {
                                System.out.println("Valid");
                            } else {
                                System.out.println("In Valid");
                            }

                        } else {
                            System.out.println("In 1 Valid");
                        }

                    } else {
                        System.out.println("In 2 Valid");
                    }
                } else {
                    System.out.println("in 3 valid");
                }
            } else {
                System.out.println("In 4 Valid");
            }

        }
    }

    public static void email1(String email) {
        try {
            String[] splits = email.split("@");
            String l = splits[0];
            String r = splits[1];
            left_Check(l);
            right_Check(r);
        } catch (Exception e) {
            System.out.println("Not 10 valid");
        }

    }

    public static void right_Check(String r) {
        String delimeter2 = ".";
        String[] splits2 = r.split(delimeter2);
        String b1 = splits2[0];
        String b2 = splits2[1];
        String b3 = splits2[2];
        String b4 = splits2[3];

        String[] a1 = new String[b1.length()];
        String[] a2 = new String[b2.length()];
        String[] a3 = new String[b3.length()];
        String[] a4 = new String[b4.length()];

        for (int i = 0; i < r.length(); i++) {
            a2[i] = r.substring(i, i + 1);
        }
        if (b1.length() == 5 && b2.length() == 3 && b3.length() == 2 && b4.length() == 2) {
            if ("b".endsWith(a1[0]) && "s".endsWith(a1[1])) {
                if ("c".endsWith(a1[2]) || "e".endsWith(a1[2]) && "s".endsWith(a1[3]) || "e".endsWith(a1[3]) && "e".endsWith(a1[4])) {
                    //System.out.println("Valid");
                    if ("U".endsWith(a2[0]) && "I".endsWith(a2[1]) && "U".endsWith(a2[2])) {
                        if ("a".endsWith(a3[0]) && "c".endsWith(a3[1])) {
                            if ("b".endsWith(a4[0]) && "d".endsWith(a4[1])) {
                                System.out.println("Valid");
                            } else {
                                System.out.println("Not 1 Valid");
                            }

                        } else {
                            System.out.println(" Not 2 Valid");
                        }
                    } else {
                        System.out.println("Not 3 Valid");
                    }
                } else {
                    System.out.println("not 4 Valid");
                }
            } else {
                System.out.println("Not 5 Valid");
            }
        } else {
            System.out.println("Not 6 Valid");
        }

    }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email--");
        String email = sc.next();
        email1(email);

    }

}


