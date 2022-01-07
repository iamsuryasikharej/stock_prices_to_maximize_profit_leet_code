public class Find {
    int [] stock_prices;
    Find(int[] stock_prices)
    {
        this.stock_prices=stock_prices;
    }

    public int[] calc()
    {
        int x[]=new int[2];
        int profit=0;
        for(int i=0;i<stock_prices.length-1;i++)
        {

            int j;
            for(j=i+1;j<stock_prices.length;j++)
            {
                int diff=stock_prices[j]-stock_prices[i];
                if(diff>profit)
                {
                    profit=diff;
                    x[0]=stock_prices[i];
                    x[1]=stock_prices[j];

                }
            }
        }
        System.out.println(profit);
        return x;
    }
}
