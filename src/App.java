import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data no formato dd/mm/yyyy: ");
        String date = scanner.nextLine();

        Holidays newDate = new Holidays(null, null);
        String isHoliday = newDate.isHoliday(date);
        System.out.println(isHoliday);
    }
}
