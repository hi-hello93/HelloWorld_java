package com.sd.game;

import java.util.Scanner;

public class Exam {
	public static void main(String args[]){
		while (true) {
		int score[] = new int[2];
		Scanner scanner = new Scanner(System.in);
		
		SDgame player1 =new SDgame();
		SDgame player2 = new SDgame();
		
		System.out.println("1 �÷��̾� �̸��� �Է��ϼ���.");
		player1.name = scanner.nextLine();
		System.out.println("2 �÷��̾� �̸��� �Է��ϼ���.");
		player2.name = scanner.nextLine();
		
		System.out.print(player1.name + "�� ���ڸ� �Է��ϼ���.");
		int select;
		player1.input();
		while (true) {
			player1.select = scanner.nextInt();
		if (player1.select < 1 || player1.select > 10) {
			System.out.print("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �ٽ� �Է��ϼ��� ! \n");
			continue;
		}else break;
		}
		System.out.print(player2.name + "�� ���ڸ� �Է��ϼ���.");
		player2.input();
		while (true) {
			player2.select = scanner.nextInt();
		if (player2.select < 1 || player2.select > 10) {
			System.out.print("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �ٽ� �Է��ϼ��� ! \n");
			continue;
		}else break;
		}
		System.out.print(player1.name + "�� ù ��° �� ���� = " + player1.select + "     ");
		System.out.println(player1.name + "�� ���� �� ����= " + player1.random);
		
		System.out.print(player2.name + "�� ù ��° �� ���� = " + player2.select + "     ");
		System.out.println(player2.name + "�� ���� �� ����= " + player2.random);
		
		
		
		player1.solution();
		if (player1.res >= 21){
		System.out.println("38����!!!!!");
		}
		else if(player1.res >10){
		System.out.println(player1.random + "��");
		}
		else{
		System.out.println(player1.res + "��");
		}
		player2.solution();	
		if (player2.res >= 21){
			System.out.println("38����!!!!!");
			}
			else if(player2.res >10){
			System.out.println(player2.random + "��");
			}
			else{
			System.out.println(player2.res + "��");
			}
		
		player1.compare(player2);
		player2.compare(player1);
		 
		 if (player1.score > player2.score)
				System.out.println("************" +player1.name+"�� �����մϴ�. �¸� �ϼ̽��ϴ� ************");
			else if (player1.score <player2.score)
				System.out.println("************" +player2.name+"�� �����մϴ�. �¸� �ϼ̽��ϴ� ************");
			else if (player1.score == player2.score)
				System.out.println("************ �ƽ��׿�. ���º��Դϴ�. ************");
		 
         System.out.println("����Ͻðڽ��ϱ�? (y/n)");
         scanner.nextLine();
         
         if (scanner.nextLine().equals("n")) {
        	 System.out.println("������ ���� �Ǿ����ϴ�.");
        	 break;}        
        }

   }

}