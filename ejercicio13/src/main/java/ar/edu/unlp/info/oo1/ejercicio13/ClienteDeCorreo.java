package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
    private Carpeta inbox;
    private List<Carpeta> carpetas;

    public ClienteDeCorreo() {
        this.inbox = new Carpeta("Inbox");
        this.carpetas = new ArrayList<>();
        this.carpetas.add(inbox);
    }
    
    public Carpeta getInbox() {
    	return this.inbox;
    }

    public void recibir(Email email) {
        this.inbox.agregarEmail(email);
    }
    
    public Email buscarTexto(String texto) {
        return this.carpetas.stream()
                .map(carpeta -> carpeta.buscarTextoEnCarpeta(texto))
                .filter(email -> email != null)
                .findFirst()
                .orElse(null);
    }
    
    public int espacioOcupado() {
        return this.carpetas.stream()
                .mapToInt(Carpeta::espacioOcupado)
                .sum();
    }
}
