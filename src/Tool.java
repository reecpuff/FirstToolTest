public class Tool {
    String name;
    int durability;
    int lvl;
    String tag;

    public Tool(String name, int durability, int lvl) {
        this.name = name;
        this.durability = durability;
        this.lvl = lvl;
        this.tag = name;
    }

    public Tool(String name, int durability, int lvl, String tag) {
        this.name = name;
        this.durability = durability;
        this.lvl = lvl;
        this.tag = tag;
    }

    void mine(Block block) {
        if (durability <= 0) {
            System.out.println(tag + " is broken! Cannot mine " + block.colour + block.type + ".");
            return;
        }
boolean effective =
        (name.contains("Pickaxe") && block.type.equals("stone"))
                || (name.contains("Shovel") && block.type.equals("dirt"))
                || (block.colour.contains("black") && lvl >= 2);

if (effective) {
System.out.println(tag + " successfully mined the " + (block.colour.isEmpty() ? "" : block.colour + " ") + block.type + "! Durability is now " + durability + ".");
            durability--;
        } else {
            System.out.println(tag + " is not effective against " + block.colour + block.type + "!");
        }
    }


    void repair(int amount) {
        durability += amount;
        System.out.println(name + " repaired by " + amount + ". Durability is now: " + durability + ".");
    }
}