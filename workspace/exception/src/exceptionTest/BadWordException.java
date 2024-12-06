package exceptionTest;

// Exception 상속: 컴파일러가 체크(컴파일 오류), 강제종료 하기 싫다!
// RuntimeException 상속: 컴파일러가 체크하지 않음(빌드 오류 또는 런타임 오류), 강제 종료 해야한다!
public class BadWordException extends Exception{

}
