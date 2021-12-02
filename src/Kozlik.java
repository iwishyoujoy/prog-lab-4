public class Kozlik extends Human implements Moving{

    public Kozlik(){
        super("Козлик", "Солнечный город");
    }

    public Kozlik(String name){
        super(name, "Солнечный город");
    }

    public Kozlik(String name, String home){
        super(name, home);
    }

    public void leave(Hope hope){
        System.out.printf("%s не оставляла %s. ", this.getName(), hope.getName());
        System.out.println();
    }
}
