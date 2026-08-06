## 4. Métodos que deberían verificarse mediante pruebas unitarias

Se deben probar los siguientes métodos:

### Clase Inspeccion
- `descripcion()`
- `calcularCosto()`

### Clase Reparacion
- `descripcion()`
- `calcularCosto()`

### Clase Reemplazo
- `descripcion()`
- `calcularCosto()`

### Clase Normal
- `calcularCosto()`

### Clase Urgente
- `calcularCosto()`

### Clase OrdenDeMantenimiento
- `descripcion()`
- `calcularCostoTotal()`

---

## 5. Casos de prueba

### Clase Inspeccion

#### Caso 1 - Descripción de una inspección normal

**Fixture**

- Una inspección del sector "Sala de máquinas".
- Técnico: "Laura Méndez".
- Duración: 2 horas.
- Tipo de inspección: `Normal`.

**Operación**

- Invocar `descripcion()`.

**Resultado esperado**

- Devuelve:
  `Inspeccion de sala de maquinas por Laura Méndez (normal, 2 horas)`.

---

#### Caso 2 - Costo de una inspección normal

**Fixture**

- Una inspección con tipo `Normal`.

**Operación**

- Invocar `calcularCosto()`.

**Resultado esperado**

- Devuelve `6000`.

---

#### Caso 3 - Costo de una inspección urgente

**Fixture**

- Una inspección con tipo `Urgente`.

**Operación**

- Invocar `calcularCosto()`.

**Resultado esperado**

- Devuelve `9000`.

---

### Clase Reparacion

#### Caso 1 - Descripción de una reparación

**Fixture**

- Equipo: "Ascensor principal".
- Técnico: "Martín Suárez".
- Cantidad de horas: 5.
- Precio por hora: 4500.

**Operación**

- Invocar `descripcion()`.

**Resultado esperado**

- Devuelve:
  `Reparacion de ascensor principal por Martín Suárez (5 horas a $4500 por hora)`.

---

#### Caso 2 - Cálculo del costo de una reparación

**Fixture**

- Una reparación de 5 horas con precio por hora de $4500.

**Operación**

- Invocar `calcularCosto()`.

**Resultado esperado**

- Devuelve `22500`.

---

### Clase Reemplazo

#### Caso 1 - Descripción de un reemplazo

**Fixture**

- Componente: "luminarias".
- Sector: "cochera".
- Cantidad: 8.
- Precio unitario: 1200.

**Operación**

- Invocar `descripcion()`.

**Resultado esperado**

- Devuelve:
  `Reemplazo de 8 luminarias en cochera ($1200 cada una)`.

---

#### Caso 2 - Cálculo del costo de un reemplazo

**Fixture**

- Un reemplazo de 8 componentes con precio unitario de $1200.

**Operación**

- Invocar `calcularCosto()`.

**Resultado esperado**

- Devuelve `9600`.

---

### Clase Normal

#### Caso 1 - Costo de una inspección normal

**Fixture**

- Un objeto `Normal`.

**Operación**

- Invocar `calcularCosto()`.

**Resultado esperado**

- Devuelve `6000`.

---

### Clase Urgente

#### Caso 1 - Costo de una inspección urgente

**Fixture**

- Un objeto `Urgente`.

**Operación**

- Invocar `calcularCosto()`.

**Resultado esperado**

- Devuelve `9000`.

---

### Clase OrdenDeMantenimiento

#### Caso 1 - Descripción de una orden

**Fixture**

Una orden llamada "Mantenimiento Torre Norte" que contiene:

- Una inspección urgente.
- Una reparación.
- Un reemplazo.

**Operación**

- Invocar `descripcion()`.

**Resultado esperado**

- Devuelve un String que contiene el nombre de la orden seguido de la descripción numerada de todos los trabajos en el mismo orden en que fueron agregados.

---

#### Caso 2 - Cálculo del costo total de una orden

**Fixture**

Una orden con los siguientes trabajos:

- Inspección urgente: $9000.
- Reparación: 5 × $4500 = $22500.
- Reemplazo: 8 × $1200 = $9600.

**Operación**

- Invocar `calcularCostoTotal()`.

**Resultado esperado**

- Devuelve `41100`, correspondiente a la suma de los costos de todos los trabajos de la orden.