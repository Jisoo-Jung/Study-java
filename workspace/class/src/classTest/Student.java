package classTest;

public class Student {
//	학생 번호
	int id;
////	국어 점수
//	int kor;
////	수학 점수
//	int math;
////	영어 점수
//	int eng;
	
//	과목
	Subject[] arSubject;
	
//	총점
	int total;
//	평균
	double average;
	
	public Student(int id, Subject[] arSubject) {
		this.id = id;
		this.arSubject = arSubject;
		
		for (int i = 0; i < arSubject.length; i++) {
			this.total += arSubject[i].score;
		}
		
		this.average = (double)this.total / arSubject.length;
		
	}

//	public Student(int id, int kor, int math, int eng) {
//		this.id = id;
//		this.kor = kor;
//		this.math = math;
//		this.eng = eng;
//		this.total = kor + math + eng;
//		this.average = total / 3.0;
//	}

}













