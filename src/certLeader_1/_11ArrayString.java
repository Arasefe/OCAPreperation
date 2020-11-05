package certLeader_1;

public class _11ArrayString {
    public static void main(String[] args) {
        String[]strs={"A","B"};
        int idx=0;
        for(String s:strs){
            strs[idx]=strs[idx].concat(" element "+idx);
            //System.out.println(strs[idx]);
            idx++;

        }
        for (idx = 0;idx<strs.length ;idx ++) {
            System.out.print(strs[idx]);
        }


    }
}
