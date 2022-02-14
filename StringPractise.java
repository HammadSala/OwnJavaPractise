/**
String Practise
maximum occurring character in a given String
 */
class StringPractise{
    public static void main(String[] args){
        /**
        char array
        count to store most used variable and its value
        length not null
        element(i)-> check for each , if there is increment the count and remove that elemen and update string variable */

        String string1 = "Am a good boy";
        String s1;
        int count;

        for(int i = string1.length(); i>0; i--)
        {
            System.out.printf("%d %t --> %s", i, string1[i]);
        }
    }
    
}