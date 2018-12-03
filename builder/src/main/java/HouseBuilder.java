import entities.interfaces.Floor;
import entities.House;
import entities.interfaces.Roof;
import entities.interfaces.Walls;

public abstract class HouseBuilder {
    protected House house;
    protected Floor floor;
    protected Walls walls;
    protected Roof roof;
    public abstract House createHouse();
    public abstract Floor createFloor();
    public abstract Walls createWalls();
    public abstract Roof createRoof();
}
