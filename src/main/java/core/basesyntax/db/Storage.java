package core.basesyntax.db;

import core.basesyntax.model.Fruit;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    public static final Map<Fruit, Integer> fruitsDataBase = new HashMap<>();
}
// цей клас репрезинтує базу даних, де ми зберігаємо наші фрукти і їхню кількість
