import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PopularityOfNames {
	
	public static void readFromFile(String path, String name) throws FileNotFoundException {
		
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("File not found");
			return;
		}
		
		Scanner scan = new Scanner(file);
		String lineAfterName = null;
		
		while(scan.hasNext()) {
			
			String checkName = scan.next();
			checkName = checkName.toUpperCase();
			
			if(checkName.equals(name)) {
				lineAfterName = scan.nextLine();
				break;
			}
			
		}
		
		toPrint(lineAfterName);
		
		scan.close();
	}
	
	
	public static void toPrint(String line) {
		
		
		String[] arr = line.split(" ");
		
		int years = 1900;
		
		for(int i = 0; i < arr.length; i++) {
			if(!(arr[i].isBlank())) {
				
				System.out.println(years + ": " + arr[i]);
				years += 10;
				
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("This program allows you to search through the data from the Social Security Administration\r\n"
				+ "to see how popular a particular name has been\r\n"
				+ "since 1900.\r\n"
				+ "Enter the name: ");
		String name = sc.next();
		name = name.toUpperCase();
		
		readFromFile("babyNames.txt", name);
		
		
		
		
		sc.close();
	}
	
}
