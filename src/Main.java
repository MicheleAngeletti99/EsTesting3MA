import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = stringToDate(dateString);
        String formatted = formattazioneItaliana(data);
        System.out.println(formatted);
    }

    public static String formattazioneItaliana(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }

    public static OffsetDateTime stringToDate(String dateString) {
        return OffsetDateTime.parse(dateString);
    }
}