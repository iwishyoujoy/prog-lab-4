public class TownBlock extends Subject implements Moving, Describable{

    private final String how = "чаще";
    public TownBlock() {
        super("кварталы");
    }

    public TownBlock(String name) {
        super(name);
    }

    public void meet(){
        System.out.printf("В богатых %s встречались такие названия, как Светлая улица, Счастливая улица, Бульвар Радости, " +
                "а в бедных %s такие, как улица Бедности, Тёмная улица, Грязная улица, Болотная улица, Гнилая улица. ", this.getName(), this.getName());
        System.out.println();
    }

    public void describe() {
        char[] stringArray = this.getName().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        String name = new String(stringArray);
        System.out.printf("%s - это небольшие райончики, окруженные домиками.", name);
        System.out.println();
    }
}
