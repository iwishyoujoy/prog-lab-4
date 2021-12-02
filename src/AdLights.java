public class AdLights extends Subject implements Describable{

    public AdLights() {
        super("гоньки реклам", Conditions.ЯРКИЕ);
    }

    public AdLights(String name) {
        super(name);
    }

    public AdLights(String name, String condition) {
        super(name, condition);
    }

    public AdLights(String name, Conditions conditions) {
        super(name, conditions);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это лучики света, которые испускают вывески магазинчиков. ", name);
        System.out.println();
    }
}
