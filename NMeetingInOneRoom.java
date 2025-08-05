import java.util.Arrays;

//same question leetcode non overlaping intervals 435
public class NMeetingInOneRoom {
    public static void main(String[] args) {
        int start[] = {0,3,1,5,5,8};
        int end[] = {5,4,2,9,7,9};
        Meeting meetings[] = new Meeting[start.length];
        int totalMeetings = 1; 
        int freeTime;

        for(int i = 0; i < start.length;i++){
            meetings[i] = new Meeting(start[i], end[i], i+1);
        }
        
        for(int i = 0; i < start.length;i++){
            System.out.println(meetings[i].start + " "+ meetings[i].end + " " + meetings[i].meetingNum);
        }

        Arrays.sort(meetings, (m1, m2) -> m1.end - m2.end);
        System.out.println("Sorted : ");
        for(int i = 0; i < start.length;i++){
            System.out.println(meetings[i].start + " "+ meetings[i].end + " " + meetings[i].meetingNum);
        }

        freeTime = meetings[0].end;

        for(int i = 1;i<meetings.length;i++){
            if(meetings[i].start > freeTime){
                totalMeetings++;
                freeTime = meetings[i].end;
            }
        }
        System.out.println("Total "+totalMeetings+" Can Happen!");
    
    }
}

class Meeting{
    int start;
    int end;
    int meetingNum;
    Meeting(int start,int end, int meetingNum){
        this.start = start;
        this.end = end;
        this.meetingNum = meetingNum;
    }
}
