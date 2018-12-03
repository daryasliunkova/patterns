import entities.House;
import entities.impls.WoodFloor;
import entities.impls.WoodHouse;
import entities.impls.WoodRoof;
import entities.impls.WoodWalls;
import entities.interfaces.Floor;
import entities.interfaces.Roof;
import entities.interfaces.Walls;

public class WoodBuilder extends HouseBuilder {
    public Floor createFloor() {
        floor = new WoodFloor();
        return floor;
    }
    public House createHouse() {
        house = new WoodHouse();
        return house;
    }
    public Roof createRoof() {
        roof = new WoodRoof();
        return roof;
    }
    public Walls createWalls() {
        walls = new WoodWalls();
        return walls;
    }

}
