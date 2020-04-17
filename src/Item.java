import java.util.Map;

class Item {
    /**
     * Class for items that can be provided by coffee machine
     * Think of it like items on a menu (eg: espresso, latte)
     */

    String name;
    int cost;
    Map<String, Part> parts;

    Item(String name, int cost, Map<String, Part> parts) {
        this.name = name;
        this.cost = cost;
        this.parts = parts;
    }
}