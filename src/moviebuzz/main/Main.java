package moviebuzz.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {
	
	
	public static void main(String[] myArgs) {
		
		
		// control the application : central commands- filter
		
		// let us store the args in a file and then read from there.
		
		String filePath = myArgs[0];
		
		
		Scanner argsScanner;
		try {
			argsScanner = new Scanner(new File(filePath));
		
		int argsCount=0;
		
		ArrayList<String> argsList = new ArrayList<String>();
		Iterator<String> argsListIt = argsList.iterator();
		
		while(argsScanner.hasNextLine()){
			argsCount++;
			argsList.add(argsScanner.nextLine());
		}
		
		
		String[] allArgs = new String[argsCount];
		
		for(int i=0;i<argsCount;i++){
			allArgs[i]=argsListIt.next();
		}
		
		String[] args = allArgs.clone();
		
		if (args[0].equals("filter")){
			
			// we try to filter a file with a certain parameter .
			
			String fixedParameterType = args[1];
			
			String fixedParamValue = args[2];
			
			String dataFilePath = args[3];
			
			String outputFilePath = args[4];
			
			if(fixedParameterType.equals(moviebuzz.filter.ParamterType.ACTOR)) {
				
				// we need to filter from the actors list
				
			}
			
		}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
