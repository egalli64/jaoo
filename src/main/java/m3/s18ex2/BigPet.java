package m3.s18ex2;

public abstract class BigPet extends Pet {

    public BigPet(int days) {
        super(days);
        // TODO Auto-generated constructor stub
    }

}

class BigDog extends BigPet {

    public BigDog(int days) {
        super(days);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int housing() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
