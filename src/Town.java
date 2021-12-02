public class Town extends Subject implements Describable{

    public Town() {
        super("город");
    }

    public Town(String name) {
        super(name);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это населенный пункт, в котором живут маленькие человечки. ", name);
        System.out.println();
    }
}
