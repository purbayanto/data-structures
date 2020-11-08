package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.LinkedList;
import org.junit.Test;

public class InterviewQuestion4Test {

    @Test
    public void solution1() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addNode(3);
        linkedList.addNode(5);
        linkedList.addNode(8);
        linkedList.addNode(5);
        linkedList.addNode(10);
        linkedList.addNode(2);
        linkedList.addNode(1);

        InterviewQuestion4.solution1(linkedList.getHead(), 5);
        linkedList.printNodes();
    }

}
