# Pr-ctica-de-laboratorio-06-Gesti-n-de-Directorios-en-Java
Desarrollo de una aplicación informática para la gestión de directorios en Java utilizando manejo de excepciones

**1.	se pidió desarrollar una interfaz que manipule directorios y archivos. **
Para esta practica se crearon 2 paquetes:

	ec.edu.ups.controlador
	ec.edu.ups.vista
	
**2.	ec.edu.ups.controlador**

En este paquete se creo los métodos la cual van a interactuar con la interfaz para poder manipular los directorios y archivos.

**3.	ControladorDirectorio (class)**

Esta clase tiene tres atributos de tipo String, File y File[]. Solamente se instancio un controlador sin atributos ni parámetros. 

En esta clase se importaron los paquetes:

	import java.io.File;
	import java.text.DecimalFormat;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	
se crearon 9 métodos para poder manipular los datos de los directorio y los archivos.

	listarArchivos: este método recibe en sus parámetros un dato de tipo File. Después se consigue todos los File de ese dato y se utiliza un for Each en la cual se pregunta si el dato es un archivo. Si es un archivo consigue el nombre del dato y lo añade a una lista de strings. y esta lista se la retorna a la interfaz. 
	listarDirectorios: este método recibe en sus parámetros un dato de tipo File. Después se consigue todos los File de ese dato y se utiliza un for Each en la cual se pregunta si el dato es un directorio. Si es un directorio consigue el nombre del dato y lo añade a una lista de strings y esta lista se la retorna a la interfaz
	 listarArchivosOcultos: este método recibe en sus parámetros un dato de tipo File. Después se consigue todos los File de ese dato y se utiliza un for Each en la cual se pregunta si el dato es un archivo. Si cumple la primera condición el programa pregunta si es un archivo oculto. Si cumple esta segunda condición consigue el nombre del dato y lo añade a una lista de strings y esta lista se la retorna a la interfaz
	listarDirectoriosOcultos: este método recibe en sus parámetros un dato de tipo File. Después se consigue todos los File de ese dato y se utiliza un for Each en la cual se pregunta si el dato es un directorio. Si cumple la primera condición el programa pregunta si es un directorio oculto. Si cumple esta segunda condición consigue el nombre del dato y lo añade a una lista de strings y esta lista se la retorna a la interfaz
	eliminarDirectorio: este método recibe en sus parámetros un dato de tipo String. En un vector se guarda todos los File de esta ruta, después con un for se recorre todo listado para poder eliminar los archivos dentro de este directorio. Por ultimo se elimina la misma carpeta. 
	renombrarDirectorio:este método recibe en sus parámetros dos datos de tipo String.  Aquí el programa pregunta si el director existe si es que existe renombre el directorio con la nueva ruta.
	mostrarInformacion: este método recibe en su parámetro un dato de tipo File. En este método se crea un SimpleDateFormat para poder formatear la fecha y hora de la manera en la que queramos que aparezca. Una vez creado el formato utilizamos el método. lastModified() para poder conseguir la ultima vez que fue modificado el dato. Por último, retornamos ese String a la interfaz. 
	 tamañoDeDirectorio: este método reciebe en sus parámetros un dato de tipo File y esta lo que hace primero es comprobar si la ruta es de un directorio o de un archivo. Después de eso calcula el tamaño del archivo.
	CrearDirectorio: este método recibe un sato de tipo String en sus parámetros y crea un nuevo archivo o directorio. Todo dependiendo de su ruta. 

**4.	ec.edu.ups.vista**

en este paquete se crearon las interfaces para que el usuario pueda interactuar y manipular los datos de los directorios y archivos.

	GestionarDirectorios (Aplication sample Form)
	
**5.	GestionarDirectorios (Aplication sample Form)**

En esta interface se importaron los siguientes metodos: 

	import ec.edu.ups.controlador.ControladorDirectorio;
	import java.io.File;
	import java.io.IOException;
	import java.text.DecimalFormat;
	import java.util.List;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	import javax.swing.JOptionPane;
	
se crearon un atributo para esta clase. Se instancio el controladorDirectorio. Esta mismas fue creada dentro del controlador.
En esta interfaz se crearon 4 menu Items en las cuales cada un tiene un mando diferente. 

	itemTabCrearActionPerformed: en esta item tab aparecerá un option panel en la cual permitirá que el usuario cree un nuevo directorio 
	ItemTabRenombrarActionPerformed: en este item tab aparecerá un option panel en la cual el usuario debe ingresar un nombre para renombrar el directorio. 
	itemTabEliminarActionPerformed: en este ítem tab aparecerá un option panel en la cual permitirá eliminar un directorio.
	exitMenuItemActionPerformed: al presionar este ítem tab se terminar el programa.  
	
Se creo un método para poder actualizar la vista de la tabla. Así cuando el usuario presione cualquier botón se actualizará los datos de la tabla. 
En la interfaz se crearon 5 botones en las cuales cada uno tiene un comando diferente:

	botonListarDActionPerformed: al momento que el usuario presione el botón este actionPerformed reciebe los datos del textbox crea un nuevo dato tipo File y lo paso al controlador a que me retorne la lista de directorios.
	botonListarAActionPerformed: al momento que el usuario presione el botón este actionPerformed reciebe los datos del textbox crea un nuevo dato tipo File y lo paso al controlador a que me retorne la lista de archivos.
	botonListarArchivosOcultosActionPerformed: al momento que el usuario presione el botón este actionPerformed reciebe los datos del textbox crea un nuevo dato tipo File y lo paso al controlador a que me retorne la lista de archivos ocultos.
	botonListarDirectoriosActionPerformed: al momento que el usuario presione el botón este actionPerformed reciebe los datos del textbox crea un nuevo dato tipo File y lo paso al controlador a que me retorne la lista de directorios ocultos.
	botonMostrarInformacionActionPerformed: este botón concatena la ruta del textbox con el nombre del archivo de la lista. Luego se crea un nuevo dato de tipo File con la ruta del textbox y se manda al controlador a que encuentre los datos del archivo. Una vez obtenidos los datos del archivo mandamos los datos al JText Area y este debe mostrarnos todos los datos de los documentos.  
