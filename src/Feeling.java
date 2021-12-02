public class Feeling extends Subject implements Describable{

    public Feeling() {
        super("чувство", Conditions.НЕПРИЯТНОЕ);
    }

    public Feeling(String name) {
        super(name);
    }

    public Feeling(String name, String condition) {
        super(name, condition);
    }

    public Feeling(String name, Conditions conditions) {
        super(name, conditions);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - эмоция. ", name);
        System.out.println();
    }
}
