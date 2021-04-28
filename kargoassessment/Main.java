package kargoassessment;

public class Main {
    public static void main(String[] args) {
        //create array and display 
        int[] array = {2, 25, 209};
        for(int x: array){
            System.out.print(x + " ");
        }
     
        //call method to convert to String
        String[] numStrings = convertToString(array);
        
        //display numbers once converted 
        System.out.println();
        System.out.print(String.join(", ", numStrings));
    }

    public static String[] convertToString(int[] array){
        //create a String[] 
        String[] numStrings = new String[array.length];
        String str;
        StringBuilder strBuilder;
        
        //loop through array 
        for(int j = 0; j < array.length; j++){
            str = String.valueOf(array[j]);
            strBuilder = new StringBuilder();
            
            //for each character in string convert number
            //to its string foramt
            for(int i = 0; i < str.length(); i++){
                switch(str.charAt(i)){
                    case '0':
                        strBuilder.append("Zero");
                        break;
                    case '1':
                        strBuilder.append("One");
                        break;
                    case '2':
                        strBuilder.append("Two");
                        break;
                    case '3':
                        strBuilder.append("Three");
                        break;    
                    case '4':
                        strBuilder.append("Four");
                        break;
                    case '5':
                        strBuilder.append("Five");
                        break;
                    case '6':
                        strBuilder.append("Six");
                        break;
                    case '7':
                        strBuilder.append("Seven");
                        break;
                    case '8':
                        strBuilder.append("Eight");
                        break;
                    case '9':
                        strBuilder.append("Nine");
                        break;
                }
            }
            //add the numbers as as strings to String array
            numStrings[j] = strBuilder.toString();
        } 
        return numStrings;
    }
}
