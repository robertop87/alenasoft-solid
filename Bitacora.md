SMELLS
- Condicionales anidadas.
- Magic number.
- Código duplicado

- El metodo **updateQuality** hace dos cosas primero itera a traves de la lista y actualiza el <i>quality</i> de los items (Single Responsibility Principle).<br/>
- Agregando constantes para la calidad maxima y minima.
- Las condiciones anidadas pueden refactorizarse a traves de la implementacion de una nueva clase.
- Cada item deberia sabes como actualizar su **quality**.
- Todos los items tienen como metodo comun el actualizarce (crear una interfaz que tenga dicho metodo).
- 