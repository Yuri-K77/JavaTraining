package classes.ClassObject;

import java.util.Objects;

public class Version {
    String h;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Version)) return false;
        Version version = (Version) o;
        return Objects.equals(h, version.h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(h);
    }
}
