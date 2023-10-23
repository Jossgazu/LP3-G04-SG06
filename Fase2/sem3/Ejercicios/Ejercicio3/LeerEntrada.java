package ejercicio3;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class LeerEntrada {
    private Reader stream;
    public LeerEntrada(InputStream Fuente) {
        stream = new InputStreamReader(Fuente);
    }
    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
}