/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Permutation {
    public static void main(String[] args) {
        if (args.length < 1) {
            StdOut.print("Insufficent arguments");
        }

        int k = Integer.parseInt(args[0]);

        RandomizedQueue<String> rq = new RandomizedQueue<>();

        String input;
        while (!StdIn.isEmpty()) {
            input = StdIn.readString();
            rq.enqueue(input);
        }

        Iterator<String> it = rq.iterator();
        for (int i = 0; i < k; i++) {
            if (it.hasNext()) {
                StdOut.println(it.next());
            }
        }
    }
}
