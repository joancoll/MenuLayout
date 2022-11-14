package cat.dam.andy.menulayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn_lyt1 = findViewById(R.id.btn_lyt1);
        final Button btn_lyt2 = findViewById(R.id.btn_lyt2);
        final Button btn_lyt3 = findViewById(R.id.btn_lyt3);
        final FrameLayout fl_content = findViewById(R.id.fl_content);
        //Per defecte mostra el primer layout
        View child = getLayoutInflater().inflate(R.layout.layout, null);
        fl_content.addView(child);
        //en cas de que es premi algun dels botons mostrarà el layout corresponent
        btn_lyt1.setOnClickListener(v -> {
            System.out.println("Button 1 Clicked");
            fl_content.removeAllViews();
            View child1 = getLayoutInflater().inflate(R.layout.layout, null);
            fl_content.addView(child1);
        });
        btn_lyt2.setOnClickListener(v -> {
            System.out.println("Button 2 Clicked");
            fl_content.removeAllViews();
            View child2 = getLayoutInflater().inflate(R.layout.layout2, null);
            fl_content.addView(child2);
        });
        btn_lyt3.setOnClickListener(v -> {
            System.out.println("Button 3 Clicked");
            fl_content.removeAllViews();
            View child3 = getLayoutInflater().inflate(R.layout.layout3, null);
            fl_content.addView(child3);
        });
    }
}