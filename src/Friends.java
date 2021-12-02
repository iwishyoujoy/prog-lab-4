public class Friends extends Human implements Moving{

    public Friends(){
        super("Друзья", "Солнечный город");
    }

    public Friends(String name){
        super(name, "Солнечный город");
    }

    public Friends(String name, String home){
        super(name, home);
    }

    public void talk(ThatWay thatWay){
        System.out.printf("%s разговаривали %s. ", this.getName(), thatWay.getName());
        System.out.println();
    }

    public void walk(Town town){
        System.out.printf("%s гуляли по %s. ", this.getName(), town.getName());
        System.out.println();
    }

    public void goAway(Centre centre){
        System.out.printf("%s дальше уходили от %s. ", this.getName(), centre.getName());
        System.out.println();
    }

    public void meet(ShopWindows shopWindows, AdLights adLights){
        System.out.printf("%s реже встречали %s и %s. ", this.getName(), shopWindows.getAll(), adLights.getAll());
        System.out.println();
    }
}
