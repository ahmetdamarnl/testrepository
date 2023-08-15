public class BaseWorkerManager {

    private IWorkable iWorkable;
    private IEatable iEatable;
    private IPayable iPayable;



    public BaseWorkerManager(IEatable iEatable) {
        this.iEatable = iEatable;

    }
    public void addWorkerEat() {

        iEatable.eat();
    }
    /*public BaseWorkerManager(IWorkable iWorkable) {
        this.iWorkable = iWorkable;

    }

    public void addWorkerWork(){
        iWorkable.work();
    }

    public BaseWorkerManager(IPayable iPayable) {
        this.iPayable = iPayable;
    }


    public void addWorkerPay(){
        iPayable.pay();
    }*/


}
