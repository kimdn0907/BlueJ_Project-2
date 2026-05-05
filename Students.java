
/**
 * 객체의 이름과 n단을 출력해달라고 요청하면 호출된 이름을 가진 객체가 n단을 출력해주는 
 * 프로그램
 * 
 * (단, n은 1~9 사이)
 *
 * @author (2025320031 김단이, 2025320016 정한비, 2025320020 송영재)
 * @version (2026.05.05)
 */
public class Students
{
    private String name;
    private String studentId;

    /**
     * TimesTables 클래스의 객체 생성자
     */
    public Students(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String getName() {
        return name;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String getTimesTables(int TimesTables) {
        String result = name + ":";
        for (int i = 1; i<=9; i++) {
            result = result + TimesTables + "x" + i + "=" + (TimesTables * i) + " ";
        }
        return result;
    }
}