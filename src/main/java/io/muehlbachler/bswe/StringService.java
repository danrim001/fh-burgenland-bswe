import org.springframework.stereotype.Service;

/**
 * Service-Klasse für die Verarbeitung von Zeichenketten.
 * Diese Klasse bietet eine Methode, um einen übergebenen String in Großbuchstaben umzuwandeln.
 */
@Service
public class StringService {

    /**
     * Wandelt den übergebenen String in Großbuchstaben um.
     * 
     * @param string die Zeichenkette, die umgewandelt werden soll
     * @return die Zeichenkette in Großbuchstaben oder den ursprünglichen String, wenn dieser null ist
     */
    public String toUpperCase(final String string) {
        // FIXME: implement actual logic
        return string != null ? string.toUpperCase() : null;
    }
}