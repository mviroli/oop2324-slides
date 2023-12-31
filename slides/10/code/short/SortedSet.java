public interface SortedSet<E> extends Set<E> {
    Comparator<? super E> comparator();
    SortedSet<E> subSet(E fromElement, E toElement);
    SortedSet<E> headSet(E toElement);   // fino a toElement
    SortedSet<E> tailSet(E fromElement); // da toElement
    E first();
    E last();
}
