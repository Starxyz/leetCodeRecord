public boolean isUniqueChat2(String str) {
	
	if (str.length() > 256) return false;
	
	boolean[] res = new boolean[256];
	for (int i = 0; i < str.length(); i++) {
		int val = str.charAt(i);// bucket
		if (res[0]) return false;
		res[val] = true;
	}
	
	return true;
}