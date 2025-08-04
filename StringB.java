public class StringB {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Rajesh");
        // System.out.println(sb);
        // // char at index 0
        // System.out.println(sb.charAt(1));

        // // set char at index 2
        // sb.setCharAt(2, 'n');
        // System.out.println(sb);
        // // insert function
        // sb.insert(4, 'S');
        // System.out.println(sb);


        // //Delete function
        // sb.delete(4, 5);
        // System.out.println(sb);
   
   
        //append function
        StringBuilder sb=new StringBuilder('h');
        sb.append('e');
        sb.append("l");
        sb.append('l');
        sb.append("o");
        System.out.println(sb);

        //length function
        System.out.println(sb.length());
    }
}