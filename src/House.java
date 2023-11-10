public class House {

    int rooms;
    boolean hasPool;
    String color;

    public House(int rooms, boolean hasPool, String color){
        this.rooms=rooms;
        this.hasPool=hasPool;
        this.color=color;
    }

    void openDoor(){
        System.out.println("Door Open all these rooms total"+this.rooms);
    }

    void allSpecs(){
        System.out.println(rooms + " rooms, has a pool," + hasPool+ ", and is " +color );
    }


}
