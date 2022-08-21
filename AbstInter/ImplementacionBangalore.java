package AbstInter;

public class ImplementacionBangalore implements HabilidadesBangalore{
    public void pasiva(){
        String msj;
        msj = "Si recibes disparos mientras corres, te moveras mas rapido durante un breve periodo de tiempo";
        System.out.println(msj);
    }
    public void tactica(){
        String msj;
        msj = "Lanza una granada de humo de alta velocidad que explota creando una pantalla de humo al impactar";
        System.out.println(msj);
    }
    public void definitiva(){
        String msj;
        msj = "Solicita un ataque de artilleia que avanza progresivamente por el campo de batalla";
        System.out.println(msj);
    }

}
