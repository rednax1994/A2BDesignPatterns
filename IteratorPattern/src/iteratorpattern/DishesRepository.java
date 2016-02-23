/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author Ricardo Jobse
 */
public class DishesRepository implements Container {

    public String dishes[] = {"Pizza", "Pasta", "Pannekoek"};

    @Override
    public Iterator getIterator() {
        return new DishesIterator();
    }

    private class DishesIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < dishes.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return dishes[index++];
            }
            return null;
        }
    }
}
