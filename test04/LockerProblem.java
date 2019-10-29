package homework.test04;

//7.23 储物柜难题
public class LockerProblem {
    public static void main(String[] args) {
    	//定义长度为100的布尔类型数组，值为false
        boolean[] box = new boolean[100];
        for(int i =0;i<100;i++){
            box[i]=false;
        }
        for(int m = 1;m <= 100;m++){
            for(int n = m;n <= 100;n += m){   
                box[n-1] = !box[n-1];
            }
        }
        for(int t = 0;t < 100;t++){
    	    if(box[t]) {
    	    	System.out.print(t+1+" ");
    	    }
        }
    }
}
