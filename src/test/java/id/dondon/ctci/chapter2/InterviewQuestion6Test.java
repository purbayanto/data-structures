package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.LinkedList;
import id.dondon.stack.StackOverflowException;
import id.dondon.stack.StackUnderflowException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InterviewQuestion6Test {

    @Test
    public void solution1_whenInputIsPalindrome_thenShouldReturnTrue() {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(2);
        boolean result = InterviewQuestion6.solution1(palindrome.getHead());
        assertTrue(result);
    }

    @Test
    public void solution1_whenInputIsEvenPalindrome_thenShouldReturnTrue() {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(1);
        palindrome.addNode(2);
        boolean result = InterviewQuestion6.solution1(palindrome.getHead());
        assertTrue(result);
    }

    @Test
    public void solution1_whenInputIsNotPalindrome_thenShouldReturnFalse() {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(3);
        boolean result = InterviewQuestion6.solution1(palindrome.getHead());
        assertFalse(result);
    }

    @Test
    public void solution2_whenInputIsPalindrome_thenShouldReturnTrue() throws StackOverflowException, StackUnderflowException {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(2);
        boolean result = InterviewQuestion6.solution2(palindrome.getHead());
        assertTrue(result);
    }

    @Test
    public void solution2_whenInputIsEvenPalindrome_thenShouldReturnTrue() throws StackOverflowException, StackUnderflowException {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(1);
        palindrome.addNode(2);
        boolean result = InterviewQuestion6.solution2(palindrome.getHead());
        assertTrue(result);
    }

    @Test
    public void solution2_whenInputIsNotPalindrome_thenShouldReturnFalse() throws StackOverflowException, StackUnderflowException {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(3);
        boolean result = InterviewQuestion6.solution2(palindrome.getHead());
        assertFalse(result);
    }

    @Test
    public void solution3_whenInputIsPalindrome_thenShouldReturnTrue() {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(2);
        boolean result = InterviewQuestion6.solution3(palindrome.getHead());
        assertTrue(result);
    }

    @Test
    public void solution3_whenInputIsEvenPalindrome_thenShouldReturnTrue() {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(1);
        palindrome.addNode(2);
        boolean result = InterviewQuestion6.solution3(palindrome.getHead());
        assertTrue(result);
    }

    @Test
    public void solution3_whenInputIsNotPalindrome_thenShouldReturnFalse() {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(3);
        boolean result = InterviewQuestion6.solution3(palindrome.getHead());
        assertFalse(result);
    }

    @Test
    public void solution3_whenInputIsNotPalindrome2_thenShouldReturnFalse() {
        LinkedList<Integer> palindrome = new LinkedList<Integer>();
        palindrome.addNode(3);
        palindrome.addNode(2);
        palindrome.addNode(1);
        palindrome.addNode(3);
        palindrome.addNode(3);
        boolean result = InterviewQuestion6.solution3(palindrome.getHead());
        assertFalse(result);
    }

}
