import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] list = {120,85,75,93,25,35};
		int tmp = 0;

		System.out.println("before:" + Arrays.toString(list));

		for (int i = 0;i < list.length;i++) {
			for(int j = list.length-1;j > i;j--) {
				if(list[j] < list[j - 1]) {
					tmp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = tmp;
				}
			}
		}

		System.out.println("after:" + Arrays.toString(list));
	}

}
