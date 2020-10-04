package id.dondon.binarytrees;

import id.dondon.binarytrees.depthfirsttravelsal.BinaryTreeInOrderTraversal;
import id.dondon.binarytrees.depthfirsttravelsal.BinaryTreePostOrderTraversal;
import id.dondon.queue.QueueOverflowException;
import id.dondon.queue.QueueUnderflowException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreePostOrderTraversalTest {

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

        BinaryTreePostOrderTraversal binaryTreePostOrderTraversal = new BinaryTreePostOrderTraversal();
        List<Object> result = binaryTreePostOrderTraversal.postOrder(a);
        List<Character> expected = Arrays.asList('X', 'B', 'F', 'H', 'D', 'G', 'E', 'C', 'A');

        assertEquals(expected, result);
    }

}
