
package Herencia;

public class Cuenta {
    // atributos de la clase cuenta
    protected float saldo; 
    protected int númeroConsignaciones = 0;
    protected int númeroRetiros = 0;
    protected float tasaAnual;
    protected float comisiónMensual = 0;
    
    // metodos de la clase cuenta 
    
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    
    public void consignar(float cantidad) {
        saldo = saldo + cantidad; 
        númeroConsignaciones = númeroConsignaciones + 1;
    }
    
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            númeroRetiros = númeroRetiros + 1;
        } 
        else{
            System.out.println("La cantida a retirar excede el saldo actual");
            
        } 
    }
    
    public void calcularInterés() {
        float tasaMensual = tasaAnual / 12; 
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; 
    }
    
    public void extractoMensual() {
        saldo -= comisiónMensual;
        calcularInterés();
    }
   
}