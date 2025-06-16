package june16;

public class CircularDistanceCalculator {
    public static void main(String[] args) {
        int numOfStops=8;
        int pathDistance[]={800,600,750,900,1400,1200,1100,1500};
        String[] busStops={"A","B","C","D","E","F","G","H"};

        int startPos=0;
        int endPos=0;
        String startLocation="F";
        String endLocation="D";

        for(int i=0;i<busStops.length;i++){
            if(busStops[i]==startLocation){
                startPos=i;
            }
            if(busStops[i]==endLocation){
                endPos=i;
            }
        }

        boolean notComplete=true;
        int sum=0;
        while(notComplete){
            if(startPos>endPos){
            if(startPos<numOfStops){
                sum+=pathDistance[startPos];
            }
            else if(startPos>=numOfStops){
                if(startPos%numOfStops<endPos) {
                    sum += pathDistance[startPos % numOfStops];
                }
                else{
                    notComplete=false;
                }
            }
            }
            else if(startPos<endPos){
//                startpos to end pos
                sum+=pathDistance[startPos];
                }
            else{
                notComplete=false;
            }
                        startPos++;
        }

        // Loop until we reach the destination
//        while (startPos != endPos) {
//            sum += pathDistance[startPos];
//            startPos = (startPos + 1) % busStops.length; // Circular route
//        }
        double cost=(5.0/1000.0)*sum;
        System.out.println(Math.ceil(cost));
    }
}
