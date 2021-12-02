public class Hope extends Subject implements Describable {

    public Hope() {
        super("надежда");
    }

    public Hope(String name) {
        super(name);
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s является неотъемлемой частью жизни. Без неё невозможно сущестовать!", name);
        System.out.println();
    }

}
