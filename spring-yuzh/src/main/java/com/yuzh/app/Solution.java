package com.yuzh.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<List<String>> aab = new Solution().partition("aab");
		System.out.println(aab);
	}
	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<>();

		int n = s.length();
		//dp[i][j] 表示字符串从 i 到 j ，是否是回文串
		boolean[][] dp = new boolean[n][n];
		for (boolean[] booleans : dp) {
			Arrays.fill(booleans, true);
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
			}
		}

		dfs(res,new ArrayList<>(),dp,0,s);

		return res;
	}

	public void dfs(List<List<String>> res ,List<String> path ,boolean[][] dp ,int index,String str){
		if (index == str.length()){
			res.add(new ArrayList<>(path));
			return;
		}
		for (int i = index; i <  str.length(); i++) {
			if (dp[index][i]){
				path.add(str.substring(index,i));
				dfs(res, path, dp, i , str);
				path.remove(path.size()-1);
			}
		}
	}

}
