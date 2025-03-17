package creationpattern.singleton;

import sun.misc.Signal;

//Lazy initialization - on demand creating a object
public class SingleLazy {
    private static SingleLazy singelLazy;

    SingleLazy() {
    }

    public static SingleLazy getSingelLazy() {
        if (singelLazy == null) {
            singelLazy = new SingleLazy();
        }
        return singelLazy;
    }

    public void message() {
        System.out.println("hello i am lazy initializer");
    }


    public static void main(String[] args) {
        SingleLazy singleLazy = SingleLazy.getSingelLazy();
        singleLazy.message();
    }
}

