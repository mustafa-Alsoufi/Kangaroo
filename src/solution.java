import java.util.Scanner;

public class solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

    }

	private static String kangaroo(int x1, int v1, int x2, int v2) {
		int k1=0,k2=0;
		String result="N";
		
		k1 = k1 + v1 + x1;
		k2 = k2 + v2 + x2;
		if (v1 < v2 && x1 < x2)
		{
			result = "NO";
		}
		for (int i=0;i<10000;i++)
		{
			if (k1==k2)
			{
				result="YES";
				break;
			}
			
			k1 = k1 + v1;
			k2 = k2 + v2;
		}
		return result;
	}

}
