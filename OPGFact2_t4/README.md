# OPGFact2_t4 - Actividad 2 (Patrón MVC con Spring Boot y Thymeleaf)

**Estudiante:** Gael Fernando Ortiz Pérez  
**Semestre:** 7mo Semestre ISC - ITO  
**Puerto de ejecución:** `8087`

---

## Descripción del Proyecto

Proyecto desarrollado en **Spring Boot** implementando el patrón **Modelo-Vista-Controlador (MVC)** con **Thymeleaf** para el renderizado de vistas del lado del servidor, uso de clases **DTO** ([`MateriaDTO`](src/main/java/models/dto/MateriaDTO.java)), manejo de parámetros mediante `@RequestParam`, `@PathVariable` y `@ModelAttribute`, inyección de propiedades externas con `@Value` desde `application.properties`, y endpoints REST para pruebas `POST` con `@RequestBody`.

---

## Endpoints Implementados

### Controlador MVC (`MateriaController` - `/vistas`)
| Método | Ruta | Descripción |
| :--- | :--- | :--- |
| `GET` | `/vistas/materias` | Muestra la lista de materias usando `Model`, `@ModelAttribute`, `@Value` y `th:each`. |
| `GET` | `/vistas/formulario` | Muestra el formulario para registrar una nueva materia con `MateriaDTO`. |
| `POST` | `/vistas/guardar` | Procesa los datos enviados desde el formulario mediante `@ModelAttribute`. |
| `GET` | `/vistas/buscar?q={termino}` | Filtra/busca materias recibiendo el parámetro con `@RequestParam`. |
| `GET` | `/vistas/materias/{id}` | Muestra el detalle de una materia por su ID usando `@PathVariable`. |

### Controlador REST (`MateriaRestController` - `/api/materias`)
| Método | Ruta | Descripción |
| :--- | :--- | :--- |
| `POST` | `/api/materias/solicitud` | Recibe un objeto JSON en un `MateriaDTO` mediante `@RequestBody` y lo retorna en JSON. |
| `GET` | `/api/materias/valores` | Retorna en formato JSON las propiedades inyectadas con `@Value`. |

---

## Capturas de Pantalla

### 1. Listado de Materias (`th:each` y `@Value`)
Ruta: `GET /vistas/materias`

![Listado de materias](capturas/lista.png)

### 2. Formulario con `@ModelAttribute`
Ruta: `GET /vistas/formulario` y `POST /vistas/guardar`

![Formulario de materia](capturas/formulario.png)

![Resultado del formulario](capturas/exito.png)

### 3. Búsqueda con `@RequestParam`
Ruta: `GET /vistas/buscar?q=Simulacion`

![Búsqueda con RequestParam](capturas/busqueda.png)

### 4. Detalle con `@PathVariable`
Ruta: `GET /vistas/materias/1`

![Detalle con PathVariable](capturas/detalle.png)

### 5. Petición `POST` en Postman / Bruno (`@RequestBody`)
Ruta: `POST /api/materias/solicitud`

![Prueba POST en Postman](capturas/postman.png)

