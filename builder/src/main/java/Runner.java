import entities.House;

public class Runner {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector();
        HouseBuilder woodBuilder = new WoodBuilder();

        House woodHouse = director.constructHouse(woodBuilder);
        System.out.println();

        /**
         * Some examples of using the Builder pattern in knowledge engineering include
         different generators. Parsers in various compilers are also designed using the
         Builder pattern
         */
    }
}
