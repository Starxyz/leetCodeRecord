char* reverseString(char* s) {
    
    char* end = s;
    char* p = s;// return value;
    char temp;
    
    if (s) {
        while (*end) {
            end++;
        }        
        --end;// cut 'null'
        while (s < end) {
            temp = *s;
            *s++ = *end;
            *end-- = temp;
        }
    }
    
    return p;
}