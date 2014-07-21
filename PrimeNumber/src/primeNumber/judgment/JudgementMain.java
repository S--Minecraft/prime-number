package primeNumber.judgment;

public class JudgementMain
{
	//2で割り切れるかどうか
	public static boolean JudgeTwo(int number)
	{
		if(number>10)
		{
			int[] numbers= RankExtract.rankExtract(number);

			int one = numbers[numbers.length-1];

			if(one%2 == 0)
			{
				return true;
			}
			return false;
		}else{
			if(number%2 == 0)
			{
				return true;
			}
			return false;
		}
	}

	//3で割り切れるかどうか
	public static boolean JudgeThree(int number)
	{
		if(number>99)
		{
			int[] numbers= RankExtract.rankExtract(number);
			int added = 0;

			for(int i = 0;i<numbers.length;i++)
			{
				added += numbers[i];
			}

			if(added%3 == 0)
			{
				return true;
			}
			return false;
		}else{
			if(number%3 == 0)
			{
				return true;
			}
			return false;
		}
	}

	//5で割り切れるかどうか
	public static boolean JudgeFive(int number)
	{
		if(number>10)
		{
			int[] numbers= RankExtract.rankExtract(number);

			int one = numbers[numbers.length-1];

			if(one%5 == 0)
			{
				return true;
			}
			return false;
		}else{
			if(number%5 == 0)
			{
				return true;
			}
			return false;
		}
	}

	//7で割り切れるかどうか
	public static boolean JudgeSeven(int number)
	{
		if(number>98)
		{
			int[] numbers= RankExtract.rankExtract(number);
			int one = numbers[numbers.length-1];

			number = (number - one) / 10;

			int judge = number - one*2;

			if(judge%7 == 0)
			{
				return true;
			}
			return false;
		}else{
			if(number%7 == 0)
			{
				return true;
			}
			return false;
		}
	}
}
