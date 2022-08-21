package Semana01;

public class Gabinete {
    // Atributos - Campos - Caracteristicas
    String marca, tipoGabinete, socketPermitido;
    double precio;
    int numDiscosSolidos;
    // Metodos
    public String getMarca(){
        return marca;
    }
    public String getTipoGabinete(){
        return tipoGabinete;
    }
    public String getSocketPermitido(){
        return socketPermitido;
    }
    public double getPrecio(){
        return precio;
    }
    public int getNumDiscosSolidos(){
        return numDiscosSolidos;
    }
    public boolean setMarca(String marca){
        if (!marca.isEmpty()){
            this.marca = marca;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setTipoGabinete(String tipoGabinete){
        if (!tipoGabinete.isEmpty()){
            this.tipoGabinete = tipoGabinete;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setSocketPermitido(String socketPermitido){
        if (!socketPermitido.isEmpty()){
            this.socketPermitido = socketPermitido;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setNumDiscosSolidos(int numDiscosSolidos){
        if (numDiscosSolidos > 0){
            this.numDiscosSolidos = numDiscosSolidos;
            return true;
        }
        else {
            return false;
        }
    }
    public void printState(){
        String msg;
        msg = "Caracteristicas del CPU: ";
        msg += "\nMarca: " + getMarca();
        msg += "\nTamanio Gabinete: " + getTipoGabinete();
        msg += "\nTipo de Socket: " + getSocketPermitido();
        msg += "\nEspacio para discos: " + getNumDiscosSolidos();
        msg += "\nPrecio: " + getPrecio();
        System.out.println(msg);
    }
}
