class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int a1 = Integer.parseInt(arriveAlice.substring( 0, 2));
        int a2 = Integer.parseInt(arriveAlice.substring(3));
        int a3 = Integer.parseInt(leaveAlice.substring( 0, 2));
        int a4 = Integer.parseInt(leaveAlice.substring(3));

        int b1 = Integer.parseInt(arriveBob.substring( 0, 2));
        int b2 = Integer.parseInt(arriveBob.substring(3));
        int b3 = Integer.parseInt(leaveBob.substring( 0, 2));
        int b4 = Integer.parseInt(leaveBob.substring(3));

        int aliceArrive = a2;
        for(int i = 0; i<a1-1; i++){
            aliceArrive+=days[i];
        }
        int aliceLeave = a4;
        for(int i = 0; i<a3-1; i++){
            aliceLeave+=days[i];
        }

        int bobArrive = b2;
        for(int i = 0; i<b1-1; i++){
            bobArrive+=days[i];
        }
        int bobLeave = b4;
        for(int i = 0; i<b3-1; i++){
            bobLeave+=days[i];
        }

        int start = Math.max(aliceArrive, bobArrive);
        int end = Math.min(aliceLeave, bobLeave);

        return Math.max(0, end-start+1);

    }
}