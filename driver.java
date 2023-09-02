public class driver
{
    public static void main(String[] args)
    {
        Salesman[] totalSales;
    
        Salesman Johnny = new Salesman("Johnny", 43500);
        Salesman Abby = new Salesman("Abby", 50000);
        Salesman Miller = new Salesman("Miller", 41900);
        Salesman Jacob = new Salesman("Jacob", 19500);
        Salesman Tim = new Salesman("Tim", 90000);
        Salesman Luke = new Salesman("Luke", 51000);
        Salesman Litty = new Salesman("Litty", 8000);
        Salesman Scooby = new Salesman("Scooby", 44000);
        
        totalSales = new Salesman[] {Johnny, Abby, Miller, Jacob, Tim, Luke, Litty, Scooby};
        System.out.println(topFiveSalesman(totalSales));
        
    }
    
    /*algorithm plan: sort the entire list first from smallest to largest
    and then drop the first elements until the new array is size 5 */
    
    public static Salesman[] topFiveSalesman(Salesman[] list)
    {
        Salesman[] topFive = new Salesman[5];
        
        int countTracker = 0;
        int current = 1;
        String tempName;
        float tempSales;
        
        for(int i = 0; i < 12; i++)
        {
            if(countTracker < 5) //fills the topFive array with the first five elements in the original array
            {
                topFive[countTracker] = list[i];
                System.out.println(topFive[countTracker].name);
                countTracker++;
            } else
            {
                for(int j = 0; j < topFive.length; j++) 
                {
                    if(topFive[j].sales > topFive[current].sales) /*switches elements if the first is greater 
                    than the second*/
                    {
                        tempSales = topFive[current].sales;
                        tempName = topFive[current].name;
                        
                        System.out.println(topFive[current].name + ": " + topFive[current].sales);
                        
                        topFive[current].sales = topFive[j].sales;
                        topFive[current].name = topFive[j].name;
                        
                        topFive[j].sales = tempSales;
                        topFive[j].name = tempName;
                    }
                    current++;
        
                }
            }
            
            
            
        
        }
        return topFive;
    }
    
    
	
}
