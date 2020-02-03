# Acciones realizadas para limpiar el código
1. BAD_SMELL - Editando a privado el modificador de acceso en los atributos de Item:
    public String name;
    public int sellIn;
    public int quality;

2. BAD_SMELL - Reemplazando la concatenacion por String.format el mensaje de toString() en Item:
    return "Item{" + "name='" + name + '\'' + ", sellIn=" + sellIn + ", quality=" + quality + '}';
3. BAD_SMELL - Creando un enum Product para los items
4. BAD_SMELL - Creando un metodo loadItems para cargar los datos en lugar de eso
//    items.add(new Item(Product.DEXTERITY_VEST.getName(), Product.DEXTERITY_VEST.getSellIn(), Product.DEXTERITY_VEST.getQuality()));
//    items.add(new Item("Aged Brie", 2, 0));
//    items.add(new Item("Elixir of the Mongoose", 5, 7));
//    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
//    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
//    items.add(new Item("Conjured Mana Cake", 3, 6));
5. BAD_SMELL - Reemplazando por 0 la siguiente funcion:
    items.get(i).getQuality() - items.get(i).getQuality()
6. BAD_SMELL - Eliminando los ifs inncesarios anidados tratando de reducir el acoplamiento.
7. Aplicando el principio de single responsability - Crear metodos para aniadir/reducir cantidad y dias incluyendo las validaciones de quantity y sellIn requeridas
8. Separando constantes
9. Actualizando los tests
10. Aniadiendo codigo para Conjured.
11. Actualizando los tests.
