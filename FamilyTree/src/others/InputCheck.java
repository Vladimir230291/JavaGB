package others;

import java.time.LocalDate;

public class InputCheck {
    public String CheckGender(String gender) {
        if (gender.toLowerCase().contains("м")) {
            return "Мужской";
        } else if (gender.toLowerCase().contains("ж")) {
            return "Женский";
        } else {
            return "Не указан";
        }
    }


}


