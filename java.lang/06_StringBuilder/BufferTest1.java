class BufferTest1{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("Tumi");
		StringBuffer sb2 = new StringBuffer("Maleka");
		StringBuffer sb3 = new StringBuffer(" ");
		System.out.println(sb.append(sb3).append(sb2));
	}
}