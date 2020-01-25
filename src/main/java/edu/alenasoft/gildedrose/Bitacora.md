**Cambios realizados al proyecto**

1.- En la clase Item he modificado los modificadores de acceso de los tres atributos o propiedades a privadas, ya que 
no hay razon de que sean publicas, porque desde la clase **GlideRose** se accederan a estas propiedades a travez de sus
metodos getters y setters; ya sea para obtener o modificar cualquier valor.

2.- En la clase GlideRouse he modificado el modificador de acceso del contenedor de items a privado ya que esta lista 
solo se accedera desde el mismo ambito de la clase.

3.- En el metodo **updateQuality** he cambiado el bucle for por un foreach por cuestiones de eficiencia

4.- En el metodo updateQality para poder leer mejor las condiciones he interpolado las preguntas,
es decir primero obtuve el nombre de cada item, y ese nombre comparaba con el nombre de la condicion

5.- En el metodo updateQality He eliminado condicionales Ifs anidados y agrupe las condiciones dentro de los ifs para reducir el numero de anidaciones

6.- En el metodo updateQality he refactorizado llamadas a metodos dentro de ifs para evitar redundancia de llamadas d emetodos

7.- Aun se puede crear una clase o una estructura de almacenamiento de datos como un diccionario para agregar
los nombres de rosas y hacer referencia a ellos a travez de un key, en lugar de quemar el nombre en el metodo

8.- Creo que como la mayoria de los metodos llaman al setQuality o setSellIn, se podria crear dos metodos que hagan eso
y solo referenciarlos a ellos apropadamente.