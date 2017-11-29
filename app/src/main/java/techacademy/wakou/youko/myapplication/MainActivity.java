package techacademy.wakou.youko.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("若生陽子","しりとり",22);
        human.think();
        human.say();
        Human.introduce();
        Human.human_jp();
    }

}
