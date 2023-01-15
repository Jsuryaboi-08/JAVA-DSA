public class Syntax {
    public static void main(String[] args) {
        /*
        an array is used to store a collection of data types.
        syntax for a array :
        datatype[] variable_name = new datatype[size]
         */
        //q: store 5 roll nos:
        int[] rnos = new int[5];
        ///or directly:
        int[] rnos2 = {1, 2, 3, 4, 5};
        // whatever is declared as the datatype should only be stored inside
        // all the data types entered must be same.
        // data type is predefined
        String[] arr = new String[4];
        System.out.println(arr[0]);// gives null as output

        /* null can be assigned only to non-primitive data types.

         */
        String str = null;// this is fine because it is a non-primitive data type
        //int num  = null; -> this line gives an error
        


    }
}
