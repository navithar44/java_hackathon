package javahackathon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class writetofile1 {
public static void main(String[] args) throws Exception 
{
		// TODO Auto-generated method stub
		 //Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
		

//String userDir=System.getProperty("user.dir") ;
	String filepath="/Users/apple/testingworkspace/navithatest/Files/Readfile.txt";
	
	// read the file 
	//String inputFile="/Users/apple/testingworkspace/navithatest/Files/Readfile.txt";
//System.out.println(inputFile);
String filepath1="/Users/apple/testingworkspace/navithatest/Files/writing.txt";
//System.out.println(outputFile);
//Read the file contents and reverse it
 List<String> lines = readFile(filepath);
		Collections.reverse(lines);
		//write the reversed content to a new file
		  writeFile(filepath1,lines);
		  }
		  private static List<String> readFile(String filepath) {
		  List<String> lines= new ArrayList<>();
		  try
		  {
		  BufferedReader reader=new BufferedReader(new FileReader(filepath));
		  {
		  String line;
		  while((line= reader.readLine()) !=null) {
		  lines.add(line);
		  }
		  }}
		  catch(IOException e)
		  {
			  e.printStackTrace();
		  }
		  return lines;
		  }
		  private static void writeFile(String filepath1,List<String> lines) {
			
			  try
			  {
			  BufferedWriter Writer=new BufferedWriter(new FileWriter(filepath1));
			  {
			  for(String line: lines) {
				  if (line.equals(".")) {
	                    Writer.write("\n");
	                } else {
	                    Writer.write(line + "\n");
	                }}
				
			  }
			  System.out.println("Content reversed and written to file" );
			  Writer.close();
			  
			  }
			  catch(IOException e)
			  {
				  e.printStackTrace();
			  }
			  }
		  }
		  
		  
		  
		 
		 
 

