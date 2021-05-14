package menu.commands.tasks.collections.arraylist;

import menu.commands.tasks.collections.List;
import menu.commands.tasks.collections.iterator.Iterator;


import static menu.commands.tasks.collections.arraylist.DmitriiEnum.*;

public class DmitiiArrayList implements List {

    private long[] value;
    private int size;

    public DmitiiArrayList() {
        this.value = new long[INITIAL_AMOUNT.getValue()];
        this.size = INITIAL_AMOUNT.getValue();
    }

    @Override
    public void add(long data) throws Exception {
        long[] arraytemp = value;
        value = new long[value.length + 1];
        System.arraycopy(arraytemp,
                START_POSITION_OF_INITIAL_ARRAY.getValue(),
                value,
                START_POSITION_OF_NEW_ARRAY.getValue(),
                arraytemp.length);
        value[value.length-1] = data;
        size++;
    }

    @Override
    public boolean remove(int id) throws Exception {
        return false;
    }

    @Override
    public long find(long value) throws Exception {
        return 0;
    }

    @Override
    public long get(int index) throws Exception {
        return 0;
    }

    @Override
    public void update(int index, long data) throws Exception {

    }

    @Override
    public int size() throws Exception {
        return 0;
    }

    @Override
    public void bubbleSort() throws Exception {

    }

    @Override
    public void quickSort() throws Exception {

    }

    @Override
    public boolean removeAll() throws Exception {
        return false;
    }

    @Override
    public long getMin() throws Exception {
        return 0;
    }

    @Override
    public long getMax() throws Exception {
        return 0;
    }

    @Override
    public Iterator getIterator() throws Exception {
        return null;
    }
}
