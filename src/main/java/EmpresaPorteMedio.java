public class EmpresaPorteMedio implements EmpresaPorte{

    private EmpresaPorteMedio() {};
    private static EmpresaPorteMedio instance = new EmpresaPorteMedio();
    public static EmpresaPorte getInstance(){
        return instance;
    }

    public String getNomePorte(){
        return "Empresa de médio porte – De R$ 16 milhões até R$ 90 milhões por ano";
    }

}
