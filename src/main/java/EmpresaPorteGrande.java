public class EmpresaPorteGrande implements EmpresaPorte {

    private EmpresaPorteGrande() {};
    private static EmpresaPorteGrande instance = new EmpresaPorteGrande();
    public static EmpresaPorte getInstance(){
        return instance;
    }

    public String getNomePorte(){
        return "Empresa de grande porte – Após os R$ 300 milhões por ano";
    }

}

