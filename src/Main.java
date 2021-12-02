public class Main {
    public static void main(String[] args) {

        Kozlik kozlik = new Kozlik();
        Hope hope = new Hope();
        Smelchak smelchak = new Smelchak();
        ClosedBalagan closedBalagan = new ClosedBalagan();
        Friends friends = new Friends();
        ThatWay thatWay = new ThatWay();
        Town town = new Town();
        Centre centre = new Centre();
        ShopWindows shopWindows = new ShopWindows("витрины магазинчиков", "прекрасные");
        AdLights adLights = new AdLights("огонёчки реклам", "невероятные");
        Houses houses = new Houses("домики");
        Windows windows = new Windows("окошки");
        Pavement pavement = new Pavement();
        Garbage garbage = new Garbage();
        View view = new View();
        Neznayka neznayka = new Neznayka("Умничка");
        Impression impression = new Impression("впечатление", "ужасное");
        StreetName streetName = new StreetName();
        Feeling feeling = new Feeling("чувство", "горькое");
        TownBlock townBlock = new TownBlock();

        kozlik.leave(hope);
        smelchak.keep(closedBalagan);
        friends.talk(thatWay);
        friends.walk(town);
        friends.goAway(centre);
        friends.meet(shopWindows, adLights);
        houses.become();
        windows.become();
        pavement.end();
        pavement.begin(Conditions.БУЛЫЖНЫЕ);
        garbage.lay();
        view.impress(neznayka, impression);
        streetName.call(feeling);
        townBlock.meet();
    }
}

//Козлика не оставляла надежда, что и этот смельчак не продержится долго, но он все же продержался до закрытия балагана.
// Разговаривая таким образом, друзья шагали по городу. Чем дальше они уходили от центра, тем реже встречали освещенные
// витрины магазинов и яркие огоньки реклам. Дома становились все ниже, а окна подслеповатее. Асфальтированные тротуары
// кончились, и пошли просто булыжные, с выбоинами и ухабами и лежащими поперек кучами мусора. Вид всего этого производил
// на Незнайку удручающее впечатление. Одни названия улиц могли вызвать неприятное чувство. Если в богатых кварталах города
// чаще встречались такие названия, как Светлая улица, Счастливая улица, бульвар Радости, то здесь в ходу были такие названия,
// как улица Бедности, Темная улица, Грязная улица, Болотная или Гнилая.
