public class BaseOutsourceWorkerManager {

    private IWorkable iWorkable;

    public BaseOutsourceWorkerManager(IWorkable iWorkable) {
        this.iWorkable = iWorkable;
    }

    public void addOutsourceWorker(){
        iWorkable.work();
    }
}
