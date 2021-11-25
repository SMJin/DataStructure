package recursion.baekjoon;

import java.util.Scanner;

public class Main_17478 {

    public static void recursiveStr(int n, String add) {
        whatIsRecursion(add);
        if(n==0) {
            recursionIs(add);
            saidLikeThat(add);
            return;
        }
        listenCarefully(add);
        villagePeopleSays(add);
        heIsRight(add);
        recursiveStr(n-1, "____" + add);
        saidLikeThat(add);
    }

    public static void whatIsRecursion(String str) {
        System.out.println(str + "\"재귀함수가 뭔가요?\"");
    }

    public static void listenCarefully(String str) {
        System.out.println(str + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
    }

    public static void villagePeopleSays(String str) {
        System.out.println(str + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
    }

    public static void heIsRight(String str) {
        System.out.println(str + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
    }

    public static void recursionIs(String str) {
        System.out.println(str + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
    }

    public static void saidLikeThat(String str) {
        System.out.println(str + "라고 답변하였지.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursiveStr(n, "");
    }
}
