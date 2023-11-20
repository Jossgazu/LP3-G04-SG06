package ejercicio05l10f3;
public class Buscador<T extends Number> {
    public int buscarElemento(T[] arreglo, T elementoBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(elementoBuscado)) {
                return i;
            }
        }
        return -1;
    }
}