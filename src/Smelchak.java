public class Smelchak extends Human implements Moving{

    private final String howlong = "долго";

    public Smelchak(){
        super("Смельчак","Солнечный город");
    }

    public Smelchak(String name){
        super(name, "Солнечный город");
    }

    public Smelchak(String name, String home){
        super(name, home);
    }

    public void keep(ClosedBalagan closedBalagan) {
        System.out.printf("%s мог не продержаться %s, но %s всё же продержался до %s. ", this.getName(), this.howlong, this.getName(), closedBalagan.getName());
        System.out.println();
    }
}
