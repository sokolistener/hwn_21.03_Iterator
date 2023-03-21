import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min;
    protected int max;


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max+1);
            }
        };
    }

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
