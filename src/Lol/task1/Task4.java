package Lol.task1;

import java.util.Objects;

public class Task4 {
    private byte a;
    private byte b;
    private byte c;

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
