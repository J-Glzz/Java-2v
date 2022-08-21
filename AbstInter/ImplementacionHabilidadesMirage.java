package AbstInter;

public class ImplementacionHabilidadesMirage implements HabilidadesMirage {
    public void pasiva(){
        String msj;
        msj =  "Activa el camuflaje automaticamente al usar balizas de reaparicion y al reanimar a companieros de equipo";
        System.out.println(msj);
    }
    public void tactica(){
        String msj;
        msj =  "Despliega un seniuelo holografico para confundir al enemigo";
        System.out.println(msj);
    }
    public void definitiva(){
        String msj;
        msj = "Despliega un conjunto de seniuelos para distraer a los enemigos";
        System.out.println(msj);
    }
}
