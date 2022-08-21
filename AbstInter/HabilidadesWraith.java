package AbstInter;

public abstract class HabilidadesWraith {
    // Lo que hace (Abstraccion)
    abstract void pasiva();
    abstract void tactica();
    void definitiva(){
        // Como lo hace (Implementacion)
        String msj;
        msj = "Conecta 2 ubicaciones con partales durante 60 segundos, y todo tu equipo puede usarlos";
        System.out.println(msj);
    }
}
