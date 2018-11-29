/*347. Top K Frequent Elements
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/

class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> freq;// <num, frequence>
        for (int num : nums) {
            freq[num]++;
        }// end for
        
        vector<int> res;
        priority_queue< pair<int, int> > pq;// <frequence, num>
        for (auto iter = freq.begin(); iter != freq.end(); iter++) {
            pq.push(make_pair(iter->second, iter->first));
            if (pq.size() > freq.size() - k) {//remember we don't need to sort
                res.push_back(pq.top().second);
                pq.pop();
            }// end if
        }// end for
        
        return res;
    }
};