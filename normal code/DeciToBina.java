class DecitoBina
{
	public static void main(String[] args) {
		int dec=10,ind=0;
		int bi[]=new int[40];
		while(dec>0)
		{
			bi[ind++]=dec%2;
			dec=dec/2;
		}
		for (int i=ind-1; i>=0; i--) {
			System.out.println(bi[i]);
		}
		System.out.println();
	}
}