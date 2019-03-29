package ControlFlowStatments.CodingExercises;

public class FlourPackProblem {

public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int kilos = bigCount * 5;
        int total = kilos + smallCount;

        if (kilos == goal || (kilos % goal == 0 && kilos != 0)){
            return true;
        } else if (smallCount >= goal || total == goal){
            return true;
        } else if (kilos > goal){
            int howManyBigCountsGoIntoGoal = goal / 5;
            int remaining = goal - (howManyBigCountsGoIntoGoal * 5);
            return smallCount >= remaining;
        } else if (total >= goal){
            return true;
        } else {
            return false;
        }
    }


}



