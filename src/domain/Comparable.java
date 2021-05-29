package domain;

public interface Comparable {

    public default boolean compareTo(Object A, Object B) {
        if (A == B) {
            return true;
        }
        else {
            return false;
        }
    }
}
