import java.util.Scanner;  
import java.util.Arrays;
  
public class Main{
    public static void main(String[] args){
    	final int inf = 101;
    	Scanner input = new Scanner(System.in);
    	int[] num = new int[100];
    	int count = 0;
    	while(true){
    		int temp = input.nextInt();
    		if(temp == 0)
    			break;
    		num[count] = temp;
    		++count;
    	}
    	Arrays.sort(num,0,count);
    	int time = 0;
    	for(int i = 0; i < count; ++i){
    		if(num[i] != inf){
    			time = 0;
	    		for(int j = 0; j < count; ++j){
	    			if(num[i] == num[j]){
	    				++time;
	    				if(i != j)
	    					num[j] = inf;
	    			}
	    		}
	    		System.out.println(num[i] + " occurs " + time + (time > 1 ? " times" : " time"));
	    	}
    	}
    }
}
 
4
 
import java.util.Scanner;  
import java.util.Arrays;
  
public class Main{
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int count = input.nextInt();
    	double[] num = new double[count];
    	double sum = 0;
    	for(int i = 0; i < count; ++i){
    		num[i] = input.nextDouble();
    		sum += num[i];
    	}
    	double average = sum/count;
    	
    	int higher = 0;
    	int lower = 0;
    	int equal = 0;
    	for(int i = 0; i < count; ++i){
    		if(num[i] > average)
    			++higher;
    		else if(num[i] == average)
    			++equal;
    		else
    			++lower;
    	}
    	
    	System.out.println(higher + "    " + equal + "    " + lower);
    }
}
