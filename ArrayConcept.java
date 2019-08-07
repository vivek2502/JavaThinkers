                                    //01-1-D ARRAY DECLARATION,CREATION AND INITIALISATION
/*package arrayconcept;

import java.util.Scanner;


public class ArrayConcept 
{

    public static void main(String[] args)
    {
         int[] arr;//here is array declaration
                   //from this line a object reference is created of 4 byte on 32 bit system 
                   //it recommended that name is clearly seprated  from type
    // arr=new int[]; error here we can not left array dimension empty otherwise it will shows compilation time error 
        
         arr=new int [5];// array creation in heap because they are object                 
                         //Whenever new is used in java, it gives default value 0 to the object formed it itwill be int 
         System.out.println(arr.getClass().getName());//method to display class name
         arr[0]=1; //array initialisation      
         arr[1]=1;
         arr[2]=1;
         arr[3]=1;
         arr[4]=1;
       //  arr[5]=2;//RE
       //  arr[-5]=2;//RE
      // arr[2.5]=3;CE jvm only search valid or not valid above all statement are valid whether it is in range or out of range
         for (int i = 0; i <=4; i++) 
             System.out.println("the value of arr["+i+"]: "+arr[i]);
         int[] brr=new int[0];//valid HOW?
        // System.out.println(brr[0]);
        //  int[] crr=new int[-3]; RE:NEGATIVEARRAYSIZEEXCEPTION
        // int[] drr=new int['A']; valid type promotion take place then size will be 65
                              //that is during creation of array the allowed data type are byte,short,char,int
        // int[] err=new int[10L];CE:possible loss of precision
        try
        {
       int[] frr=new int[214748264];//this is the max size allowed in array
                                       // but in my system it will have an error OutOfMemoryError: Java heap space
                                       //this error also came in exception but we cann't handke it bcz this type of 
        }                                   //exception came due to some internal hardware related problem
        catch(OutOfMemoryError ref)
        {
            System.out.println("not sufficient heap size plz increaze ur RAM");
        }
    }
    }
                                               // 02
/*public static void main(String[] args) 
{
int[] arr=new int[5];//here comcept of clubing is also valid
         arr[0]=1;  
         arr[1]=2;
         arr[2]=3;
         arr[3]=4;
         arr[4]=5;
         for (int i = 0; i <=4; i++) 
             System.out.println("the value of arr["+i+"]: "+arr[i]);

}
}
   
                                                //03
public static void main(String[] args) 
    {
        int[] arr=new int []{16,17,18,19,20}; 
        for (int i = 0; i <=4; i++) 
             System.out.println("the value of arr["+i+"]: "+arr[i]);
    }
    }                                           
   
                                                //04
public static void main(String[] args)
{
    int[] arr={6,7,8,9,10};//in java we can initialise array directly
                            //this facility is only when we make obj refrence and initiliser simultaneously
    for (int i = 0; i <=4; i++) 
             System.out.println("the value of arr["+i+"]: "+arr[i]);
        }
}
                                               //05
public static void main(String[] args) {
        int [] arr;
     // arr={11.12.13.14.15}; error if we break the line of creation of obj ref and initialiser
        arr=new int []{11,12,13,14,15};
        for (int i = 0; i <=4; i++) 
             System.out.println("the value of arr["+i+"]: "+arr[i]);
}
    }*/

                                               //06
    
/*public static void main(String[] args) 
{  
        Scanner kb=new Scanner(System.in);
     // int n,[] arr; error
      //int[] arr,n; here two array will be created
        int n,arr[];
        System.out.println("enter the no");
        n=kb.nextInt();
        arr=new int[n];//Size of array can be set by variable which was not allowed either in C and C++.  
                       //If the size is given negative then NegativeArraySize Exception occurs.
         System.out.println(arr);
         arr[0]=21;  
         arr[1]=22;
         arr[2]=23;
         arr[3]=24;
         arr[4]=25;
         
        // for (int i:arr) this can be also done through enhance for loop its only for array and collection
        //for(int i=0;i<=n;i++)  it gives exception on index 9 because at run time we want to print the value of index n
                            //which we had never initialise yes we can say that we had also didnt initialise value greater than 
                            //index 4 or smaller than index n but it can be already initialise by the compiler by 0
        for(int i:arr)
                 System.out.println("the value of arr["+i+"]: "+i);
}
}*/
                                                     