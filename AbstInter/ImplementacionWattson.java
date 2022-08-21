package AbstInter;

public class ImplementacionWattson implements HabilidadesWattson{
    public void pasiva(){
        String msj;
        msj = "Los aceleradores de definitiva cargan completamente la habilidad definitiva";
        System.out.println(msj);
    }
    public void tactica(){
        String msj;
        msj = "Conecta nodos para crear vallas electrificadas que danien y relenticen a los enemigos";
        System.out.println(msj);
    }
    public void definitiva(){
        String msj;
        msj = "Coloca una torre interceptora que destruye los explosivos que te lancen y repara los escudos daniados";
        System.out.println(msj);
    }
}
