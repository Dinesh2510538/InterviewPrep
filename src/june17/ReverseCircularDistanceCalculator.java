package june17;

public class ReverseCircularDistanceCalculator {

    public static void main(String[] args) {
        int numOfStops=8;
        int pathDistance[]={800,600,750,900,1400,1200,1100,1500};
        String[] busStops={"A","B","C","D","E","F","G","H"};

        int startPos=0;
        int endPos=0;
        String startLocation="F";
        String endLocation="D";



        for (int i = 0; i < busStops.length ; i++) {
            if (busStops[i]==(startLocation)){
                startPos=i;
            }

            if (busStops[i]==endLocation){
                endPos=i;
            }
        }
        
        
        boolean  notCompleted=true;
        int sum=0;
        while (notCompleted){
        if(startPos>endPos) {
            if (startPos < numOfStops) {
                sum += pathDistance[startPos];
            }
            else if (startPos>=numOfStops) {
                if (startPos % numOfStops < endPos) {
                    sum += pathDistance[startPos % numOfStops];
                } else {
                    notCompleted = false;
                }
            }
        }
        else if (startPos<endPos) {
            sum+=pathDistance[startPos];
        }
        else{
            notCompleted=false;
        }
           startPos++;
        }
        
        double cost=(5.0/1000.0)*sum;
        System.out.println(Math.ceil(cost));

        boolean reverseNotCompleted = true;
        int reverseSum = 0;
        int reversePos = startPos;
        while (reverseNotCompleted) {
            if (reversePos > endPos) {
                if (reversePos < numOfStops) {
                    reverseSum += pathDistance[reversePos];
                }

            } else if (reversePos <= numOfStops) {
                if (reversePos % numOfStops > endPos) {
                    reverseSum += pathDistance[reversePos % numOfStops];
                } else {
                    reverseNotCompleted = false;
                }
            }
            else if (reversePos < endPos) {
//                startpos to end pos
                reverseSum += pathDistance[reversePos];
            }
            else {
                reverseNotCompleted = false;
            }
            reversePos--;


        }
        double reverseCost=(5.0/1000.0)*reverseSum;
        System.out.println(Math.ceil(reverseCost));
        }
    }

