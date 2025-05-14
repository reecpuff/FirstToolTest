public class ToolTest {
    public static void main(String[] args) {

        Tool pickaxe = new Tool("Iron Pickaxe", 10, 1);
        Tool diaPickaxe = new Tool("Diamond Pickaxe", 20, 2, "Bertha");
        Tool shovel = new Tool("Iron Shovel", 10, 1);
        Tool diaShovel = new Tool("Diamond Shovel", 20, 2, "Betty");

        Block stone = new Block("stone");
        Block dirt = new Block("dirt");
        Block bStone = new Block("black", "stone");
        Block bDirt = new Block("black", "dirt");

        System.out.println("You have found yourself in a cave! You are in possession of 4 tools. How will you use them?");


        pickaxe.mine(stone);
        pickaxe.mine(stone);
        pickaxe.mine(stone);

        System.out.println("You encounter a patch of dirt!");

        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);
        shovel.mine(dirt);

        shovel.repair(10);

        shovel.mine(dirt);
        shovel.mine(dirt);

        System.out.println("You encounter some black stone! We need some of that...");

        diaPickaxe.mine(bStone);

        diaPickaxe.setTag("Bonnie");
        System.out.println("The black stone has renamed your Pickaxe! Mine another to see with which name it has been bestowed...");

        diaPickaxe.mine(bStone);

    }
}