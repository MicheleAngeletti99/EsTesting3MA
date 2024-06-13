import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    // Test del metodo formattazioneItaliana()
    @Test
    public void formattazioneItaliana() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dateString);
        String result = Main.formattazioneItaliana(data);
        String expected = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        assertEquals(expected, result);
    }

    // Test del metodo stringToDate()
    @Test
    public void stringToDate() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime result = Main.stringToDate(dateString);
        OffsetDateTime expected = OffsetDateTime.parse(dateString);

        assertEquals(expected, result);
    }
}