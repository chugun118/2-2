package study;

/**
 * Main.java
 *
 * 本課題では、mainメソッド・インスタンス・メソッドの呼び出しの使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   Study.java: 問①
 *   Main.java: 問①から問②
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

    public static void main(String[] args) {

        String userName="hoge";
        int id =123;
        String password="abc123";
// ① 以下のルールに従いAccountクラスのインスタンスを生成してください。
        // 変数名:「account」
Account account = new Account(userName, id, password);

        // ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
account. userName();
account.id();
account.password();
    }
}