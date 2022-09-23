package Exam6;

public class Student {

//	국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 
//	점수를 모두 출력하고, 
//	평균 점수를 출력하는 프로그램을 작성해봅시다.

	private String name;
	private int korScore;
	private int engScore;
	private int matScore;

	public Student(String name, int korScore, int engScore, int matScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matScore;

	}

	public String getName() {
		return name;
	}

	public int getKorScore() {
		return korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}

//	

	public void setName(String name) {
		this.name = name;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
//	

	public int total() {
		return korScore + engScore + matScore;
	}

	public float Average() {
		return (float) korScore + engScore + matScore / 3.f;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + 
				      ", korScore=" + korScore  + 
				      ", engScore=" + engScore + 
				      ", matScore=" + matScore + "]";
	}

}
