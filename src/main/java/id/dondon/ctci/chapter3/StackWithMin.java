package id.dondon.ctci.chapter3;

import java.util.Stack;

/**
 * Stack Min
 * How would you design a stack which, in addition to push and pop, has a function min
 * which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 * */
public class StackWithMin extends Stack<StackWithMin.NodeWithMin> {

    public void push(int value) {
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }

    public int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return peek().min;
        }
    }

    public static class NodeWithMin {
        public int value;
        public int min;
        public NodeWithMin(int v, int min){
            value = v;
            this.min = min;
        }
    }
}
