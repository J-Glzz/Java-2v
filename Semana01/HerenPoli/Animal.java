package Semana01.HerenPoli;

public class Animal {
    // Caracteristicas - atributos - campos
    int patas, ojos;
    String pelaje, tipoDeAlimentacion;
    // Constructor
    Animal(){
        System.out.println("Se ha creado un animal");
    }
    // Metodos
    public int getPatas(){
        return patas;
    }
    public int getOjos(){
        return ojos;
    }
    public String getPelaje(){
        return pelaje;
    }
    public String getTipoDeAlimentacion(){
        return tipoDeAlimentacion;
    }
    public boolean setPatas(int patas){
        if (patas >= 0 || patas < 4){
            String res;
            if (patas == 0){
                res = "Animal mixine";
                //System.out.println(res);
                this.patas = patas;
                return true;
            }
            if (patas == 1){
                res = "No existe un animal con " + patas + " patas";
                //System.out.println(res);
                return false;
            }
            if (patas == 2){
                res = "Animal bipedo";
                //System.out.println(res);
                this.patas = patas;
                return true;
            }
            if (patas == 3){
                res = "No existe un animal con " + patas + " patas";
                //System.out.println(res);
                return false;
            }
            if (patas == 4){
                res = "Animal cuatripedo";
                //System.out.println(res);
                this.patas = patas;
                return true;
            }
        }
        else{
            System.out.println("Ingresa un numero de patas valido");
            return false;
        }
        return false;
    }
    public boolean setOjos(int ojos){
        if(ojos >= 0 || ojos < 2){
            String res;
            if(ojos == 0){
                res = "Este animal es raro, no tiene ojos";
                //System.out.println(res);
                this.ojos = ojos;
                return false;
            }
            if(ojos == 1){
                res = "Este animal es like a ciclope";
                //System.out.println(res);
                this.ojos = ojos;
                return false;
            }
            if (ojos == 2){
                res = "Este animal es normal";
                //System.out.println(res);
                this.ojos  = ojos;
                return true;
            }
        }
        else {
            System.out.println("Ingresa un numero de ojos valido");
            return false;
        }
        return false;
    }
    public boolean setPelaje(String pelaje){
        if(!pelaje.isEmpty()){
            this.pelaje = pelaje;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setTipoDeAlimentacion(String tipoDeAlimentacion){
        if (!tipoDeAlimentacion.isEmpty()){
            this.tipoDeAlimentacion = tipoDeAlimentacion;
            return true;
        }
        else {
            return false;
        }
    }
    public void tipoAnimal(){
        String msj;
        msj = "Soy un animal con estas caracteristicas: ";
        msj += "\nSoy un animal con " + getPatas() + " patas.";
        msj += "\nTengo " + getOjos() + " ojos.";
        msj += "\nSoy muy " + getPelaje();
        msj += "\nMi alimentacion es de tipo " + getTipoDeAlimentacion();
        System.out.println(msj);
    }
}
