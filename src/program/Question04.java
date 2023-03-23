package program;

public class Question04 {
	private String word;
	
	public Question04() {
	}

	public Question04(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	public String reverse(String word){
	    char[] in = word.toCharArray();
	    int begin = 0;
	    int end = in.length - 1;
	    char temp;
	    while(end > begin){
	        temp = in[begin];
	        in[begin] = in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
}