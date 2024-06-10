public class dinero{

    private int saldo;

    public dinero(int saldoInicial){
        this.saldo=saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void girar(int monto){
        this.saldo-=monto;
    }

    public void depositar(int monto){
        this.saldo+=monto;
    }

}


