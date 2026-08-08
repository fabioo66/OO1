## 3. Casos de prueba

### DadoEstandar

| Caso | Parámetros | Resultado esperado | Técnica |
|---|---|---|---|
| 1 | Sin parámetros | Un valor entre 1 y 6 | Partición equivalente válida |
| 2 | Sin parámetros | El valor obtenido puede ser 1 | Valor de borde inferior |
| 3 | Sin parámetros | El valor obtenido puede ser 6 | Valor de borde superior |

### DadoModificadorFijo

| Caso | Parámetros | Resultado esperado | Técnica |
|---|---|---|---|
| 1 | valorFijo = 0 | Un valor entre 1 y 6 | Valor de borde |
| 2 | valorFijo = 2 | Un valor entre 3 y 8 | Partición equivalente válida |
| 3 | valorFijo = -2 | Un valor entre -1 y 4 | Partición equivalente válida |

### DadoPonderado

| Caso | Parámetros | Resultado esperado | Técnica |
|---|---|---|---|
| 1 | Probabilidades que suman 1 | Devuelve uno de los valores configurados | Partición equivalente válida |
| 2 | Un valor con probabilidad 0 | Nunca devuelve ese valor | Valor de borde |
| 3 | Probabilidades que no suman 1 | Configuración inválida | Partición equivalente inválida |

### DadoExplosivo

| Caso | Parámetros | Resultado esperado | Técnica |
|---|---|---|---|
| 1 | valorMaximo = 1 | Siempre devuelve 1 | Valor de borde |
| 2 | valorMaximo = 6 | Devuelve un valor mayor o igual a 1, pudiendo superar 6 | Partición equivalente válida |
| 3 | valorMaximo = 0 | Configuración inválida | Valor de borde |

### Cubilete

| Caso | Parámetros | Resultado esperado | Técnica |
|---|---|---|---|
| 1 | Un dado estándar | El lanzamiento contiene un valor entre 1 y 6 | Partición equivalente válida |
| 2 | Varios dados | El lanzamiento contiene un valor por cada dado | Partición equivalente válida |
| 3 | Dados de diferentes tipos | Cada dado utiliza su propio comportamiento | Partición equivalente válida |
| 4 | Realizar dos lanzamientos consecutivos | Cada lanzamiento conserva sus propios valores y total | Partición equivalente válida |
| 5 | Cubilete sin dados | Lanzamiento con lista de valores vacía y total 0 | Valor de borde |