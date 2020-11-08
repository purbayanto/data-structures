package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterviewQuestion2Test {

    @Test
    public void solution1() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        int result1 = InterviewQuestion2.solution1(linkedList.getHead(), 0);
        assertEquals(4, result1);

        int result2 = InterviewQuestion2.solution1(linkedList.getHead(), 1);
        assertEquals(4, result2);

        int result3 = InterviewQuestion2.solution1(linkedList.getHead(), 2);
        assertEquals(4, result3);

        int result4 = InterviewQuestion2.solution1(linkedList.getHead(), 3);
        assertEquals(4, result4);
    }

    @Test
    public void solution2() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        int result1 = InterviewQuestion2.solution2(linkedList.getHead(), 0);
        assertEquals(4, result1);

        int result2 = InterviewQuestion2.solution2(linkedList.getHead(), 1);
        assertEquals(4, result2);

        int result3 = InterviewQuestion2.solution2(linkedList.getHead(), 2);
        assertEquals(4, result3);

        int result4 = InterviewQuestion2.solution2(linkedList.getHead(), 3);
        assertEquals(4, result4);
    }

}
