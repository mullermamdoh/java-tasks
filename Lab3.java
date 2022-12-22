
package lab3;


public class Lab3 {

   
    public static void main(String[] args) {
        
        cylider c1 = new cylider(10,5) ;
       // c1.setRedius(5);
        //c1.setHeight(10);
        System.out.println(" area = " + c1.getarea());
        
    }
    
}

class circle {
    private double redius ;
    private String color ;

    public circle() {
    }

    public circle(double redius) {
        this.redius = redius;
    }

    public circle(double redius, String color) {
        this.redius = redius;
        this.color = color;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    } 
    
    public double getRedius() {
        return redius;
    }

      public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public double getarea () {
        return  3.14 * redius*redius;
    }
}

    ///////////////////////////////////////////////////
    
   class cylider extends circle{
    private double height ;

        public cylider() {
        }

        public cylider(double height) {
            this.height = height;
        }

        public cylider(double height, double redius) {
            super(redius);
            this.height = height;
        }


        public cylider(double height, double redius, String color) {
            super(redius, color);
            this.height = height;
        }

        
         public void setHeight(double height) {
            this.height = height;
        } 
         
         
        public double getHeight() {
            return height;
        }

    @Override
    public double getarea() {
      return  super.getarea() * height ;
    }
    
  }
   

   
    
