package figures;

import java.util.HashMap;
import java.util.Map;

public class FigureDictionary {
    public Map<String, Figure> dictionary;

    public FigureDictionary() {
        dictionary = new HashMap<>();
        dictionary.put("Line", new Line());
        dictionary.put("Triangle", new Triangle());
        dictionary.put("Square", new Square());
        dictionary.put("Rectangle", new Rectangle());
        dictionary.put("Romb", new Romb());
    }
}
