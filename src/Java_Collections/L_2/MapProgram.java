package Java_Collections.L_2;

import java.util.*;

public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();

        if(languages.containsKey("Java")){
            System.out.println("Java already exist");
        }else{
            languages.put("Java","a  compiled high level object-oriented,platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python","a interpreted , object-oriented, high-level programming language with dynamics semantics");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC","Beginners All Purposes Symbolics Instruction Code ");
        languages.put("Lisp","Therein lies madness");
      if(languages.containsKey("Java")){
          System.out.println("Java is already in the map");
      }else{
         languages.put("Java"," this course is about Java ");

      }

        System.out.println("=================================");
      languages.remove("Lisp");
      if(languages.remove("Algol","a family of algorithmic language")){
          System.out.println("Algol remove");
      }else{
          System.out.println("Algol not removed , key/value pair not found");
      }

        System.out.println(languages.replace("Lisp"," a functional programming language "));
        System.out.println(languages.replace("Scala","this will not be added "));

        if(languages.replace("Lisp","This is not work "," a functional programming language")){
            System.out.println("Lisp updated");
        }else{
            System.out.println("Lisp was not replaced ");
        }


      for(String key : languages.keySet()){
          System.out.println(key + ": " +   languages.get(key));
      }
      }


    }



