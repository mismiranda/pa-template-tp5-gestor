# Concepto de Gestor (Manager) en POO

## 1. Definición y Propósito
En Programación Orientada a Objetos, los **Gestores** (o *managers* en inglés) son objetos o clases encargados de manejar, coordinar o administrar ciertos aspectos o recursos dentro de un sistema. Su propósito es encapsular la lógica relacionada con la gestión de esos recursos.

### Ventajas Principales:
* **Centralización:** Centralizan la administración de los recursos en un único punto.
* **Reutilización:** Facilitan la reutilización de código.
* **Seguridad y Control:** Aseguran el manejo adecuado de recursos críticos.

---

## 2. Responsabilidades y Tipos de Gestores
Según el contexto de la aplicación, las responsabilidades de un gestor pueden incluir:
* **Gestión de Recursos:** Controlan recursos como conexiones a bases de datos, archivos o memoria (ej. abrir, cerrar y reutilizar conexiones).
* **Gestión de Estado:** Controlan el estado de un objeto o un grupo de objetos (ej. mantener la sesión de un usuario).
* **Control de Procesos:** Coordinan el flujo de procesos o administración de hilos concurrentes.
* **Delegación de Tareas:** Envían notificaciones o llamadas a componentes especializados encargados de reaccionar a eventos.

---

## 3. Estructura Básica de un Gestor
La estructura de cualquier gestor se compone al menos de:
1. **Un Contenedor (*container*):** Estructura de datos (arreglo, lista, árbol, archivo, base de datos) que sostiene la colección de objetos.
2. **Conjunto de Operaciones (Métodos/Servicios):** Permiten la manipulación del contenedor.

### Operaciones Básicas:
* **Agregar:** Añadir nuevos objetos al contenedor.
* **Eliminar:** Remover objetos del contenedor.
* **Buscar:** Localizar un objeto dentro del contenedor.
* **Recorrer:** Iterar sobre la colección con diversos propósitos.

> **Relación de Diseño:** La relación entre la clase Gestor y los objetos que maneja es de **Composición** [6]. En Java, un gestor se implementa mediante una clase que encapsula un vector como contenedor.

---

## 4. Ejemplo Práctico: Lista de Contactos (`ContactList`)

En un cliente de correo (como Outlook o Yahoo/Hotmail), una **Lista de Contactos** administra objetos `Contact` (que contienen `name` y `mail`).

### Implementación en Java:

```java
// Clase de entidad
public class Contact {
    private String name;
    private String mail;

    public Contact(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
}

// Clase Gestor
public class ContactList {
    private Contact[] contacts;
    private int size;
    private int next;

    public ContactList(int n) {
        this.size = n;
        this.contacts = new Contact[size];
        this.next = 0;
    }

    public void addContact(Contact contact) {
        if (!(this.next < this.size)) {
            this.enlarge();
        }
        this.contacts[next] = contact;
        this.next++;
    }

    public boolean searchContact(String contactName) {
        boolean found = false;
        int count = 0;
        Contact aux;
        while (!found && count < next) {
            if (contacts[count] != null) {
                aux = contacts[count];
                if (aux.getName().equals(contactName)) {
                    found = true;
                }
            }
            count++;
        }
        return found;
    }

    public void removeContact(String contactName) {
        boolean found = false;
        int count = 0;
        Contact aux;
        while (!found && count < next) {
            if (contacts[count] != null) {
                aux = contacts[count];
                if (aux.getName().equals(contactName)) {
                    found = true;
                }
            }
            count++;
        }
        if (found) {
            contacts[count - 1] = null;
        }
    }

    private void enlarge() {
        int count2 = 0;
        Contact[] aux = new Contact[size + 100];
        for (int count1 = 0; count1 < size; count1++) {
            if (contacts[count1] != null) {
                aux[count2] = contacts[count1];
                count2++;
            }
        }
        this.contacts = aux;
        this.next = count2;
        this.size = size + 100;
    }
}
```

### Funciones del método `enlarge()`:
1. Permite redimensionar el arreglo superando las restricciones estáticas de capacidad.
2. Permite recuperar el espacio asignado a los objetos eliminados eficientemente sin necesidad de corrimiento de elementos en cada eliminación.
