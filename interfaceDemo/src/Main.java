public class Main {
    public static void main(String[] args) {

BaseWorkerManager baseWorkerManager = new BaseWorkerManager(new Worker());
baseWorkerManager.addWorkerEat();

/*baseWorkerManager.addWorkerWork();
baseWorkerManager.addWorkerPay();*/

BaseRobotManager baseRobotManager = new BaseRobotManager(new RobotWorker());
baseRobotManager.addRobotWork();

BaseOutsourceWorkerManager baseOutsourceWorkerManager = new BaseOutsourceWorkerManager(new OutsourceWorker());
baseOutsourceWorkerManager.addOutsourceWorker();


    }
}