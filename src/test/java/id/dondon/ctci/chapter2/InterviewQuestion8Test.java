package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InterviewQuestion8Test {

    @Test
    public void solution1_whenHasLoop() {
        Node<Integer> a1 = new Node<Integer>(1);
        Node<Integer> a2 = new Node<Integer>(2);
        Node<Integer> a3 = new Node<Integer>(3);
        Node<Integer> a4 = new Node<Integer>(4);

        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a4);
        a4.setNext(a2); // loop at a4

        Node<Integer> result = InterviewQuestion8.solution1(a1);
        assertEquals(a2, result);
    }

    @Test
    public void solution1_whenHasNoLoop() {
        Node<Integer> a1 = new Node<Integer>(1);
        Node<Integer> a2 = new Node<Integer>(2);
        Node<Integer> a3 = new Node<Integer>(3);
        Node<Integer> a4 = new Node<Integer>(4);

        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a4);

        Node<Integer> result = InterviewQuestion8.solution1(a1);
        assertNull(result);
    }

}
