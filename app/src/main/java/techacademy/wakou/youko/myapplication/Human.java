package techacademy.wakou.youko.myapplication;
import android.util.Log;

/**
 * Created by appu2 on 2017/11/28.
 * This Line
 */
class Human extends Animal implements Thinkable {
    //    private static String to_jp = "ヒューマン";
    private String hobby;

    Human(String name,String hobby,int age){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    static void human_jp() {
        Log.d("javatest","これは"+"ヒューマン"+"のクラス変数です");
    }

    static void introduce() {
        Log.d("javatest", "これはヒューマンクラスです");
    }
    @Override
    public void say() {
        Log.d("javatest", "私は" + this.name + "です。年齢は" + this.age + "歳です");
    }


    public void think() {
        Log.d("javatest","私は"+this.hobby+"について考える");
    }

}