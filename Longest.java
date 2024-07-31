class Longest
{
	static int Longest(String str)
	{
	int n = str.length();
	int res = 0, curr_len = 0;
	for (int i = 0; i < n; i++)
	{

		if (str.charAt(i) != ' ')
			curr_len++;

		{
			res = Math.max(res, curr_len);
			curr_len = 0;
		}
	}

	return Math.max(res, curr_len);
	}
