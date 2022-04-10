package GB_JC_4_1;

import java.util.*;

public class Main {

    /**
     *  Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
     *  вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     *  Посчитать, сколько раз встречается каждое слово.
     */

    public static void main(String[] args) {

	    String[] words = {"I", "go", "home", "usually", "at", "eight", "at", "home", "but",
                "not", "I", "today", "I", "usually", "not", "I", "go","home","eight","at"};
        System.out.println("Array before: " + Arrays.toString(words) + "Total elements: " + words.length);
        HashSet set = new HashSet(Arrays.asList(words));
        System.out.println("List of unique words: " + set + " Total different elements: " + set.size());
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String i:words) {
            frequency.put(i, Collections.frequency(Arrays.asList(words),i));
        }
        System.out.println("Occurrence count: " + frequency);
    }
}
