package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {
    public boolean isPalindrome(String text){

        Queue<Character> original = new LinkedList<>();
        Queue<Character> invertida = new LinkedList<>();
        Queue<Character> aux = new LinkedList<>();

        for (int i = 0; i < text.length(); i++) {
            original.add(text.charAt(i));
            aux.add(text.charAt(i));
        }

        while (!aux.isEmpty()) {
            char letra = aux.remove();
            int size = invertida.size();
            for (int i = 0; i < size; i++) {
                invertida.add(invertida.remove());
            }
            invertida.add(letra);
        }

        while (!original.isEmpty()) {
            if (original.remove() != invertida.remove()) {
                return false;
            }
        }
        return true;
    }
}
