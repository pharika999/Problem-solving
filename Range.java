class Range {
    public int[] searchRange(int[] a, int k)
    {
        int l=0,n=a.length,h=n-1;
        int ans[]=new int[2];
        int x=bs1(a,l,h,k);
        int y=bs2(a,l,h,k);
        ans[0]=x;
        ans[1]=y;
        return ans;
    }
    int bs1(int a[],int l,int h,int k)
    {
        int ans=-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==k)
            {
                ans=m;
                h=m-1;
            }
            else if(a[m]>k)
                h=m-1;
            else
                l=m+1;
        }
        return ans;
    }
     int bs2(int a[],int l,int h,int k)
    {
        int ans=-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==k)
            {
                ans=m;
                l=m+1;
            }
            else if(a[m]>k)
                h=m-1;
            else
                l=m+1;
        }
        return ans;
    }
}