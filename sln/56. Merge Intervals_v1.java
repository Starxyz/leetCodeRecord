/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Map<Integer, Integer> map = new TreeMap<>();// auto sorted
        for (Interval itl : intervals) {
            map.put(itl.start, map.getOrDefault(itl.start, 0) + 1);
            map.put(itl.end, map.getOrDefault(itl.end, 0) - 1);
        }
        List<Interval> list = new LinkedList<>();
        int start = 0;
        int cnt = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (cnt == 0) start = e.getKey();
            cnt += e.getValue();
            if (cnt == 0) list.add(new Interval(start, e.getKey()));
        }
        
        return list;
    }
}