import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        int size = 20;
        List<Integer> list = new ArrayList<Integer>(size);
        for(int i = 0; i < size; i++)
        {
            list.add(i, (int)(Math.random()*100));
        }
        System.out.println(list);
        System.out.println("Минимальное значение: " + Integer.toString(getMin(list)));
        System.out.println("Максимальное значение: " + Integer.toString(getMax(list)));
        System.out.println("Среднее значение: " + Integer.toString(getAverage(list)));
        System.out.print("Удалены четные числа: ");
        System.out.println(removeEvenValue(list));
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list){
        int temp = 0;
        Iterator<Integer> item = list.iterator();

        while(item.hasNext())
        {
            temp = item.next();
            if(temp % 2 == 0)item.remove();
        }
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        int min = list.get(0);
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) < min) min = list.get(i);
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int max = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) > max)max = list.get(i);
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int result;
        int sum = 0;
        for(int i = 0; i < list.size(); i++)sum += list.get(i);
        result = sum/list.size();
        return result;
    }
}
