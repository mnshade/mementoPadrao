public class EmpresaPorteMe implements EmpresaPorte {

    private EmpresaPorteMe() {};
    private static EmpresaPorteMe instance = new EmpresaPorteMe();
    public static EmpresaPorteMe getInstance(){
        return instance;
    }

    public String getNomePorte(){
        return "Microempresa – Até R$ 360 mil por ano.";
    }

}
