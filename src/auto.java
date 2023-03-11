public class auto {
    //metodo
    // un metodo debe de reflejar una accion
    public void acelearar(){
        System.out.println("acelerando....");
    }

    public void velocidad(int vel_max){
        System.out.println("La velocidad maxima es: " + vel_max + "km");
    }

    public static void main(String[] args) {
        auto toyota = new auto();
        toyota.acelearar();
        toyota.velocidad(50);
    }
}
