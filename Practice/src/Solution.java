import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        ArrayList<Integer> rowCount = new ArrayList<Integer>();
        int lines = scan.nextInt();
        for (int i = 0; i < lines; i++){
            int numOfIntegers = scan.nextInt();
            rowCount.add(numOfIntegers);
            for (int j = 0; j < numOfIntegers; j++){
                integerList.add(scan.nextInt());
            }
        }
        
        int queries = scan.nextInt();

        for (int k = 0; k < queries; k++){
            int line = scan.nextInt();
            int position = scan.nextInt();
            try
        }
        scan.close();
    }
}