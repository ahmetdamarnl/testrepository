public class BaseRobotManager {

    private IWorkable iWorkable;

    public BaseRobotManager(IWorkable iWorkable) {
        this.iWorkable = iWorkable;
    }

    public void addRobotWork()
    {
        iWorkable.work();
    }
}
