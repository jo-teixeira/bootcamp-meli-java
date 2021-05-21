package class4.list2.ex6;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Testes");
        System.out.println("\nRPAD");
        String rpad = "abd";
        System.out.println("STRING INICIAL\n" + rpad);
        System.out.println(StringUtil.rpad(rpad,'c',5));

        System.out.println("\nLTRIM");
        String ltrim = "       abd";
        System.out.println("STRING INICIAL\n" + ltrim);
        System.out.println(StringUtil.ltrim(ltrim));

        System.out.println("\nRTRIM");
        String rtrim = "abd            ";
        System.out.println("STRING INICIAL\n" + rtrim);
        System.out.println(StringUtil.rtrim(rtrim));

        System.out.println("\nTRIM");
        String trim = "       abd           ";
        System.out.println("STRING INICIAL\n" + trim);
        System.out.println(StringUtil.trim(trim));

        System.out.println("\nINDEXOFN");
        String index1 = "abcdde";
        System.out.println("STRING INICIAL\n" + index1);
        System.out.println(StringUtil.indexOfN(index1,'d',1));
        System.out.println(StringUtil.indexOfN(index1,'d',2));
        System.out.println(StringUtil.indexOfN(index1,'d',3));
    }
}
