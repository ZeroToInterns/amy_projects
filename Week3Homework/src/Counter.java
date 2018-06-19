import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter
{
    private File inputFile;
    
    public Counter(File inputFile)
    {
        this.inputFile = inputFile;
    }
    
    public int countLines()
    {
    	int count = 0;
    	try {
    		Scanner scan = new Scanner(inputFile);
    		while (scan.hasNextLine()) {
    			scan.nextLine();
        		count++;
        	}
        	scan.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("File was not found");
    		e.getStackTrace();
    	}
        return count;
    }

    public int countWords()
    {
    	int count = 0;
    	try {
    		Scanner scan = new Scanner(inputFile);
    		while (scan.hasNext()) {
    			scan.next();
    			count++;
    		}
        scan.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("File was not found");
    		e.getStackTrace();
    	}
        return count;
    }

    public int countChars()
    {
    	int count = 0;
    	try {
    		Scanner scan = new Scanner(inputFile);
    		while (scan.hasNextLine()) {
    			String line = scan.nextLine();
    			count += line.length();
    		}

        scan.close();
    	}
    	catch (FileNotFoundException e) {
    		System.out.println("File was not found");
    		e.getStackTrace();
    	}
        return count;
    }
}