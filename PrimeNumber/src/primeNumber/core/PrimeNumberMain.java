package primeNumber.core;

import primeNumber.judgment.JudgementMain;

public class PrimeNumberMain
{
	public static int[] prime = new int [26];//97までで26個;

	public static void main(String[] args) /*throws IOException*/
	{
		/*
		String inputNumber = "";

		BufferedReader reader;
        reader  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("素数かどうか判定する文字を入力してください。");
        inputNumber = reader.readLine();

        System.out.println("入力された数は " + kekka + " です");
        */

		//100までの素数を代入
		Until100.insertUntil100();

		//詮索

		//結果を表示
		/*
		for(int i=0; i<prime.length; i++)
		{
			System.out.println(prime[i]);
		}
		*/

		int number = 219603517;

		System.out.println("2 : " + JudgementMain.JudgeTwo(number));
		System.out.println("3 : " + JudgementMain.JudgeThree(number));
		System.out.println("5 : " + JudgementMain.JudgeFive(number));
		System.out.println("7 : " + JudgementMain.JudgeSeven(number));
		//System.out.println("2 : " + JudgementMain.JudgeEleven(number));

		/*
		for(int i = 0; i<prime.length; i++)
		{
			if(number%prime[i] == 0)
			{
				System.out.println(prime[i] + " : " + true);
			}else{
				System.out.println(prime[i] + " : " + false);
			}
		}
		*/

		//int[] numbers= RankExtract.rankExtract(number);
		//int one = numbers[numbers.length-1];
		//System.out.println(one);
	}
}
