class Runner
{
    public static void main(String[] args) {
        int x[]={12,3,1,2,345,56,77,8};
        Find f=new Find(x);
        int res[]=f.calc();
        for(int i:res)
        {
            System.out.println(i);
        }

    }
}