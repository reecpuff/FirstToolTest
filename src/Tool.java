public class Tool {
    private final String name;
    private final ToolMaterial material;
    private int durability;
    private String tag;

    //constructor without tag
    public Tool(String name, ToolMaterial material) {
        this.name = name;
        this.material = material;
        this.durability = material.getDurability(); //start with full..?
        this.tag = name;
    }
//constructor with tag
    public Tool(String name, ToolMaterial material, String tag) {
        this.name = name;
        this.material = material;
        this.durability = material.getDurability();
        this.tag = tag;
    }

//getters
    public String getName() {
        return name;
    }
    public int getDurability() {
        return durability;
    }
    public String getTag() {
        return tag;
    }

    //setter for tag
    public void setTag(String tag) {
        if (tag != null && !tag.isEmpty()) {
            this.tag = tag;
        }
    }
    //mining method
    void mine(Block block) {
        int blocksMined = 0;

        System.out.println("You attempt to mine 1 " + (block.colour.isEmpty() ? "" : block.colour + " ") +
                block.type + ".");

        if (durability <= 0) {
            System.out.println(tag + " is broken! Cannot mine " + block.colour + block.type + ".");
            return;
        }
boolean effective =
        (name.contains("Pickaxe") && block.type.equals("stone"))
                || (name.contains("Shovel") && block.type.equals("dirt"))
                || (block.colour.contains("black") && material.getLvl() >= 2);

if (effective) {
    durability--;
    blocksMined++;
System.out.println(tag + " successfully mined " + blocksMined + " " +
        (block.colour.isEmpty() ? "" : block.colour + " ") + block.type +
        (blocksMined == 1 ? "" : "s") + ". Durability is now: " + durability + ".");
        } else {
            System.out.println(tag + " is not effective against " + (block.colour.isEmpty() ? "" : block.colour + " ") +
                    block.type + "!");
        }
    }

    //Mining session method
void mineBlocks(int count, Block block) {
        int blocksMined = 0;

        //message
        System.out.println("You decide to mine " + count +
                (block.colour.isEmpty() ? " " : " " + block.colour + " ") + block.type + ".");
//loop
        for (int i = 1; i <= count; i++) {
            if (durability <= 0) {
                System.out.println(tag + " broke after mining " + (i - 1) +
                        (block.colour.isEmpty() ? " " : " " + block.colour + " ") + block.type + "!");
                break;
            }
//effective
            boolean effective =
                    (name.contains("Pickaxe") && block.type.equals("stone"))
                            || (name.contains("Shovel") && block.type.equals("dirt"))
                            || (block.colour.contains("black") && material.getLvl() >= 2);

            if (effective) {
                durability--;
                blocksMined++;
            } else {
                System.out.println(tag + " is not effective against " + block.colour + " " + block.type + "!");
            }
        }
        //out message
        System.out.println(tag + " successfully mined " + blocksMined + " " +
                block.type + (blocksMined == 1 ? "" : "s") + "!");
}

//repair method
    void repair(int amount) {
        durability += amount;
        System.out.println(name + " repaired by " + amount + ". Durability is now: " + durability + ".");
    }
}