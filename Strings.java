import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1st
        
        // System.out.print("Enter tou name :");
        // String name=sc.nextLine();
        // System.out.println("My name is : "+name);


        // 2nd (Concatenation)

        // String fName="Rajesh";
        // String lName="Yadav";
        // String fullName=fName+" "+lName;
        // System.out.println("My Name is : "+fullName.length());

        // //3rd Character print of String
        // for(int i=0;i<fullName.length();i++){
        //     System.out.print(fullName.charAt(i) + " ");
        // }
        // System.out.println();

        // 4th
        String name1="rajesh";
        String name2="yadav";
        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }else
        // System.out.println("Strings are not equal");
        
        //Failed in some cases
        // if(name1==name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }


//>>>>In Java Strings are Objects

        //Example how it failed
        // if(new String("Rajesh")==new String("Rajesh")){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }


        // 5th
        // String name="Rajesh Yadav";
        // String sentence=name.substring(7,name.length());
        String name="RanjitYadav";
        String sentence=name.substring(6);
        System.out.println(sentence);
    }
}