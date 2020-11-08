package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InterviewQuestion3Test {

    @Test
    public void solution1() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        // linkedList.printNodes();

        boolean result = InterviewQuestion3.solution1(linkedList.getHead());
        assertTrue(result);

        linkedList.printNodes();
    }

}
