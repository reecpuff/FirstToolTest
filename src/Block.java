public class Block {
    String colour;
    String type;

    public Block(String type) {
        this.colour = "";
        this.type = type;
    }

    public Block(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }
}