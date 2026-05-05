
/**
 * 객체의 이름과 n단을 출력해달라고 요청하면
 * 호출된 이름을 가진 객체가 n단을 출력해주는 프로그램
 * (단, n은 1~9 사이)
 *
 * @author (2025320031 김단이, 2025320016 정한비, 2025320020 송영재)
 * @version (2026.05.05)
 */
public class Students
{
    //속성(이름, 학번) 생성
    private String name;
    private String studentId;

    /**
     * Students 클래스의 객체 생성자
     */
    public Students(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    /**
     * 학생 이름을 반환하는 메소드
     *
     * @return 학생 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 입력받은 단의 구구단을 문자열로 반환
     *
     * @param TimesTables 출력한 단(1~9)
     * @return 구구단 결과 문자열
     */
    public String getTimesTables(int TimesTables) {
        String result = name + ":";
        for (int i = 1; i<=9; i++) {
            result = result + TimesTables + "x" + i + "=" + (TimesTables * i) + " ";
        }
        return result;
    }
}