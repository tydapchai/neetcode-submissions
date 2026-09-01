#include <vector>
#include <string>
#include <unordered_map>

using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> anagramMap;
        
        for (const string& s : strs) {
            // Tạo chuỗi 26 ký tự null, mỗi vị trí đại diện cho đếm số lượng của 1 chữ cái
            string key(26, 0); 
            for (char c : s) {
                key[c - 'a']++;
            }
            anagramMap[key].push_back(s);
        }
        
        vector<vector<string>> result;
        for (auto& pair : anagramMap) {
            result.push_back(move(pair.second)); // move() để tiết kiệm chi phí copy
        }
        
        return result;
    }
};