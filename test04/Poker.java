package homework.test04;

//7.24 �Ż�ȯ�ռ�������
public class Poker {
	public static void main(String[] args) {
		String[] card = {"two","three","four","five","six","seven","eight","nine","ten",
				"Jack","Queen","King","Ace"};
		String[] color = {"Hearts","Spades","Clubs","Diamonds"};
		
		int card_num,cnum,time=0;
		
		int[] flag = {0,0,0,0};
		int num = 0;
		while(num < 4) {
			//�������
			card_num = (int)(Math.random()*13);
			//�����ɫ
			cnum = (int)(Math.random()*4);
			
			//�жϳ��е���֮ǰ��ѡ��
			if(flag[cnum] == 0) {
				flag[cnum] = 1;
				num++;
				System.out.println(card[card_num] + " of " + color[cnum]);
			}
			time++;
		}
		//���ƵĴ���
		System.out.println("Number of picks:" + time);
	}
}
