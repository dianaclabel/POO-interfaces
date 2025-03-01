import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable {

    public Delfin(String nombre){
        super(nombre);
    }
    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando en velocidad con su cola y saltando sobre el agua");

    }

    @Override
    public void comunicarse() {
        System.out.println("Emite sonido y chasquidos para comunicarse");
    }

    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer una galleta a "+nombre);
    }
}
