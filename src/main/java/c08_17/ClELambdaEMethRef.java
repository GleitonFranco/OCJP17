package c08_17;

interface TestarString {
    boolean testar(String s);
}
class TestarStringVazia implements TestarString {
    public boolean testar(String s) {
        return s.isEmpty();
    }
}

interface ChecarInicialString {
    boolean testar(String s);
}

interface ChecarInicial2ParamsString {
    boolean testar(String s, String inicial);
}

public class ClELambdaEMethRef {
    public static void main(String[] args) {
        TestarString testVaziaClasse = new TestarStringVazia();
        TestarString testVaziaLambda = s -> s.isEmpty();
        TestarString testVaziaLambda2 = (String s) -> s.isEmpty();
        //TestarString testVaziaLambda3 = String s -> s.isEmpty(); // NÃO!
        TestarString testVaziaMethRef = String::isEmpty;
        System.out.println(testVaziaMethRef.testar("test"));

        String str = "Zoo";
        //str = "Gleiton"; // NÃO! tem que ser final ou effectively final
        ChecarInicialString inicialLambda = s -> str.startsWith(s);
        //str = "Gleiton"; // NÃO! tem que ser final ou effectively final
        ChecarInicialString inicialMethRef = str::startsWith;
        System.out.println(inicialMethRef.testar("Z"));

        ChecarInicial2ParamsString inicial2ParamsLambda = (s, inicial) -> s.startsWith(inicial);
        ChecarInicial2ParamsString inicial2ParamsMethRef = String::startsWith;
        System.out.println(inicial2ParamsMethRef.testar("Zoo", "Z"));// a ordem é importante
    }

}
