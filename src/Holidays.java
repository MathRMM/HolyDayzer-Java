import java.util.Date;
import java.text.SimpleDateFormat;

public class Holidays {
    private String date;
    private String holiday;

    public Holidays(String date, String holiday) {
        this.date = date;
        this.holiday = holiday;
    }

    public String getData() {
        return date;
    }

    public String getHoliday() {
        return holiday;
    }

    public static Holidays[] allHolidays() {
        return new Holidays[] {
                new Holidays("01/01/2023", "Confraternização mundial"),
                new Holidays("21/02/2023", "Carnaval"),
                new Holidays("17/04/2023", "Páscoa"),
                new Holidays("21/04/2023", "Tiradentes"),
                new Holidays("01/05/2023", "Dia do trabalho"),
                new Holidays("08/06/2023", "Corpus Christi"),
                new Holidays("07/09/2023", "Independência do Brasil"),
                new Holidays("12/10/2023", "Nossa Senhora Aparecida"),
                new Holidays("02/11/2023", "Finados"),
                new Holidays("15/11/2023", "Proclamação da República"),
                new Holidays("25/12/2023", "Natal")
        };
    }

    public String isHoliday(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateFormat = format.parse(date);
            Holidays[] holidays = allHolidays();
            for (Holidays holiday : holidays) {
                Date dayHoliday = format.parse(holiday.getData());
                if (dateFormat.compareTo(dayHoliday) == 0) {
                    return holiday.getHoliday();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Essa data não possui um feriado";
    }

}