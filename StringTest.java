package Exercise3;

public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        StringBuffer s1 = stringTest.reverse1("abcdef", 2, 4);
        System.out.println(s1);
    }

    public String reverse(String str,int start,int end){//字符串的逆置
        if(str==null){
            return null;
        }
        char[] arr=str.toCharArray();//转换为字符数组
        for(int x=start, y=end;x<y;x++,y--){
            char temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
        return new String(arr);
    }

    public StringBuffer reverse1(String str, int start, int end){
        if(str==null){
            return null;
        }
        StringBuffer build = new StringBuffer(str.length());//创建一个新的变量 长度与str长度一致
        build.append(str.substring(0,start));//第一部分
        for(int i=end;i>=start;i--){//第二部分
            build.append(str.charAt(i));
        }
        build.append(str.substring(end+1));//第三部分
        return build;

    }
}

