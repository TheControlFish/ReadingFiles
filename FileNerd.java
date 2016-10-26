import java.util.*;
import java.io.*;
public class FileNerd {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File("C:\\temp_Larry\\NerdData.txt"));
		String []a = new String[1000];
		int maxIndx = -1;
		while(sf.hasNext()){
			maxIndx++;
			a[maxIndx] = sf.nextLine();
		}
		sf.close();
		for (int n = 0; n <= maxIndx; n++){
			if (a[n].substring(0,3).equals("The")){
				System.out.println(a[n]);
			}
		}
	}

}
