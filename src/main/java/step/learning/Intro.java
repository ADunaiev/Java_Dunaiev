package step.learning;

import java.util.*;

public class Intro {
    public void demo() {
        System.out.println("Java intro");
        byte b = -10;                // цілі числа різної размірності
        short s = 1000;             // ! всі типи знакові, беззнакових - немає
        int i = 1000000000;           //
        long l = 1000000000000000000L;
        float f = 0.1f;
        double d = 1.23E-4;
        char c = 'A';
        boolean bb = true;
        //System.out.println(bb);

        int[] arr = new int[10];
        int[][] arr2;    // jagged - "рвані" масиви - з можливою різною кількістю у підмасивах.

        List<String> list1 = new ArrayList<>(); // <> - diamond operator
        List<String> list2 = new LinkedList<>();
        list1.add("Hello");    // String Pooling - компілятор веде перелік створених рядків
        list2.add("Hello");    // і друга поява рядка посилається на першу.
        if (list1.get(0).equals(list2.get(0))) {
            System.out.println("Equals");;
        } else {
            System.out.println("Not equals");
        }
        list1.add("World");
        list2.add("World !");


        Map<Integer, String> map = new HashMap<>();   // ~Dictionary, Integer - boxing(int)
        map.put(10, new String("Hello"));   // == reference equal - два посилання на один об'єкт
                                                   // для порівняння контенту слід вживати str1.equals(str2)

        map.put(11, "map World");

        if (list1.get(0) == map.get(10)) {
            System.out.println("Equals");;
        } else {
            System.out.println("Not equals");
        }

        for(String str : list1) {       // ~foreach
            System.out.print(str + " ") ;
        }
        System.out.println(" ");
        for(String str : list2) {       // ~foreach
            System.out.print(str + " ") ;
        }
        System.out.println(" ");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {       // ~foreach
            System.out.printf(
                    "%d => %s, ",  // формат з плейсхолдеров
                    entry.getKey(),  // значення для підстановки замість плейсхолдерів
                    entry.getValue()  // {get, set} у Java немає, тому прийнято створювати аксесори
            ) ;
        }

        // введеня даних
        Scanner kbScanner = new Scanner(System.in);  // сканер вхідного потоку, запити на його
        // читання зупиняють роботу та очікують введеня у консолі
        System.out.print("\nEnter your name: ");
        String name = kbScanner.nextLine(); // одне слово (~Console.Read)
        System.out.println("Hello " + name);
    }
}
/*
Після створення нового проєкту необхідно налаштувати конфігурацію запуску (за замовченням
запускається поточний файл).

Типи даних - всі референсні за винятком примітивів.
 */