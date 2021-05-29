public class Card {


    public enum Shape {
        Clubs,
        Dimonds,
        Spades,
        Hearts;
    }
    private final String shape;
    final int num;
    Card(int number, String shape){
        this.shape = shape;
        this.num = number;
    }

    public int getNum() {
        return num;
    }
    public String getShape() {
        return shape;
    }
    int compare(Card other){
        int same_num;
        if(this.num == other.num ){

        }




            && this.shape == other.shape){
            return
        }
    }
}
