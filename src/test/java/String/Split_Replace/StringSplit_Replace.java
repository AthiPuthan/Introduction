package String.Split_Replace;

public class StringSplit_Replace {

	
		public static void main(String[] args) {
	        String inputString = "LNH.DRE.SER";
	        String[] parts = inputString.split("\\."); // Split the input string using the period (.) as the delimiter
	        StringBuilder outputBuilder = new StringBuilder();

	        for (String part : parts) {
	            String transformedPart = transformPart(part);
	            outputBuilder.append(transformedPart).append('.');
	        }

	        // Remove the trailing period
	        outputBuilder.deleteCharAt(outputBuilder.length() - 1);

	        String outputString = outputBuilder.toString();
	        System.out.println("Output String: " + outputString);
	    }

	    // Function to transform a single part
	    private static String transformPart(String part) {
	        // Replace your transformation logic here
	        // For example, you can map each input part to its corresponding transformed value
	        // This is a simple example, you can define your own mapping
	        switch (part) {
	            case "LNH":
	                return "GTYU";
	            case "DRE":
	                return "TRE";
	            case "SER":
	                return "JUIO";
	            default:
	                return part; // If no transformation is defined, keep the original value
	        }
	    }
	}
	






