public class ShopWindows extends Subject implements  Describable{

    public ShopWindows() {
        super("витрины магазинов", Conditions.ОСВЕЩЕННЫЕ);
    }

    public ShopWindows(String name) {
        super(name);
    }

    public ShopWindows(String name, String condition) {
        super(name, condition);
    }

    public ShopWindows(String name, Conditions conditions) {
        super(name, conditions);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это красивые окна, в которых стоят чудесные горшочки для растений. ", name);
        System.out.println();
    }
}
