class Part {
    /**
     * Class for individual ingredient required by item or ocffee machine
     * Think of examples like milk, water, sugar required to be stored in
     * both the machine and needed to make an item
     */

    String name;
    int quantity;
    String unit;

    Part(String name, int quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
}