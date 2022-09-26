package filter.case2.Criteria;

import java.util.function.Predicate;

/**
 * @param <G> type of the container-like object.
 * @param <E> type of the elements contained within this container-like object.
 */
@FunctionalInterface
public interface Filterer<G, E> {
	G by(Predicate<? super E> predicate);
}