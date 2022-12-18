package ObjectPool;

public class App_ObjectPool {
    public static void kentang() {
        ObjectPool robotPool = new RobotsPool();
        Robot firstRobit = (Robot) robotPool.create();
        Robot secondRobot = (Robot) robotPool.create();

        robotPool.checkOut(firstRobit);

        Robot thirdRobot = (Robot) robotPool.checkIn();
    }
}
