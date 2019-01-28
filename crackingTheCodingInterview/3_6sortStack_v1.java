import java.util.*;

public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (int val : numbers) {
            s1.push(val);
        }
        while (!s1.isEmpty()) {
            int tmp = s1.pop();
            while (!s2.isEmpty() && s2.peek() > tmp) {
                s1.push(s2.pop());
            }
            s2.push(tmp);
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!s2.isEmpty())
            res.add(s2.pop());
        
        return res;
    }
}