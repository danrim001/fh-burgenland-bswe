import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * REST-Controller zur Verarbeitung von Anfragen, die mit Zeichenketten arbeiten.
 * Dieser Controller bietet einen Endpunkt, der eine übergebene Zeichenkette in Großbuchstaben umwandelt.
 */
@RestController
public class StringController {

    @Autowired
    private StringService stringService;

    /**
     * Endpunkt zum Umwandeln einer Zeichenkette in Großbuchstaben.
     * Dieser Endpunkt wird durch eine GET-Anfrage aufgerufen und erwartet einen String-Parameter.
     * 
     * @param text die Zeichenkette, die in Großbuchstaben umgewandelt werden soll
     * @return die Zeichenkette in Großbuchstaben
     */
    @GetMapping("/upper")
    public String upper(@RequestParam(value = "string") final String text) {
        return stringService.toUpperCase(text);
    }
}