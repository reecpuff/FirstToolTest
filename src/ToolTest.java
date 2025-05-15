public class ToolTest {
    public static void main(String[] args) {

        Tool pickaxe = new Tool("Iron Pickaxe", ToolMaterial.IRON);
        Tool diaPickaxe = new Tool("Diamond Pickaxe", ToolMaterial.DIAMOND, "Bertha");
        Tool shovel = new Tool("Gold Shovel", ToolMaterial.GOLD);
        Tool diaShovel = new Tool("Diamond Shovel", ToolMaterial.DIAMOND, "Betty");

        Block stone = new Block("stone");
        Block dirt = new Block("dirt");
        Block bStone = new Block("black", "stone");
        Block bDirt = new Block("black", "dirt");

        System.out.println("You have found yourself in a cave! You are in possession of 4 tools. How will you use them?");

        pickaxe.mine(stone);
        pickaxe.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(stone);
        diaPickaxe.mine(bStone);
        diaShovel.mine(bDirt);
        shovel.mine(bDirt);

        shovel.mineBlocks(24, dirt);

        shovel.repair(10);

        diaPickaxe.mine(bDirt);
    }
}