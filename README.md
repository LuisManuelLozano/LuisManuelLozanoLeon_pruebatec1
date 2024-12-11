# LuisManuelLozanoLeon_pruebatec1
Documentación de Ejecución y Pruebas de la Aplicación de Gestión de Empleados
1. Introducción
Esta documentación proporciona una guía sobre cómo ejecutar y probar la aplicación de gestión de empleados desarrollada en Java. Además, se incluyen los supuestos considerados durante el desarrollo.
2. Requisitos Previos
Antes de ejecutar la aplicación, asegúrese de tener lo siguiente:
•	Java Development Kit (JDK) instalado (versión 8 o superior).
•	Apache Maven (opcional, si el proyecto utiliza Maven para la gestión de dependencias).
•	Git instalado (opcional, si desea clonar el repositorio desde GitHub).
3. Configuración del Entorno
1.	Clonar el Repositorio desde GitHub:
bash
git clone https://github.com/LuisManuelLozano/LuisManuelLozanoLeon_pruebatec1.git
cd LuisManuelLozanoLeon_pruebatec1
2.	Compilar el Proyecto: Si está utilizando Maven, puede compilar el proyecto con el siguiente comando:
bash
mvn clean install
3.	Ejecutar la Aplicación: Puede ejecutar la aplicación directamente desde su IDE favorito (como IntelliJ IDEA o Eclipse) o desde la línea de comandos:
bash
java -cp target/LuisManuelLozanoLeon_pruebatec1-1.0-SNAPSHOT.jar org.example.Main
4. Ejecución de la Aplicación
1.	Menú Principal: Al ejecutar la aplicación, se mostrará el menú principal con las opciones disponibles para gestionar empleados.
2.	Opciones del Menú:
o	Crear Empleado: Permite ingresar los datos de un nuevo empleado.
o	Editar Empleado: Permite modificar los datos de un empleado existente.
o	Eliminar Empleado: Permite eliminar un empleado por su ID.
o	Listar Empleados: Muestra una lista de todos los empleados registrados.
o	Buscar Empleado: Permite buscar un empleado por nombre y apellido.
5. Pruebas
Para probar la aplicación, siga estos pasos:
1.	Crear un Nuevo Empleado:
o	Seleccione la opción de crear un nuevo empleado.
o	Ingrese los datos requeridos (nombre, apellido, cargo, salario, fecha de inicio).
2.	Editar Empleado Existente:
o	Seleccione la opción de editar un empleado.
o	Ingrese el ID del empleado y los nuevos datos a modificar (cargo, salario, fecha de inicio).
3.	Eliminar un Empleado:
o	Seleccione la opción de eliminar un empleado.
o	Ingrese el ID del empleado a eliminar.
4.	Listar Empleados:
o	Seleccione la opción de listar todos los empleados y verifique que los empleados registrados se muestran correctamente.
5.	Buscar Empleado:
o	Seleccione la opción de buscar un empleado.
o	Ingrese el nombre y apellido del empleado para verificar que la búsqueda se realiza correctamente.
6. Supuestos Considerados
Durante el desarrollo de esta aplicación, se consideraron los siguientes supuestos:
•	Validación de Datos: Se asumió que los campos nombre, apellido, cargo y fecha de inicio no pueden estar vacíos.
•	Formato de Fecha: La fecha de inicio se ingresa en el formato yyyy/MM/dd.
•	Salario: El salario debe ser un número positivo.
•	Persistencia de Datos: Los datos de los empleados se gestionan en memoria utilizando listas.
7. Conclusión
Siguiendo estos pasos, debería poder ejecutar y probar la aplicación de gestión de empleados correctamente. Si encuentra algún problema o tiene preguntas adicionales, no dude en consultar la documentación técnica o contactar al desarrollador.



