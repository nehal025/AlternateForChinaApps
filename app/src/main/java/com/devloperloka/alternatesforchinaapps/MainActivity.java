package com.devloperloka.alternatesforchinaapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Model> AllApps= new ArrayList<>();
    ArrayList<ChinaApps> chinaApps= new ArrayList<>();
    ArrayList<ChinaApps> DisplayChinaApps= new ArrayList<>();
    private static final String TAG = "MyActivity";
    int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.mRecyclerView);

        //Toast.makeText(getApplicationContext(), "Hello ", Toast.LENGTH_SHORT).show();

        findViewById(R.id.SyncNow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<PackageInfo> packageList=getPackageManager().getInstalledPackages(0);

                for(int i=0;i<packageList.size();i++)
                {
                    PackageInfo packageInfo=packageList.get(i);
                    if((packageInfo.applicationInfo.flags &ApplicationInfo.FLAG_SYSTEM)==0) {

                        String AppName=packageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
                        String AppPackageName=packageInfo.applicationInfo.packageName;
                        Drawable AppIcon=packageInfo.applicationInfo.loadIcon(getPackageManager());
                        Model model=new Model();
                        model.setImg1(AppIcon);
                        model.setTitle1(AppName);
                        model.setImg2(R.mipmap.ic_launcher);
                        model.setTitle2("appname");
                        model.setPackageName(AppPackageName);
                        AllApps.add(counter,model);
                        counter++;

                    }
                }

                for (int i=0;i<AllApps.size();i++)
                {

                    for (int j=0;j<chinaApps.size();j++)
                    {
                        if(AllApps.get(i).getPackageName().equals(chinaApps.get(j).getAppPackageName()))
                        {
                            DisplayChinaApps.add(chinaApps.get(j));
                        }

                    }

                }

                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                adapter = new Adapter(MainActivity.this, DisplayChinaApps);
                recyclerView.setAdapter(adapter);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        ChinaApps addChinaApp0=new ChinaApps();
        addChinaApp0.setAppName("Club Factory");
        addChinaApp0.setAppLogo("https://lh3.googleusercontent.com/ktwTe8JTsoJ7K6Is7Xz7nFdTBAUGTGrKbE1y6OtOIbGFmZrrhHDSNt_sGgpuscTJcYY=s180-rw");
        addChinaApp0.setAppPackageName("club.fromfactory");
        addChinaApp0.setAppLink("https://play.google.com/store/apps/details?id=club.fromfactory&hl=en");
        addChinaApp0.setAlternateAppName("Tata CLiQ Online Shopping");
        addChinaApp0.setAlternateAppLogo("https://lh3.googleusercontent.com/YYMB0q3VZuH1cegb-s636R6p4cIPivJ-4BMn04ogVWfw1l0JrJSFYZ2xvcjsPEWY5ro=s180-rw");
        addChinaApp0.setAlternateAppPackageName("Tata CLiQ Online Shopping ");
        addChinaApp0.setAlternateAppLink("https://play.google.com/store/apps/details?id=com.tul.tatacliq&hl=en");
        chinaApps.add(0,addChinaApp0);


        ChinaApps addChinaApp1=new ChinaApps();
        addChinaApp1.setAppName("Shareit");
        addChinaApp1.setAppLogo("https://lh3.googleusercontent.com/Y2JgQl8YF4TTb-JsZ8-9n5GniA0w2W29Dgpm9LJDnjRic3O2P8KAquW9LdfFoxbsU-DN=s180-rw");
        addChinaApp1.setAppPackageName("com.lenovo.anyshare.gps");
        addChinaApp1.setAppLink("https://play.google.com/store/apps/details?id=club.fromfactory&hl=en");
        addChinaApp1.setAlternateAppName("Files by Google");
        addChinaApp1.setAlternateAppLogo("https://lh3.googleusercontent.com/1nfAdJs2Ep2q1skM7QwJ1uHooWSbpFkbIBHhAX6EmdzEKmtk42713TiTU28mWlkcFKPA=s180-rw");
        addChinaApp1.setAlternateAppPackageName("Tata CLiQ Online Shopping");
        addChinaApp1.setAlternateAppLink("https://play.google.com/store/apps/details?id=com.tul.tatacliq&hl=en");
        chinaApps.add(1,addChinaApp1);

    }


}
