package task4;
/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */


import java.util.LinkedList;

public class task4_2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("Привет");
        list.add("hello");
        list.add(13);

        list = enqueue(list,778);
        System.out.println(list);
        System.out.println();

        var first = dequeue(list);
        System.out.println(first);
        System.out.println(list);
        System.out.println();

        var second = first(list);
        System.out.println(second);
        System.out.println(list);
    }
    static LinkedList enqueue (LinkedList<Object> list, Object element){
        list.add(list.size(),element);
        return list;
    }
    static Object dequeue(LinkedList<Object> list){
        Object result = list.get(0);
        list.remove(0);
        return result;
    }
    static Object first (LinkedList<Object> list){
        return list.get(0);
    }
}
