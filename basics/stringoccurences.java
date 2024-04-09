package basics;

public class stringoccurences {
	
		    public static void main(String[] args) {
		        String string1 = "I Love Java Programming";
		        String string2 = "o";

		        // Find the indices of 'o'
		        int firstIndex = string1.indexOf(string2);
		        int lastIndex = string1.lastIndexOf(string2);

		        // Check if 'o' exists in the string
		        if (firstIndex != -1 && lastIndex != -1) {
		            // Extract the substring between the 'o's
		            String substring = string1.substring(firstIndex + 1, lastIndex);
		            
		            // Count the number of characters excluding spaces
		            int charCount = 0;
		            for (int i = 0; i < substring.length(); i++) {
		                if (substring.charAt(i) != ' ') {
		                    charCount++;
		                }
		            }
		            
		            System.out.println("Number of characters between the occurrences of 'o': " + charCount);
		        } else {
		            System.out.println("The letter 'o' is not present in the string or occurs only once.");
		        }
		    }
		}