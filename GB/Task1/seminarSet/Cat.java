package GB.Task1.seminarSet;

import java.lang.Comparable;


public class Cat implements Comparable<Cat>  {
    private String name;  // поле
    private String color;
    public Cat(String name,String color){
        this.name = name;
        this.color = color;
    }
    // пример "как сравнивать"
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        // null != не null
        if (obj == null)
            return false;
        if (!(obj instanceof Cat))
            return false;
        Cat other = (Cat) obj; // локальная переменная
        return this.name.equals(other.name) && this.color.equals(other.color);
    }
    // "что выводить"

    @Override
    public String toString() {
        return String.format("%s - %s",name,color);
    }
// получение хэшкода
    @Override
    public int hashCode() {
        int hash = 0;
        hash = hash * 9 + 7 + name.hashCode(); // умножаем на любое не четное число добавляем число и "замешиваем полz"
        hash = hash * 9 + 7 + color.hashCode();
        return hash;
    }

    @Override
    public int compareTo(Cat other) {//Сравнение одного с другим  this.compareTo (other)
        if (this.name.compareTo(other.name) < 0)  // если первое меньше второго
            return -1;
        else if (this.name.compareTo(other.name) == 0) // усли первое равно второму
            return 0;
        else
            return 0;

    }
}
