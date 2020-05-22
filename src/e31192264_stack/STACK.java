/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192264_stack;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Alvin Y
 */
public class STACK {

    static Stack zen = new Stack();
    static Scanner in = new Scanner(System.in);
    static String a;
    static String arr;
    static int max_st;
    static int i = 0;
    static int top = -1;
    //push berfungsi untuk memasukkan data
    static void pushh(Stack zen, String a) {
        zen.push((a).toString());
        System.out.println("Stack: " + zen);
    }
    //untuk mencari data
    public int find() {
        return (int) (top = top + 1);
    }
    //popp berfungsi untuk mengeluarkan data terakhir (atas)
    static void popp(Stack zen, String a) {
        a = (String) zen.pop();
        System.out.println("stack: " + zen);
    }

    public static void main(String[] args) { //method main
        System.out.print("Masukkan Max_Stack : ");
        max_st = in.nextInt();
        for (int i = 0; i < max_st; i++) {
            System.out.print("PUSH -> ");
            a = in.next();
            pushh(zen, a);
        }
        System.out.println("POP = y / anykeys=stop");
        while (!a.equals("n")) {
            System.out.print("POP ->  ");
            a = in.next();
            if (a.equals("y") && !zen.isEmpty()) {
                popp(zen, a);

            } else {
                System.out.println("apa stack kosong?  " + zen.isEmpty()); //output
                break;
            }

            System.out.println("apa stack kosong?  " + zen.isEmpty()); //output
            if (zen.isEmpty()) {
                System.out.println("stop");
                break;
            }
        }
    }
}
