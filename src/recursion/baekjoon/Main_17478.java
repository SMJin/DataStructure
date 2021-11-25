package recursion.baekjoon;

import java.util.Scanner;

public class Main_17478 {

    public static String startStr(int n, String add) {
        System.out.print(strPackage(add));
        if(n==1) {
            add = "____" + add;
            System.out.println(add + whatIsRecursion());
            System.out.println(add + recursionIs());
            return add;
        }
        return startStr(n-1, "____" + add);
    }

    public static String endStr(int n, String add, String str) {
        System.out.println(add + str);
        if (n==0) {
            return "";
        }
        return endStr(n-1, add.substring(4, add.length()), str);
    }

    public static String strPackage(String str) {
        return str + whatIsRecursion() + "\n" +
                str + listenCarefully() + "\n" +
                str + villagePeopleSays() + "\n" +
                str + heIsRight();
    }

    public static String whatIsRecursion() {
        return "\"재귀함수가 뭔가요?\"";
    }

    public static String listenCarefully() {
        return "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    }

    public static String villagePeopleSays() {
        return "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    }

    public static String heIsRight() {
        return "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
    }

    public static String recursionIs() {
        return "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    }

    public static String saidLikeThat() {
        return "라고 답변하였지.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        endStr(n, startStr(n, ""), saidLikeThat());
    }
}
