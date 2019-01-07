void reverse(char *str) {
	
	char *end = str;
	char temp;
	
	if (str) { // when str==null. end-- is not safe
			while (*end) {
			++end;
		}
		
		end--; // cut null
		while (str < end) {
			temp = *str;
			*str++ = *end;
			*end-- = temp;		
		}
	}
	
}