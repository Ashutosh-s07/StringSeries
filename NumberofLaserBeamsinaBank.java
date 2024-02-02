import java.util.Arrays;

public class NumberofLaserBeamsinaBank {
    public static int numberOfBeams(String[] bank) {
        int result = 0;
        int ind = 0;
        int[] count_beam = new int[bank.length];
        for(String s:bank){
            result = 0;
            for( int i=0;i<s.length();i++){
                if(s.charAt(i)=='1') result++;
            }
            count_beam[ind++]=result;
        }

        int count = count_beam[0], prev_count = 0, beam_sum = 0;
        for( int i=0;i<count_beam.length;i++){
            if( count_beam[i] != 0){
                count = count_beam[i];
                beam_sum += prev_count*count;
                prev_count = count;
            }
        }
        // System.out.println(Arrays.toString(count_beam));
        return beam_sum; 
    }
    public static void main(String[] args) {
        String[] bank = {"000","111","000"};
        System.out.println(numberOfBeams(bank));
    }
}
