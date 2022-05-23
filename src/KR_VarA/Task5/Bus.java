package KR_VarA.Task5;

import java.util.Objects;

public class Bus {
    protected String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return Objects.equals(type, bus.type);
    }

}
