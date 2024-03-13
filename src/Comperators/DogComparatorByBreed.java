package Comperators;

import java.util.Comparator;

public class DogComparatorByBreed implements Comparator<Dog> {
    @Override
    public int compare(Dog first, Dog seccond) {
        if(first.getType().compareTo(seccond.getType()) > 0)
        {
            return 1;
        }else if(first.getType().compareTo(seccond.getType()) <0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
