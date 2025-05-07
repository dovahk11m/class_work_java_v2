package _colloections;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 5.7
 * 컬렉션프레임워크2
 * Set 계열
 */
public class UniqueUserIDSystem {

    /*
    요구사항
    사용자가 키보드로 입력한 ID 데이터를 다량 저장해야 한다.
    해당 데이터는 고유데이터
    해당 데이터는 메모리상에서 관리한다.
     */

    //member
    private HashSet<String> resiteredIDs;

    //constructor
    public UniqueUserIDSystem() {
        resiteredIDs = new HashSet<>();

        /*
        전체출력 테스트를 위한 샘플데이터 - 추후삭제
         */
        resiteredIDs.add("홍길동");
        resiteredIDs.add("임꺽정");
        resiteredIDs.add("장길산");
    }

    //사용자 ID등록
    public boolean addUserID(String userID) {
        return resiteredIDs.add(userID);
    /*
    저장되면 true 호출
    중복값이면 false 호출
     */
    }//

    /*
    사용자 ID 출력하는 메서드 만들어본다.
    리턴값은 필요없으므로 void
    매개변수 필요한가? No
     */

    public void showAll() {
        /*
        resiteredIDs를 순회해서 콘솔창에 출력하는 기능 필요
        for 구문이나 iterator 활용 가능
         */

        //hashSet 안에 요소가 없다면
        if (resiteredIDs.isEmpty()) {
            System.out.println("🤷‍♂️등록된 ID가 없음");
            return;
            //실행의 제어권 반납해 뒤 코드들이 의미없이 실행되는 것 방지
        }

        for (String id : resiteredIDs) {
            System.out.println("id: " + id);
        }
        System.out.println("총id수: " + resiteredIDs.size());

    }

    //시스템 실행
    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("사용하고 싶은 ID를 입력하세요. " +
                    "종료하라면 'exit' 입력");

            String input = scanner.nextLine().trim(); // trim() 공백제거

            /*
            빈 입력 처리
            사용자가 키보드에서 값을 넣지 않고 엔터를 치는 경우
            방어코드를 짜본다.
             */
            if (input.isEmpty()) {
                System.out.println("ID를 입력해주세요.");
                continue;
            }

            if ("exit".equals(input)) {
                System.out.println("😎시스템 종료");
                break;
            }

            if ("show".equals(input)) {
                showAll();
            }

            boolean isRestered = addUserID(input);

            if (isRestered) {
                System.out.println("👍새로운 ID 등록");
            } else {
                System.out.println("💀이미 등록된 ID 입니다.");
            }

        }//while
        scanner.close();

    }//start

    //main
    public static void main(String[] args) {

        UniqueUserIDSystem idSystem = new UniqueUserIDSystem();

        idSystem.start();

    }//end of main
}//end of class
