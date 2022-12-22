package ch14;

public class Student implements Comparable<Student> {
	
	String name;
	int ban;
	int totalScore;
	
	public Student() {
		
	}

	public Student(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	//Comparable 인터페이스의 추상 메서드
	@Override
	public int compareTo(Student s) {
		return 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return String.format("[%s,%d,%d]",name,ban,totalScore);
	}

	
}
