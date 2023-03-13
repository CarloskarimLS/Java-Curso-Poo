//SUPERCLASE
public class animal {

    public animal(){
        System.out.println("Soy un animal");
    }
    public animal(String tipo){
        System.out.println("tipo: "+tipo);
    }
}

//SUBCLASE
class leon extends animal{
    public leon(){
        super("felino ");
        System.out.println("Soy un leon");
    }
}
