import java.util.*;

/** * Реализация утилит для работы с коллекциями объектов * * @author nedis * @version 1.0 */
public class CollectionUtilsImpl implements CollectionUtils {

    /** * Объединяет две коллекции с сохранением всех элементов, * включая дубликаты. * * @param a Первая коллекция * @param b Вторая коллекция * @return Новая коллекция с объединёнными элементами * @throws NullPointerException Если одна из коллекций равна null */
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        List<Integer> result = new ArrayList<>(a); // Создаем копию первой коллекции
        result.addAll(b);                         // Добавляем элементы второй коллекции
        return result;
    }

    /** * Возвращает коллекцию с пересечением двух коллекций, * сохраняя все повторяющиеся элементы. * * @param a Первая коллекция * @param b Вторая коллекция * @return Коллекция пересечения * @throws NullPointerException Если одна из коллекций равна null */
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        List<Integer> result = new ArrayList<>();
        for (Integer element : a) {              // Проверяем каждый элемент первой коллекции
            if (b.contains(element)) {          // Если элемент присутствует во второй коллекции
                result.add(element);            // добавляем его в результирующую коллекцию
            }
        }
        return result;
    }

    /** * Объединяет две коллекции, исключая дублирующиеся элементы. * * @param a Первая коллекция * @param b Вторая коллекция * @return Набор уникальных элементов обеих коллекций * @throws NullPointerException Если одна из коллекций равна null */
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        Set<Integer> result = new HashSet<>(a);   // Используем set для исключения дубликатов
        result.addAll(b);                        // Добавляем вторую коллекцию
        return result;
    }

    /** * Получаем пересечение двух коллекций без дубликатов. * * @param a Первая коллекция * @param b Вторая коллекция * @return Уникальные общие элементы * @throws NullPointerException Если одна из коллекций равна null */
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        Set<Integer> result = new HashSet<>(a);      // Копируем первую коллекцию в набор
        result.retainAll(b);                       // Оставляем только элементы, присутствующие во второй коллекции
        return result;
    }

    /** * Вычисляет разность между двумя коллекциями. * * @param a Первая коллекция * @param b Вторая коллекция * @return Элементы первой коллекции, отсутствующие во второй * @throws NullPointerException Если одна из коллекций равна null */
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);

        List<Integer> result = new ArrayList<>(a);       // Копируем первую коллекцию
        result.removeAll(b);                            // Удаляем элементы, присутствующие во второй коллекции
        return result;
    }
}