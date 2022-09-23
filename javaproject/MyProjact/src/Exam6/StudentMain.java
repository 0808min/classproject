package Exam6;

public class StudentMain {

	public static void main(String[] args) {
		

		Student[] s = new Student[10];
		String[] name = {"A","B","C","D","E","F","G","H","I","J"};
		
		for(int i = 0; i < s.length; i++)
		{
			Student t = new Student(name[i],(int)(Math.random() * 61) + 40,
				                        	(int)(Math.random() * 61) + 40,
					                        (int)(Math.random() * 61) + 40);

			
			s[i] = t;
		}
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("성적표");
		System.out.println("----------------------------------------------------");
		System.out.println("이름 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println("----------------------------------------------------");
		for(Student u : s)
			{
				korTotal += u.getKorScore();
				engTotal += u.getEngScore();
				mathTotal += u.getMatScore();
				System.out.println(u.toString());
				
			}
		System.out.println("-----------------------------------------------------");
		
		System.out.printf("과목 총점:\t" + korTotal + "\t"+ 
		                                 engTotal + "\t"+ 
				                         mathTotal + " \n");
		
		System.out.printf("과목 평균:\t%.2f\t%.2f\t%.2f\n",korTotal / 10f, 
				                                         engTotal / 10f, 
				                                         mathTotal / 10f);
		
		System.out.printf("전체 평균:\t" + (float)(korTotal + 
				                                 engTotal + 
				                                 mathTotal) / 30 + "\n");
	}

}