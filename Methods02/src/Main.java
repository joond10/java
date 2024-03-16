//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greeting(5);
    }

    //Method
    //Public refers to access modifier
    //Static refers to the accessibility, it belongs to its class rather than instance, rather think of them as global
    public static void greeting(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello");
        }
    }
}

