3_ Casos de prueba:

- Generar la etiqueta
    - Crear una encomienda con un destinatario y un contenido.
    - Verificar que la etiqueta generada incluya correctamente el destinatario, el resumen del contenido y las instrucciones.

- Calcular el costo de envío
    - Probar el costo de cada tipo de contenido individual.
    - Documentos:
        - Probar cuando es confidencial.
        - Probar cuando no es confidencial.
        - Verificar que el costo sea $400 en ambos casos y que se agreguen $100 cuando es confidencial.
    - Productos frágiles:
        - Probar cuando requiere embalaje especial.
        - Probar cuando no requiere embalaje especial.
        - Verificar que el costo sea $500 en ambos casos y que se agreguen $200 cuando requiere embalaje especial.
    - Alimentos:
        - Probar cuando requiere refrigeración.
        - Probar cuando no requiere refrigeración.
        - Verificar que el costo sea $400 en ambos casos y que se agreguen $150 cuando requiere refrigeración.
    - Envío combinado:
        - Probar que el costo sea la suma de los costos de todos los contenidos incluidos.

- Probar cada tipo de contenido
    - Documentos:
        - Probar las particiones de cuando es confidencial y cuando no.
        - Verificar el resumen del documento.
        - Verificar las instrucciones cuando es confidencial y cuando no.
        - Probar valores de borde para la cantidad de hojas, por ejemplo, un documento de 1 hoja.
    - Productos frágiles:
        - Probar las particiones de cuando requiere embalaje especial y cuando no.
        - Verificar el resumen del producto.
        - Verificar las instrucciones dependiendo de si requiere embalaje especial.
    - Alimentos:
        - Probar las particiones de cuando requiere refrigeración y cuando no.
        - Verificar el resumen del alimento.
        - Verificar las instrucciones dependiendo de si requiere refrigeración.
    - Envío combinado:
        - Probar que el costo sea la suma de los costos de todos los contenidos.
        - Verificar que el resumen devuelva los resúmenes de todos los contenidos separados por punto y coma.
        - Verificar que las instrucciones de todos los contenidos estén presentes y numeradas en orden.

B1_ **No, está mal**, ya que cualquier clase externa podría modificar directamente los atributos `saldo` y `titular`. Esto viola el **encapsulamiento**, porque el estado interno de la clase debería estar protegido y ser manipulado mediante sus métodos.

B2_ **No, está mal**, ya que la clase `Factura` está accediendo directamente a los atributos de cada `Item` para calcular el costo. Cada `Item` debería ser responsable de calcular su propio costo mediante un método, por ejemplo `calcularCosto()`, y el método `calcularCosto()` de `Factura` debería enviar ese mensaje a cada `Item` y acumular los resultados. La implementación original presenta una **envidia de atributos**, porque `Factura` necesita conocer los datos internos de `Item` para realizar una operación que debería ser responsabilidad del propio `Item`.