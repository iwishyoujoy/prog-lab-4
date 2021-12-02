public class StreetName extends Subject implements Moving, Describable{

    public StreetName(){
        super("названия улиц");
    }

    public StreetName(String name){
        super(name);
    }

    public void call(Feeling feeling){
        System.out.printf("Только %s могли вызвать %s. ", this.getName(), feeling.getAll());
        System.out.println();
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это имена длинных тротуаров!", name);
        System.out.println();
    }
}
