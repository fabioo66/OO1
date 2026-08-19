# Respuestas
## Tests

3_ Metodos a testear
- Metodo promedio de los ultimos 3 pedidos de la clase GuiaDeMontaña
  - Lista con 4 pedidos -> me deberia devolver el promedio de los ultimos 3 pedidos
  - Lista con 3 pedidos -> me deberia devolver el promedio de los 3 pedidos
  - Lista con 2 pedidos -> me deberia devolver el promedio de los 2 pedidos
  - Lista con 1 pedido -> me deberia devolver el promedio de 1 pedido
  - Lista vacia -> me deberia devolver 0
- Metodo cotizar de la clase GuiaDeMontaña
  - Si el costo del pedido actual es mayor al promedio de los ultimos 3 pedidos -> me deberia devolver el costo del pedido actual con un descuento del 7%
  - Si el costo del pedido actual no es mayor al promedio de los ultimos 3 pedidos -> me deberia devolver el costo del pedido actual sin descuento.
- Metodo sumaPedidos de la clase MontañistaAmateur
  - Lista con 0 pedidos -> me deberia devolver 0
  - Lista con 1 pedido -> me deberia devolver el costo del pedido
  - Lista con 2 pedidos -> me deberia devolver la suma de los costos de los pedidos
- Metodo cotizar de la clase MontañistaAmateur
  - Si la suma de todos los pedidos historicos es mayor al doble del costo del pedido actual -> me deberia devolver el costo del pedido actual con un descuento del 5%
  - Si la suma de todos los pedidos historicos no es mayor al doble del costo del pedido actual -> me deberia devolver el costo del pedido actual sin descuento
- Metodo calcularCosto() de la clase Pedido
  - Lista con 0 items -> me deberia devolver 0
  - Lista con 1 item -> me deberia devolver el costo de ese unico item
  - Lista con 2 items -> me deberia devolver el costo de la suma de los dos items
- Metodo calcularCosto() de la clase Servicio
  - Le paso un itemServicio con cantidad menor a cantidad minimia -> me deberia devolver el resultado de la cantidad * valorNormal
  - Le paso un itemServicio con cantidad mayor a cantidad minima -> me deberia deboler el resultado de la cantidad * valorConDescuento
- Metodo calcularCosto() de la clase itemServicio
  - Con que ande el de arriba este ya esta cubierto porque le manda un mensaje al servicio que tiene el servicio actual y dependiendo la cantidad devuelva una cosa o la otra

---
# Respuestas
Por chatGPT

## Tests

### 3_ Métodos a testear

- **Método `cotizar()` de la clase `GuiaDeMontaña`**
  - Con 4 pedidos históricos → se deben considerar únicamente los últimos 3 pedidos para calcular el promedio.
  - Con 3 pedidos históricos → se deben considerar los 3 pedidos.
  - Con 2 pedidos históricos → se deben considerar los 2 pedidos.
  - Con 1 pedido histórico → se debe considerar ese único pedido.
  - Con una lista de pedidos históricos vacía → el promedio debería ser 0.
  - Si el costo del pedido actual es mayor al promedio de los últimos 3 pedidos → debería devolver el costo del pedido actual con un descuento del 7%.
  - Si el costo del pedido actual no es mayor al promedio de los últimos 3 pedidos → debería devolver el costo del pedido actual sin descuento.

- **Método `cotizar()` de la clase `MontañistaAmateur`**
  - Con 0 pedidos históricos → la suma de pedidos debería ser 0.
  - Con 1 pedido histórico → debería considerar el costo de ese pedido.
  - Con 2 pedidos históricos → debería considerar la suma de los costos de ambos pedidos.
  - Si la suma de todos los pedidos históricos es mayor al doble del costo del pedido actual → debería devolver el costo del pedido actual con un descuento del 5%.
  - Si la suma de todos los pedidos históricos es igual al doble del costo del pedido actual → debería devolver el costo del pedido actual sin descuento.
  - Si la suma de todos los pedidos históricos no es mayor al doble del costo del pedido actual → debería devolver el costo del pedido actual sin descuento.

- **Método `calcularCosto()` de la clase `Pedido`**
  - Lista con 0 items → debería devolver 0.
  - Lista con 1 item → debería devolver el costo de ese único item.
  - Lista con 2 items → debería devolver la suma de los costos de ambos items.

- **Método `calcularCosto()` de la clase `ItemServicio`**
  - Dado un `ItemServicio` con una cantidad determinada y un `Servicio` asociado → debería devolver el costo calculado por dicho servicio, verificando que el `ItemServicio` delegue correctamente el cálculo en `Servicio`.

- **Método `calcularCosto()` de la clase `Servicio`**
  - Si la cantidad es menor a la cantidad mínima → debería devolver `cantidad * valorNormal`.
  - Si la cantidad es igual a la cantidad mínima → debería devolver `cantidad * valorNormal`.
  - Si la cantidad es mayor a la cantidad mínima → debería devolver `cantidad * valorConDescuento`.