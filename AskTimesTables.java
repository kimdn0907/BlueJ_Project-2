import java.util.Scanner;
/**
 * 학생 클래스를 생성하고 그 클래스에서 만들어진 개체에게
 * 구구단을 물어보면 답하는 프로그램 작성하기
 *
 * @author (2025320031 김단이, 2025320016 정한비, 2025320020 송영재)
 * @version (2026.05.05)
 */
public class AskTimesTables
{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        
        //학생 객체 4개 생성
        Students jenna = new Students("JENNA", "R005");
        Students john = new Students("JOHN", "R010");
        Students maria = new Students("MARIA", "R029");
        Students james = new Students("JAMES", "R009");
        
        //getTimesTable() 메서드를 호출하기 위해 scanner로 입력된 이름을 저장하는 객체 생성
        //jenna는 임의의 초기값으로 설정
        Students studentName = jenna;
        
        //이름 입력(명단에 있는 이름을 입력할 때까지 반복하기)
        while(true){
            System.out.print("누구에게 물어볼까요?(JENNA, JOHN, MARIA, JAMES)>> ");
            String names = scanner.nextLine();
            
            switch(names){
                case "JENNA":
                    studentName = jenna;
                    break;
                case "JOHN":
                    studentName = john;
                    break;
                case "MARIA":
                    studentName = maria;
                    break;
                case "JAMES":
                    studentName = james;
                    break;
                default:
                    System.out.println("명단에 없는 이름입니다! 다시 입력해 주세요.");
                    continue;
            }
            break;
        }
        
        //단 입력(1~9사이의 범위에서 벗어나게 되면 다시 입력하라고 요청)
        int timesTables = 0;
        while(true){
            System.out.print("몇 단을 물어볼까요?(1~9단 사이)>> ");
            timesTables = scanner.nextInt();
            
            if(timesTables >= 1 && timesTables <= 9){
                break;
            }
            else{
                System.out.println("1~9단 사이에서만 질문 할 수 있습니다.");
            }
        }
        
        //이름이 불려진 객체가 구구단 출력
        System.out.println(studentName.getTimesTables(timesTables));
        
        scanner.close();
    }
}