package ar.edu.unlp.info.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
	private Producto heladera;
	private Producto procesador;
	private Cliente cape;
	private FormaDePago alContado;
	private FormaDeEnvio retirarEnComercio;
	private int cantSolicitada;
	
	@BeforeEach
	public void setUp() {
		this.cape = new Cliente("CAPE", "durañona XD");
        this.heladera = new Producto("Heladera", "Electrodomestico", 500, 20, new Vendedor("Mamu", "Ferrari 505"));
        this.procesador = new Producto("Ryzen 5 2600", "Electronica", 250, 3, new Vendedor("Valen", "8 y 44"));
        this.alContado = new PagoAlContado();
        this.retirarEnComercio = new RetirarEnComercio();
        this.cantSolicitada = 5;
	}
	
	@Test
	public void generarPedidoExitosoTest(){
		int pedidosCape = this.cape.cantPedidos();
		this.heladera.generarPedido(cape, alContado, retirarEnComercio, cantSolicitada);
		assertEquals(15, this.heladera.getCantUnidadesDisponibles());
		assertEquals(pedidosCape + 1, this.cape.cantPedidos());
	}
	
	@Test
	public void generarPedidoFallidoTest(){
		int pedidosCape = this.cape.cantPedidos();
		assertEquals(3, this.procesador.getCantUnidadesDisponibles());
		this.procesador.generarPedido(cape, alContado, retirarEnComercio, cantSolicitada);
		assertEquals(3, this.procesador.getCantUnidadesDisponibles());
		assertEquals(pedidosCape, this.cape.cantPedidos());
	}
	
}
