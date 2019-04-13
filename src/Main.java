/*Получаешь на вход строку и печатаешь в консоль какое количество каких букв встречается в строке.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static BufferedReader inLine = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Write the text:");
        String input = inLine.readLine();
        charCounter(input);
    }

    private static void charCounter(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int size = input.length();
        for ( int i = 0; i < size; i++ ) {
            char c = input.charAt(i);
            Integer n = map.get(c); // get value through key
            if (n == null) map.put(c, 1); // ckeck if the key have value = null, put value = 1
            else map.put(c, ++n ); // if the key have value 1, do increase +1;
        }
        System.out.println(map);
    }
}
