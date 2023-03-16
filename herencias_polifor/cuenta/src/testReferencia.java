public class testReferencia {
    public static void main(String[] args){

        System.out.println();
        System.out.println();


        cliente juan = new cliente ();
        cliente elfrid= new cliente();



        juan.nombre = "juan sote";
        juan.identificacion= "1000015555";
        juan.telefono="3212186039";

        elfrid.nombre= "elfrid solo";
        elfrid.telefono= "assdas55544";
        
        cuenta cuentadeelfrid = new cuenta (2);
        cuenta cuentadejuan = new cuenta ( 22);
        cuentadejuan.setTitular(juan) ;

        cuentadejuan.depositar(200);
        cuentadejuan.retirar(300);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("juan tiene:"+ cuentadejuan.getSaldo());
        System.out.println("elfrid tiene:"+ cuentadeelfrid.getSaldo());
        

    }
}
