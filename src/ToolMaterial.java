public enum ToolMaterial {
    WOOD(10, 1),
    STONE(25, 1),
    IRON(50, 1),
    GOLD(25, 1),
    DIAMOND(100, 2);

    private final int durability;
    private final int lvl;

    ToolMaterial(int durability, int lvl) {
        this.durability = durability;
        this.lvl = lvl;
    }

    public int getDurability() {
        return durability;
    }
    public int getLvl() {
        return lvl;
    }
}