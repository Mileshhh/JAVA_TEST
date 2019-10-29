package homework.test04;

//7.24 优惠券收集人问题
public class Poker {
	public static void main(String[] args) {
		String[] card = {"two","three","four","five","six","seven","eight","nine","ten",
				"Jack","Queen","King","Ace"};
		String[] color = {"Hearts","Spades","Clubs","Diamonds"};
		
		int card_num,cnum,time=0;
		
		int[] flag = {0,0,0,0};
		int num = 0;
		while(num < 4) {
			//随机数字
			card_num = (int)(Math.random()*13);
			//随机花色
			cnum = (int)(Math.random()*4);
			
			//判断抽中的牌之前被选中
			if(flag[cnum] == 0) {
				flag[cnum] = 1;
				num++;
				System.out.println(card[card_num] + " of " + color[cnum]);
			}
			time++;
		}
		//抽牌的次数
		System.out.println("Number of picks:" + time);
	}
}
