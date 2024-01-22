package array.program;

	class Sample
	{
	int a,b;
	static int count;
	Sample(){
	a=0; b=0;
	}
	Sample(int x, int y){
	a=x; b=y;
	}
	{
	count++;
	}
	}
	class SampleApp{
	public static void main(String[] args)
	{
	Sample s1 = new Sample();
	Sample s11 = new Sample();
	Sample s2 = new Sample(20,40);
	System.out.println("No. of objects created are: "+Sample.count);
	}
	}
	

