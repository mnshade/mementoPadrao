public class EmpresaPorteEPP implements EmpresaPorte{

    private EmpresaPorteEPP() {};
    private static EmpresaPorteEPP instance = new EmpresaPorteEPP();
    public static EmpresaPorte getInstance(){
        return instance;
    }

    public String getNomePorte(){
        return "Empresa de pequeno porte – De R$ 360 mil até R$ 3,6 milhões por ano";
    }

}
