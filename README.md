# LuisManuelLozanoLeon_pruebatec1
Documentaci�n de Ejecuci�n y Pruebas de la Aplicaci�n de Gesti�n de Empleados
1. Introducci�n
Esta documentaci�n proporciona una gu�a sobre c�mo ejecutar y probar la aplicaci�n de gesti�n de empleados desarrollada en Java. Adem�s, se incluyen los supuestos considerados durante el desarrollo.
2. Requisitos Previos
Antes de ejecutar la aplicaci�n, aseg�rese de tener lo siguiente:
�	Java Development Kit (JDK) instalado (versi�n 8 o superior).
�	Apache Maven (opcional, si el proyecto utiliza Maven para la gesti�n de dependencias).
�	Git instalado (opcional, si desea clonar el repositorio desde GitHub).
3. Configuraci�n del Entorno
1.	Clonar el Repositorio desde GitHub:
bash
git clone https://github.com/LuisManuelLozano/LuisManuelLozanoLeon_pruebatec1.git
cd LuisManuelLozanoLeon_pruebatec1
2.	Compilar el Proyecto: Si est� utilizando Maven, puede compilar el proyecto con el siguiente comando:
bash
mvn clean install
3.	Ejecutar la Aplicaci�n: Puede ejecutar la aplicaci�n directamente desde su IDE favorito (como IntelliJ IDEA o Eclipse) o desde la l�nea de comandos:
bash
java -cp target/LuisManuelLozanoLeon_pruebatec1-1.0-SNAPSHOT.jar org.example.Main
4. Ejecuci�n de la Aplicaci�n
1.	Men� Principal: Al ejecutar la aplicaci�n, se mostrar� el men� principal con las opciones disponibles para gestionar empleados.
2.	Opciones del Men�:
o	Crear Empleado: Permite ingresar los datos de un nuevo empleado.
o	Editar Empleado: Permite modificar los datos de un empleado existente.
o	Eliminar Empleado: Permite eliminar un empleado por su ID.
o	Listar Empleados: Muestra una lista de todos los empleados registrados.
o	Buscar Empleado: Permite buscar un empleado por nombre y apellido.
5. Pruebas
Para probar la aplicaci�n, siga estos pasos:
1.	Crear un Nuevo Empleado:
o	Seleccione la opci�n de crear un nuevo empleado.
o	Ingrese los datos requeridos (nombre, apellido, cargo, salario, fecha de inicio).
2.	Editar Empleado Existente:
o	Seleccione la opci�n de editar un empleado.
o	Ingrese el ID del empleado y los nuevos datos a modificar (cargo, salario, fecha de inicio).
3.	Eliminar un Empleado:
o	Seleccione la opci�n de eliminar un empleado.
o	Ingrese el ID del empleado a eliminar.
4.	Listar Empleados:
o	Seleccione la opci�n de listar todos los empleados y verifique que los empleados registrados se muestran correctamente.
5.	Buscar Empleado:
o	Seleccione la opci�n de buscar un empleado.
o	Ingrese el nombre y apellido del empleado para verificar que la b�squeda se realiza correctamente.
6. Supuestos Considerados
Durante el desarrollo de esta aplicaci�n, se consideraron los siguientes supuestos:
�	Validaci�n de Datos: Se asumi� que los campos nombre, apellido, cargo y fecha de inicio no pueden estar vac�os.
�	Formato de Fecha: La fecha de inicio se ingresa en el formato yyyy/MM/dd.
�	Salario: El salario debe ser un n�mero positivo.
�	Persistencia de Datos: Los datos de los empleados se gestionan en memoria utilizando listas.
7. Conclusi�n
Siguiendo estos pasos, deber�a poder ejecutar y probar la aplicaci�n de gesti�n de empleados correctamente. Si encuentra alg�n problema o tiene preguntas adicionales, no dude en consultar la documentaci�n t�cnica o contactar al desarrollador.



