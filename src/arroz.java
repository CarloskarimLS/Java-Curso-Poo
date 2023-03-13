//ENCAPSULAMIENTO
public class arroz {
    //atributos
    String marca;
    double peso;


    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPesogr(){
        return peso;
    }
    public void setPeso(double pesogr){
        peso = pesogr;
    }
    public double getPesokg(){
        return peso /1000;
    }


}
