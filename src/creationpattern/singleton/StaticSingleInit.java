package creationpattern.singleton;

public class StaticSingleInit{
    private static StaticSingleInit staticSingleInit;

    public StaticSingleInit() {
    }

    static{
        try{
            staticSingleInit= new StaticSingleInit();
            System.out.println("created successfully ");
        }catch (RuntimeException t){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticSingleInit getStaticSingleInit(){
        return staticSingleInit;
    }


    public static void main(String[] args) {
        StaticSingleInit staticSingleInit1 = StaticSingleInit.getStaticSingleInit();
        System.out.println(staticSingleInit1 == null);
    }

}
