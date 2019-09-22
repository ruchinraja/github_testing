class my{
	public void display(int a,int b){
		System.out.println(a-b);
	}
}
class test_sub{
	public static void main(String args[]){
		my o=new my();
		o.display(10,2);
	}
}