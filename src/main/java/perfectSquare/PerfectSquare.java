package perfectSquare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerfectSquare {

	public static void main(String[] args) {
		PerfectSquare pf = new PerfectSquare();
		List<Integer> ll =  pf.getPerfectSquare(new int[] {1,33,4,16,9,55,2});
		System.out.println(ll);
	}
	
	public List<Integer> getPerfectSquare(int[] numberArray) {
		if(numberArray == null) {
			return new ArrayList<>();
		}
		List<Integer> intList = new ArrayList<>();
		for (int i : numberArray) {
			double val = Math.sqrt(i);
			if(Math.floor(val) - val == 0) {
				intList.add(i);
			}
		}
		Collections.sort(intList);
		return intList;
	}
	
	
}
