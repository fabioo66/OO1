package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		return this.saldo >= monto + (monto * 0.02);
	}
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}
	
	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * 0.02));
	}
}
