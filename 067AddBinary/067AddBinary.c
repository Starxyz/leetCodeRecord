char* addBinary(char* a, char* b) 
{
	int aLen = strlen(a);
	int bLen = strlen(b);
	int cLen = aLen > bLen ? aLen + 2 : bLen + 2;//add null at the end
	int carryBit = 0;
	char* ans = (char*)malloc(cLen * sizeof(char));
	ans[cLen-1] = '\0';//null-terminate
	/*add from the least significant bit */
	for (int i = cLen - 2; i >= 0; i--)
	{
		carryBit += aLen > 0 ? a[--aLen] - '0' : 0;
		carryBit += bLen > 0 ? b[--bLen] - '0' : 0;
		ans[i] = carryBit % 2 ? '1' : '0';
		carryBit /= 2;
	}

	return ans[0] != '1' ? ans + 1 : ans;
}
