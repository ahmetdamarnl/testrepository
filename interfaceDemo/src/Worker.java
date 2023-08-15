public class Worker implements IWorkable, IEatable, IPayable{

    //    sadece kendi calisanina yemek veren bir sirket. baska sirkete bagli burada calisanlara yemek hizmeti yok.
//maas odemede sadece kendi personele


    @Override
    public void pay() {

        System.out.println("Worker Payed!");

    }

    @Override
    public void eat() {

        System.out.println("Worker Eated!");

    }

    @Override
    public void work() {System.out.println("worker worked!");



    }
}
