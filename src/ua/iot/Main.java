package ua.iot;

public class Main{

		public static void main(String[] args) {
			Notebook notebook1=new Notebook();
			Notebook notebook2=new Notebook("white",250,170);
			Notebook notebook3=new Notebook("blue",100,78,2021,"leather","A4");
	        System.out.println(notebook1);
	        System.out.println();
	        System.out.println(notebook2);
	        System.out.println();
	        System.out.println(notebook3);
	        System.out.println();

	}

}
