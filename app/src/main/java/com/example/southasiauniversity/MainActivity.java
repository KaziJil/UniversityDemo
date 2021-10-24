package com.example.southasiauniversity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.southasiauniversity.DrawerAcitivity.AdmissionActivity;
import com.example.southasiauniversity.DrawerAcitivity.AnnounceAcitivity;
import com.example.southasiauniversity.DrawerAcitivity.CalenderActivity;
import com.example.southasiauniversity.DrawerAcitivity.ContactActivity;
import com.example.southasiauniversity.DrawerAcitivity.EventActivity;
import com.example.southasiauniversity.DrawerAcitivity.FeddbackActivity;
import com.example.southasiauniversity.DrawerAcitivity.GalleryActivity;
import com.example.southasiauniversity.DrawerAcitivity.HomeActivity;
import com.example.southasiauniversity.DrawerAcitivity.IgacActivity;
import com.example.southasiauniversity.DrawerAcitivity.LibraryActivity;
import com.example.southasiauniversity.DrawerAcitivity.LinkActivity;
import com.example.southasiauniversity.DrawerAcitivity.LoginActivity;
import com.example.southasiauniversity.DrawerAcitivity.MapActivity;
import com.example.southasiauniversity.DrawerAcitivity.NewsActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView viewNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawer_layout);
        viewNavigation=findViewById(R.id.main_navigationView);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.Start,R.string.Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        viewNavigation.setNavigationItemSelectedListener(this);







        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_bottom_navigation,new HomeFragment()).commit();
        navigationView=findViewById(R.id.bottom_navigation_bar);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id= item.getItemId();
                switch (item.getItemId()){
                    case R.id.bnav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_bottom_navigation,new HomeFragment()).commit();
                        return true;
                    case R.id.bnav_search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_bottom_navigation,new SerchFregment()).commit();
                        return true;
                    case R.id.bnav_like:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_bottom_navigation,new LikeFragment()).commit();
                        return true;
                    case R.id.bnav_shop:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_bottom_navigation,new ShopFragment()).commit();
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item));
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                Intent intent=new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_login:
                Intent login=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
                break;
            case R.id.nav_feddback:
                Intent feddback=new Intent(MainActivity.this, FeddbackActivity.class);
                startActivity(feddback);
                break;
            case R.id.nav_iqac:
                Intent igac=new Intent(MainActivity.this, IgacActivity.class);
                startActivity(igac);
                break;
            case R.id.nav_announce:
                Intent announce=new Intent(MainActivity.this, AnnounceAcitivity.class);
                startActivity(announce);
                break;
            case R.id.nav_news:
                Intent news=new Intent(MainActivity.this, NewsActivity.class);
                startActivity(news);
                break;
            case R.id.nav_events:
                Intent events=new Intent(MainActivity.this, EventActivity.class);
                startActivity(events);
                break;
            case R.id.nav_admission:
                Intent admission=new Intent(MainActivity.this, AdmissionActivity.class);
                startActivity(admission);
                break;
            case R.id.nav_calendar:
                Intent calendar=new Intent(MainActivity.this, CalenderActivity.class);
                startActivity(calendar);
                break;
            case R.id.nav_library:
                Intent library=new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(library);
                break;
            case R.id.nav_social:
                Intent social=new Intent(MainActivity.this,SocialActivity.class);
                startActivity(social);
                break;
            case R.id.nav_map:
                Intent map=new Intent(MainActivity.this, MapActivity.class);
                startActivity(map);
                break;
            case R.id.nav_contacts:
                Intent contacts=new Intent(MainActivity.this, ContactActivity.class);
                startActivity(contacts);
                break;
            case R.id.nav_link:
                Intent link=new Intent(MainActivity.this, LinkActivity.class);
                startActivity(link);
                break;
            case R.id.nav_gallery:
                Intent gallery=new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(gallery);
                break;



        }
        return true;
    }
}