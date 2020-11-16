package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InterviewQuestion7Test {

    @Test
    public void solution1_whenHasIntersection() {
        Node<Integer> a1 = new Node<Integer>(1);
        Node<Integer> a2 = new Node<Integer>(2);
        Node<Integer> a3 = new Node<Integer>(3);
        Node<Integer> b4 = new Node<Integer>(4);
        b4.setNext(a1);
        a1.setNext(a2);
        a2.setNext(a3);

        Node<Integer> result = InterviewQuestion7.solution1(a1, b4);
        assertEquals(a1, result);
    }

    @Test
    public void solution1_whenHasNoIntersection() {
        Node<Integer> a1 = new Node<Integer>(1);
        Node<Integer> a2 = new Node<Integer>(2);
        Node<Integer> a3 = new Node<Integer>(3);
        Node<Integer> b4 = new Node<Integer>(4);
        Node<Integer> b5 = new Node<Integer>(5);
        Node<Integer> b6 = new Node<Integer>(6);

        a1.setNext(a2);
        a2.setNext(a3);

        b4.setNext(b5);
        b5.setNext(b6);

        Node<Integer> result = InterviewQuestion7.solution1(a1, b4);
        assertNull(result);
    }

}
