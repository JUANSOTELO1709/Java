public class prueba_constructor {
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        cuenta cuentajuan = new cuenta(22);
        System.out.println(cuentajuan.getAgencia());

        cuenta cuentaeld= new cuenta(23);
        System.out.println(cuentaeld.getAgencia());

        System.out.println(cuenta.getTotal());
    }



}
