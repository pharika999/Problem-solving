class Search_in_a_rotated_array {
    public int search(int[] a, int k)
    {
        int l=0,n=a.length,h=n-1;
        int d=bsd(a,l,h);
        int x=bs(a,0,d-1,k);
        int y=bs(a,d,h,k);
        if(x==-1&&y==-1)
            return -1;
        else
        {
            if(x!=-1)
                return x;
            return y;
        }
    }
    int bsd(int a[],int l,int h)
    {
        int x=0;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]>=a[0])
                l=m+1;
            else
            {
                x=m;
                h=m-1;
            }
        }
        return x;
    }
    int bs(int a[],int l,int h,int k)
    {
        while(l<=h)
        {
            int m=(l+h)/2;
            if(a[m]==k)
                return m;
            if(a[m]<k)
                l=m+1;
            else
                h=m-1;
        }
        return -1;
    }
}