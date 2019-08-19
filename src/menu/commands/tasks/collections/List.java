package menu.commands.tasks.collections;

import menu.commands.tasks.collections.iterator.StubIterator;

public interface List {
    void add(long data) throws Exception;

    boolean remove(long id) throws Exception;

    long find(long value) throws Exception;

    long get(long index) throws Exception;

    void update(long index, long data) throws Exception;

    long size() throws Exception;

    void bubbleSort() throws Exception;

    void quickSort() throws Exception;

    boolean removeAll() throws Exception;

    long getMin() throws Exception;

    long getMax() throws Exception;

    /* *
     *  Этап 2
     * */
    StubIterator getIterator() throws Exception;
}
