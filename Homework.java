// Реализовать 2 метода класса Homework
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Homework {

    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            integers.add((int) (Math.random()*10));
//        }
//        System.out.println(integers);
//        removeEvenNumber(integers);

        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        System.out.println(strings);
        removeIntegers(strings); // [string, my_string]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        Iterator<Integer> col = numbers.iterator();
        while (col.hasNext()) {
            if (col.next()%2 == 0) {
                col.remove();
            }
        }
        System.out.println(numbers);
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator arrayListStr = strings.iterator();
        while(arrayListStr.hasNext()) {
            String next = arrayListStr.next().toString();
            try {
                Integer.parseInt(next);
                arrayListStr.remove();
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(strings);
    }
}