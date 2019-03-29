package ControlFlowStatments.CodingExercises;

public class GreatestCommonDevisor {

public static int getGreatestCommonDivisor(int first, int second){
    if((first < 10) || (second < 10)){
        return -1;
    }
    int larger;

    if(second > first){
     larger = second;
    }
    else{
       larger = first;
    }
    int Devisor =0;
    for(int i =1; i <= larger; i++){
      if((first % i ==0) && (second % i ==0)){
         Devisor =i;
      }
    }


    return Devisor ;
}

}
