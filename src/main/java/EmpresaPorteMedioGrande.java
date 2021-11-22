public class EmpresaPorteMedioGrande implements EmpresaPorte {

    private EmpresaPorteMedioGrande() {};
    private static EmpresaPorteMedioGrande instance = new EmpresaPorteMedioGrande();
    public static EmpresaPorte getInstance(){
        return instance;
    }

    public String getNomePorte(){
        return "Empresa de média-grande porte – De R$ 90 milhões até R$ 300 milhões por ano";
    }

}
