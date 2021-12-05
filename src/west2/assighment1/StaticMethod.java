package west2.assighment1;

public class StaticMethod {

    public static double AverGrade(int[]scores){
        double sum=0;
        for (int s:scores
             ) {
            sum+=s;
        }
        return sum/scores.length;
    }
    public static int highestScore(int[]scores){
        int h=0;
        int index=0;
        for (int i = 0; i < scores.length; i++) {
            if (h<scores[i]){
                h=scores[i];
                index=i;

            }
        }
        return index;
    }
}
