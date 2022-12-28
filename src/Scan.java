import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Scan {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            String sc = s.nextLine();
            arrayList.add(sc + " ");
            if (sc.endsWith("exit")) {
                break;
            }
            System.out.println("Eщё!!!");
        }
        System.out.println(arrayList);
    }
}
