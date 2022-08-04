
public class ProcessaTabuada {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; ++i ) {
			System.out.printf("Tabuada de %d:\n", i);
			for(int j = 0; j <= 10; ++j) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.printf("\n");
		}

	}

}
