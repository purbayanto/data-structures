package id.dondon.binarytrees;

import id.dondon.queue.QueueOverflowException;
import id.dondon.queue.QueueUnderflowException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeBreadthFirstTraversalTest {

    @Test
    public void trees() throws QueueUnderflowException, QueueOverflowException {
        Node<Character> a = new Node<Character>('A');
        Node<Character> b = new Node<Character>('B');
        Node<Character> c = new Node<Character>('C');
        Node<Character> d = new Node<Character>('D');
        Node<Character> e = new Node<Character>('E');
        Node<Character> f = new Node<Character>('F');
        Node<Character> g = new Node<Character>('G');
        Node<Character> h = new Node<Character>('H');
        Node<Character> x = new Node<Character>('X');

        a.setLeftChild(b);
        a.setRightChild(c);
        c.setLeftChild(d);
        c.setRightChild(e);
        d.setLeftChild(f);
        d.setRightChild(h);
        e.setRightChild(g);
        b.setLeftChild(x);

        BinaryTreeBreadthFirstTraversal binaryTreeBreadthFirstTraversal = new BinaryTreeBreadthFirstTraversal();
        List<Object> result = binaryTreeBreadthFirstTraversal.breadthFirst(a);
        List<Character> expected = Arrays.asList('A', 'B', 'C', 'X', 'D', 'E', 'F', 'H', 'G');

        assertEquals(expected, result);
    }

}
