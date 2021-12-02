public interface Moving {
    //абсолютно все действия (глаголы) в рассказе
    default void leave(){
        System.out.print("Никто никого не оставил!");
        System.out.println();
    }

    default void keep(){
        System.out.print("Никто не продержался до закрытия балагана!");
        System.out.println();
    }

    default void talk(){
        System.out.print("Никто ни с кем таким образом не поговорил!");
        System.out.println();
    };

    default void walk(){
        System.out.print("Никто не прогулялся по городу!");
        System.out.println();
    };

    default void goAway(){
        System.out.print("Никто не ушёл от центра города!");
        System.out.println();
    };

    default void meet(){
        System.out.print("Никто не встретил витрины магазинов, огоньки реклам и названия улиц!");
        System.out.println();
    };

    default void become(){
        System.out.print("Никто не видел домов пониже!");
        System.out.println();
    };

    default void end(){
        System.out.print("Никто не видел, как кончились асфальтированные тротуары!");
        System.out.println();
    };

    default void begin(){
        System.out.print("Никто не видел, как пошли новые тротуары!");
        System.out.println();
    };

    default void lay(){
        System.out.print("Никто не видел лежащие кучи мусора!");
        System.out.println();
    };

    default void impress(){
        System.out.print("Никто не был поражен!");
        System.out.println();
    };

    default void call(){
        System.out.print("Ничто не вызвало никаких чувств!");
        System.out.println();
    };
}
