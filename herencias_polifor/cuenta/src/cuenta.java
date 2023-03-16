class cuenta{
	private double saldo;
	private int agencia;
	private int numero;
	private cliente titular;


	private static int total=0;



	public cuenta(int agencia){

		if(agencia<=0){
			System.out.println("no se permite 0 o menor");
			this.agencia= 1;

		}else{
			this.agencia= agencia;
			System.out.println("agencia:" + agencia);
		}
		total ++;
		System.out.println("Se Ha creado " + total  + " cuenta");

	}


	void depositar(double valor){
		this.saldo = this.saldo + valor;
	}

		boolean retirar(double valor){
		if (this.saldo>=valor) {
			this.saldo -=  valor;
			return true;
		}
		return false;
	}

		boolean transferir(double valor, cuenta cuenta){
			if( this.saldo>= valor){
				this.saldo=this.saldo - valor;
				cuenta.depositar(valor);
				return true;
			}
			return false;
}


	public double getSaldo(){
		return this.saldo;
}


	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}

	public cliente getTitular() {
		return titular;
	}


	public void setAgencia(int agencia){
		if (agencia >0){
			this.agencia = agencia;
		}
		else {
			System.out.println("no Se permiten numeros negativos");
		}

	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return cuenta.total;
	}

	
}
