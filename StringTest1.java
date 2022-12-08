package Exercise3;

public class StringTest1 {
    public static void main(String[] args) {
        StringTest1 str1 = new StringTest1();
        String mineStr="abcdabcdfjiabjiabniiaba";
        String subStr="ab";
        int count = str1.getCount(mineStr, subStr);
        System.out.println(count);

    }

    /**
     * 获取subStr在mineStr中出现的次数
     * @param mineStr
     * @param subStr
     * @return
     */
    public int getCount(String mineStr,String subStr){
        int mineStrLength = mineStr.length();
        int subStrLength = subStr.length();
        int count=0;
        int index=0;
        if(mineStrLength>=subStrLength){

            while((index=mineStr.indexOf(subStr,index))!=-1){
                count++;
                index+=subStrLength;
            }
        }else{
            return 0;
        }
            return count;
    }


    public int getCount1(String mineStr,String subStr){
        int mineStrLength = mineStr.length();
        int subStrLength = subStr.length();
        int count=0;
        int index=0;
        if(mineStrLength>=subStrLength){

            while ((index=mineStr.indexOf(subStr))!=-1){
                count++;
                mineStr=mineStr.substring(index+subStrLength);
            }

        }else{
            return 0;
        }
        return count;
    }
}
