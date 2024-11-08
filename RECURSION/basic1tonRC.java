import java.util.Scanner;

public class basic1tonRC {
    static void printinc(int x) {
        // BASE CASE::
        if (x == 1) {
            System.out.println(1);
            return;
        }
        // RECURSIVE WORK
        printinc(x - 1);
        // SELF WORK::
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter any number");
        int k = jk.nextInt();
        printinc(k);
    }
}
/*
 * Understand the Problem: First, carefully read and understand the problem
 * statement. Identify what the function is expected to do, what are the input
 * parameters, and what should be the output.
 * 
 * Identify Base Case(s): Every recursive function should have one or more base
 * cases that define when the recursion should stop. Base cases are typically
 * the simplest scenarios that can be solved directly without further recursive
 * calls.
 * 
 * Define Recursive Case: The recursive case is where the function calls itself
 * with modified parameters. Identify how the problem can be broken down into
 * smaller subproblems that can be solved using the same function.
 * 
 * Trust the Recursion: When working with recursion, it's essential to trust
 * that the recursive calls will work correctly for smaller subproblems. Assume
 * that the recursive call will provide the correct result and focus on solving
 * the current step of the problem.
 * 
 * Trace the Recursion: If you're having trouble understanding how the recursion
 * works, try tracing the function calls on paper for a small input. This can
 * help you visualize how the recursion progresses and how the function is
 * solving the problem step by step.
 * 
 * Handle Edge Cases: Ensure that your function handles any edge cases or
 * invalid inputs appropriately. For example, check for negative values, zero,
 * or any other constraints mentioned in the problem statement.
 * 
 * Test Thoroughly: Test your recursive function with various inputs, including
 * base cases, typical scenarios, and edge cases, to verify its correctness.
 * 
 * Optimize if Possible: After successfully solving the problem using recursion,
 * you can consider optimizing the solution if necessary. Sometimes, recursion
 * may lead to repetitive calculations, and you can use techniques like
 * memoization (caching) to avoid redundant work.
 * 
 * Practice: The more you practice solving recursive problems, the more familiar
 * you'll become with the approach. Start with simple problems and gradually
 * move on to more complex ones.
 */