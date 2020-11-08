package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterviewQuestion1Test {

    @Test
    public void solution1() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(3);
        linkedList.addNode(4);

        InterviewQuestion1.solution1(linkedList.getHead());

        assertEquals(2, linkedList.countNodes());
    }

    @Test
    public void solution2() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(3);
        linkedList.addNode(4);

        InterviewQuestion1.solution2(linkedList.getHead());

        assertEquals(2, linkedList.countNodes());
    }

    @Test
    public void solution3() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(3);
        linkedList.addNode(3);
        linkedList.addNode(4);

        InterviewQuestion1.solution3(linkedList.getHead());

        assertEquals(2, linkedList.countNodes());
    }

}
