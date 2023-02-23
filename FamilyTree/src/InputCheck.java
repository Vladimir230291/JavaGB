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

    public LocalDate CheckBirthDate(String date) {
        if (date.matches("\\d{4} \\d{2} \\d{2}")) {


            String[] dateSplit = date.split(" ");
            int year = Integer.parseInt(dateSplit[0]);
            int month = Integer.parseInt(dateSplit[1]);
            int day = Integer.parseInt(dateSplit[2]);

            if (year <= LocalDate.now().getYear()
                    && month <= 12
                    && day <= 31)

                return LocalDate.of(year, month, day);
        }
        System.out.println("Неверный формат даты");
        return null;
    }

}


