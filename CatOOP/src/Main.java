import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Барсик","Сибирская",
                LocalDate.of(2006,12,6),"Иванов");
        cat.addVaccination(new Vaccination(LocalDate.now(),"VCD-123"));
        cat.addVaccination(new Vaccination(LocalDate.of(2007,05,24),"VCD-31"));
        cat.addVaccination(new Vaccination(LocalDate.of(2007,07,10),"VCD-41"));
        cat.addVaccination(new Vaccination(LocalDate.of(2007,04,14),"VCD-422"));
        cats.add(cat);
        cat = new Cat("Мурз","Перс",// допускается перезапись переменной для добавления;
                LocalDate.of(2007,12,6),"Сидоров");
        cat.addVaccination(new Vaccination(LocalDate.now(),"VCD-123"));
        cat.addVaccination(new Vaccination(LocalDate.of(2007,05,24),"VCD-31"));
        cat.addVaccination(new Vaccination(LocalDate.of(2007,07,10),"VCD-41"));
        cat.addVaccination(new Vaccination(LocalDate.of(2007,04,14),"VCD-422"));
        cats.add(cat);

        cats.forEach(System.out::println);




    }
}