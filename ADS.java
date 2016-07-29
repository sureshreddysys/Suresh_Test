package ExamplePackage;
import java.util.*;

class ShoppingList
{
	private int n=7,i=0,j=0,temp,priority1;
	private String[] item  = new String[n];
    private int priority[]=new int[n];
    private double cost[]=new double[n];
    private String name1;
    private double cost1,sum;

    void sortPriority()
    {
    	
       	for (i = 0; i < n; i++)
       	{
        	for (j = 1; j<(n-i); j++) 
        	{
	            if (priority[j-1] > priority[j]) 
	            {
                	temp= priority[j-1];
                    priority[j-1]= priority[j];
                    priority[j]=temp;

                    name1= item[j-1];
                    item[j-1]= item[j];
                    item[j] = name1;

                    cost1= cost[j-1];
                    cost[j-1]= cost[j];
                    cost[j] = cost1;
           		 }

        	}
    	}
    }
    void purchase()
    {
    	sum=0;
    	for(i=0;i<n;i++)
    	{
    		if(sum<59)
    		{
    			sum=sum+cost[i];
    		}
    		else
    			break;
    	}
    	System.out.println("Sum of the items Less than 59 Based On priority");
    	System.out.println("Item Name \t\t Cost \t\t Priority");
    	for(j=0;j<(i-1);j++)
    	{
    		System.out.println("\t"+item[j]+"\t \t"+cost[j]+"\t \t"+priority[j]);
    	}

    }
    
    void setData()
    {
    	Scanner sc= new Scanner(System.in);
    	outer: 
    	for (i=0; i<n;i++)  
        {

           System.out.println("Enter item name " + i);
           name1 = sc.next();

           System.out.println("Enter the price of item " + i);
           cost1 = sc.nextDouble();

           System.out.println("Enter Priority Number " + i);
           priority1 = sc.nextInt();

           for (j=0; j<i;j++)
           	if(name1.equals(item[j]))
           		{
           			i--;
           			System.out.println("The name already Exists");
           			continue outer;
           		}

           item[i]=name1;
           priority[i]=priority1;
           cost[i]=cost1;

           sum=0;
           if(i==6)
		   {
           	for(j=0;j<7;j++)
           		sum=sum+cost[j];
           	if(sum<100)
           	{
           		System.out.println("The sum of the items is less than 100");
           		i=-1;
           	}
           	
           }
       }
    }
    void getData()
    {
    	System.out.println("All the Items");
    	System.out.println("Item Name \t\t Cost \t\t Priority");
    	for(i=0;i<n;i++)
    	{
    		System.out.println(item[i]+"\t \t"+cost[i]+"\t \t"+priority[i]);
    	}
    }
   public static void main(String[] args) 
   {
    
       ShoppingList s=new ShoppingList();
       s.setData();
       s.sortPriority();
       s.getData();
       s.purchase();
    }
   
}


}
