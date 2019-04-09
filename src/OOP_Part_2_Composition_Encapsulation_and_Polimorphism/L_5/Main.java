package OOP_Part_2_Composition_Encapsulation_and_Polimorphism.L_5;

public class Main {

    public static void main(String[] args) {
       for(int i =0;i< 11; i++){
         Movie movie = randommovie();

           System.out.println("Movie #"+ i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot()  );
       }
    }

    public static Movie randommovie(){
        int randomnumber  = (int) (Math.random()* 5)+ 1;
        System.out.println("Random number generated was: " + randomnumber);
        switch(randomnumber){
            case 1:
              return new Jaws();

            case 2:
             return new IndependenceDay();

             case 3:
                 return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();


        }

      return null;
    }


}
