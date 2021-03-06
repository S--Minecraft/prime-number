package primeNumber.judgment;

public class RankExtract
{
	public static int[] rankExtract(int number)
	{
		String numberString = Integer.toString(number);

		int[] numbers = new int [numberString.length()];

		convert(numbers,numberString);

		return numbers;//[0]が一番上の位,[numbers.length]が一番下の位
	}

    private static void convert(int[] ary,String number){
        if ( number.length() < 1 ){
            return;
        }
        ary[number.length() - 1] = Integer.parseInt(number.substring(number.length() - 1));
        number = number.substring(0,number.length() - 1);
        convert(ary,number);
    }
}
