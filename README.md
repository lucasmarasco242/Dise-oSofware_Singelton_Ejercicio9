Ejercicio 9 - Sistema de Monitoreo de Métricas de Rendimiento

Explicación del programa

En este ejercicio se creó una clase llamada MetricasSistema que aplica el patrón Singleton para recopilar y gestionar métricas de rendimiento de manera centralizada y transversal sin utilizar librerías externas ni imports.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Atributos privados para llevar el control de operaciones, latencia total, latencia máxima y un umbral límite.
- Un constructor privado que inicializa los contadores en cero.
- Un método estático público llamado getInstancia() que devuelve siempre la misma referencia única.
- Métodos públicos para registrar operaciones con su latencia, controlar el umbral de capacidad y mostrar un resumen consolidado.

Luego, dentro del método main, se obtienen dos referencias al colector de métricas:
MetricasSistema m1 = MetricasSistema.getInstancia();
MetricasSistema m2 = MetricasSistema.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias son iguales, registrar operaciones, verificar el control de capacidad ante el umbral y mostrar el resumen por consola.

Lógica utilizada

La lógica del programa consiste en:
- Restringir la instanciación externa mediante un constructor privado.
- Controlar el acceso global a través de getInstancia() asegurando que las métricas se acumulen en una única instancia compartida.
- Implementar un control interno de capacidad mediante un umbral para evitar la acumulación excesiva de datos, reseteando las métricas automáticamente al alcanzar el límite establecido.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia?: true
Métrica registrada - Latencia: 120ms
Métrica registrada - Latencia: 250ms
--- Resumen de Métricas ---
Operaciones acumuladas: 2
Latencia total: 370ms
Latencia máxima: 250ms
Métrica registrada - Latencia: 90ms
¡Umbral alcanzado! Limpiando y reseteando métricas acumuladas...
--- Resumen de Métricas ---
Operaciones acumuladas: 0
Latencia total: 0ms
Latencia máxima: 0ms

Captura de pantalla
<img width="566" height="396" alt="image" src="https://github.com/user-attachments/assets/bc63b28e-acf2-4640-8310-c6943292a526" />

