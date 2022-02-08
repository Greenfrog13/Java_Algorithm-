// 버블 정렬 (버전 2)
static void bubbleSort(int[] a, int n) {
	for (int i=0;i<n-1;i++) {
		int exchg = 0; // 패스의 교환 횟수를 기록합니다.
		for (int j=n-1;j>i;j--)
			if (a[j-1] > a[j]) {
				swap(a, j-1, j);
				exchg++;
			}
		if (exchg == 0) break; // 교환이 이루어지지 않으면 종료합니다. 
	}
}
