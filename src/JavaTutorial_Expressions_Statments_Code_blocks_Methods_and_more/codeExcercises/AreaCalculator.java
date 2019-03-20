package JavaTutorial_Expressions_Statments_Code_blocks_Methods_and_more.codeExcercises;

    public class AreaCalculator {


        public static double area(double radius){

          if(radius < 0){
             return -1.0;
          }

          return  radius * radius * Math.PI;
        }

        public static  double area(double x, double y){
            if( (x < 0) || (y < 0) ){
               return -1.0;
            }
            return x *y;
        }

    }
