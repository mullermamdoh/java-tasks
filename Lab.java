
package lab;




public class Lab {

   
    public static void main (String[]args){

        cartoon[] obj;
        obj = new  cartoon[4];
        
       
         
        for ( int i = 0 ; i<4 ; i++)
        {  obj[i].setname("a" + i);
           obj[i].setauthor("b" + i);
           obj[i].setprice(i);
        }
        for ( int i = 0 ; i<1 ; i++)
        {  
           obj[i].getprice();
           obj[i].getauthor();
           obj[i].getname();
        }
    }
    
}
/////////////////////////////////////////////////

 interface product {
  
   
    public void setprice(double price) ;
    public void setname (String name) ;
     public void setauthor (String author) ;
    public void getprice();
    public void getname();
    public void getauthor();
 }

//////////////////////////////////////////////////

 class book implements product {
     double price ;
     String name ;
     String author;
   
        public book() {
        }

    public book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public book(double price, String name, String author) {
        this.price = price;
        this.name = name;
        this.author = author;
    }
    
    
     @Override
      public void setname(String name) {
            this.name= name ;
        }
     @Override
        public void getname() {
            System.out.println("name : "+ name);
             
        }
        
     @Override
      public void setprice(double price) {
            this.price= price ;
        }
      
     @Override
        public void getprice() {
            System.out.println("price : "+ price);
     
        }
        
         @Override
      public void setauthor(String author) {
            this.author= author ;
        }
     @Override
        public void getauthor() {
            System.out.println("author : "+ author);
             
        }

       

 }


////////////////////////////////////////////////////

class cartoon extends book{

    public cartoon() {
    }
    

    }
    
    
    
     
    
    




