import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] list = {10,84,97,58,17,28,51,64,24,3};
		int min,tmp = 0;

		System.out.println("before:" + Arrays.toString(list));

		for(int i = 0; i < list.length - 1;i++) {
			min = i;
			for(int j = i + 1;j < list.length;j++) {
				if(list[min] > list[j]) {
					min = j;
				}
			}
			tmp = list[i];
			list[i] = list[min];
			list[min] = tmp;
		}

		System.out.println("after:" + Arrays.toString(list));
	}

}
