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

        System.out.println("You have found yourself in a cave! You are in possession of 4 tools(Iron pick, Gold shovel, Betty, and Bertha. How will you use them?");

        shovel.mine(bStone);

        pickaxe.mine(dirt);
    }
}
//fart