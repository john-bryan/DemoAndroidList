package sg.edu.rp.c346.demoandroidlist;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<AndroidVersion> alAndroidVersions;
    ArrayAdapter<AndroidVersion> aaAndroidVersions;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);
        alAndroidVersions = new ArrayList<>();



        alAndroidVersions.add(new AndroidVersion("Pie", "9.0"));
        alAndroidVersions.add(new AndroidVersion("Oreo", "8.0 - 0.1"));
        alAndroidVersions.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAndroidVersions.add(new AndroidVersion("Marshmallow", "6.0- 6.0.1"));
        alAndroidVersions.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAndroidVersions.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAndroidVersions.add(new AndroidVersion("Jelly Bean", "4.1 = 4.3.1"));

        adapter = new CustomAdapter(this, R.layout.row , alAndroidVersions);
        lvAndroidVersions.setAdapter(adapter);

    }
}
