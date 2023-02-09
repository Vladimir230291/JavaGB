import java.time.LocalDate;

public class Vaccination {
    private LocalDate date;
    private String name;

//    Конструктор
    public Vaccination(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }
//get метод
    public LocalDate getDate(){
        return date;
    }
//set метод
    public void setDate(LocalDate date){
        this.date = date;
    }




    @Override
    public String toString() {
        return "Vaccination{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }


}


