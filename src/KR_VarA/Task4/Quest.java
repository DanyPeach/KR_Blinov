package KR_VarA.Task4;

import java.util.Objects;

public class Quest {
    private int a;
    private short b;

    public int hashcode(int a, short b){
        return Objects.hash(a,b);
    }
}
