package ua.iot;
public record Notebook(String color,int pageAmount,int priceInUAH,int publishedYear, String material,String format) {
public static  String country="Ukraine";

public Notebook() {
    this(null,0,0);
}
public Notebook(String color,int pageAmount,int priceInUAH) {
    this(color,pageAmount,priceInUAH,0,null,null);
}
public Notebook(String color,int pageAmount, int priceInUAH,int publishedYear, String material,String format) {
     this.color=color;
     this.pageAmount=pageAmount;
     this.priceInUAH=priceInUAH;
     this.publishedYear=publishedYear;
     this.material=material;
     this.format=format;
}
@Override
public String toString() {
return "Notebook{"
	+"color='" +color+'\''
	+", pageAmount="+pageAmount+" pages "
	+", priceInUAH="+priceInUAH+" UAH "
	+", publishedYear="+publishedYear
	+", material="+material
	+", format="+format
	+'}';
}
public static String displayCountry() {
	return country;
}
}
