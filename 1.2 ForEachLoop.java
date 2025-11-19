class ForEachLoop {
    public static void main(String[] args) {
        String [] array =new String[]{
                "Ram","Shyam","Sohan","Mohan","Shita","Gita"
        };
        //printArray(array);
        printArrayforEach(array);
    }
    public static void printArrayforEach (String [] array){
        for(String name: array){
            System.out.println(name);
        }
    }
    public static void printArray (String [] array){
        for( int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
