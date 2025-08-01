public class PrintNumberCountString {
    public static void main(String[] args) {
        String str = "d2a3bac5z".toLowerCase();
        String ans = "";
        int index = 0;

        while(index < str.length()-1){
            char firstCh = str.charAt(index);
            char secondCh = str.charAt(index+1);
             
            if((firstCh >= '1' && firstCh <= '9') && (secondCh >= 'a' && secondCh <= 'z')){
                for(int i = 0; i < Integer.parseInt(firstCh + "");i++){
                    ans += secondCh;
                }
                index+=2;
            }
            else{
                ans += firstCh;
                index++;
            }
        }

        System.out.println("Ans is "+ans);
    }
}
