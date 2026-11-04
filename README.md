<img width="2064" height="512" alt="Gemini_Generated_Image_5y07wb5y07wb5y07" src="https://github.com/user-attachments/assets/887941e8-02a8-4831-9225-f0c24ced788f" />

## 🛠️ Cómo trabajar en este repositorio

### Estructura del proyecto

- **`src/`** — acá viven los ejercicios (`EjercicioN.java`). Es el único lugar donde deben escribir código.
- **`tests/`** — pruebas automáticas (JUnit) que corren en cada `push` y determinan su puntaje en Classroom50. **No las modifiquen.**
- **`teoria/`** *(si el TP lo requiere)* — archivo `.txt` para las respuestas conceptuales.
- **`pom.xml`** — configuración de Maven. No lo modifiquen: define cómo se compila y testea el proyecto tanto localmente como en el corrector automático.

### Dónde escribir código

Dentro de cada `Ejercicio*.java` van a encontrar el método a completar, con una marca:

```java
// --- TU CÓDIGO AQUÍ ---
```

Escriban su solución únicamente en esas secciones. **No renombren clases, métodos ni archivos**, y no alteren la firma de los métodos: el autograder depende de que se mantengan exactamente como están, porque los tests los invocan por nombre.


### Entregar el trabajo

1. Completen los ejercicios y, si corresponde, el archivo de `teoria/`.
2. (Opcional) Verifiquen con `mvn test` que todo compile y pase.
3. Hagan commit siguiendo el estándar de mensajes visto en clase (`tipo: descripción` en modo imperativo) y `push`.
4. Revisen su puntaje y el detalle de errores en [classroom50.org](https://classroom50.org/).
