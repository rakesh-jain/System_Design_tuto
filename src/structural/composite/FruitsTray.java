package structural.composite;


import java.util.ArrayList;
import java.util.List;

public class FruitsTray {
    private List<Fruits> fruitsList ;
    private int traySize;
    FruitsTray(int traySize){
        this.traySize=traySize;
        fruitsList=new ArrayList<>(traySize);
    }

    void addFruits(Fruits fruits){
        if (fruitsList.size() < traySize) {
            fruitsList.add(fruits);
        } else {
            System.out.println("Tray is full. Cannot add more fruits.");
        }
    }

    void removeFruits(Fruits fruits){
        if(fruitsList.remove(fruits)){
            fruits.showFruitName();
            System.out.println(" removed successfully");
        } else {
            System.out.println("No such fruit found");
        }
    }


    void showTray(){
        if(!fruitsList.isEmpty()){
            for(Fruits f:fruitsList){
                f.showFruitName();
                f.showAmount();
               // f.nutrients();
            }
        }
    }
}

