package com.example.rita_pc.demonavigation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.TwoDArrayOperations)
        {
            TwoDArrayOperation fragment = new TwoDArrayOperation();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();
           // return true;

        }
        else if (id == R.id.AreaOfCircle)
        {
            AreaOfCircle fragment = new AreaOfCircle();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();
        }
        else if (id == R.id.ArithmaticOperations)
        {
            ArithmaticOperations fragment= new ArithmaticOperations();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.ArmStrongNo)
        {
            ArmStrongNo fragment= new ArmStrongNo();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();


        }
        else if (id == R.id.ArrayOperations)
        {
            ArrayOperations fragment= new ArrayOperations();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.ArrayTraversing)
        {
            ArrayTraversing fragment= new ArrayTraversing();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.CheckCharacter)
        {
            CheckCharacter fragment= new CheckCharacter();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.CheckEvenOrOdd)
        {
            CheckEvenOrOdd fragment= new CheckEvenOrOdd();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.CompoundInterest)
        {
            CompoundInterest fragment= new CompoundInterest();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.DisplayNotes)
        {
            DisplayNotes fragment= new DisplayNotes();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.FahrenheitToCelcius)
        {
            FahrenheitToCelcius fragment= new FahrenheitToCelcius();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.FirstLastArrayElementSwap)
        {
            FirstLastArrayElementSwap fragment= new FirstLastArrayElementSwap();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();
        }
        else if (id == R.id.GenerateRandomNo)
        {
            GenerateRandomNo fragment= new GenerateRandomNo();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();
        }
        else if (id == R.id.GradeOfSteel)
        {
            GradeOfSteel fragment= new GradeOfSteel();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.GradeOfStudent)
        {
            GradeOfStudent fragment= new GradeOfStudent();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.GrossSalaryCalculation)
        {
            GrossSalaryCalculation fragment= new GrossSalaryCalculation();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.InsuranceCompany)
        {
            InsuranceCompany fragment= new InsuranceCompany();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.InsureDriver)
        {
            InsureDriver fragment= new InsureDriver();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.LengthConversion)
        {
            LengthConversion fragment= new LengthConversion();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.MonthlyTelephoneBill)
        {
            MonthlyTelephoneBill fragment= new MonthlyTelephoneBill();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.MyCalculator)
        {
            Calculator fragment= new Calculator();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.SimpleInterest)
        {
            SimpleInterest fragment= new SimpleInterest();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.StringCompareDemo)
        {
            StringCompareDemo fragment= new StringCompareDemo();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.TicTacToe)
        {
            TicTacToe fragment= new TicTacToe();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }
        else if (id == R.id.MachineTest2)
        {
            MachineTest2 fragment= new MachineTest2();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.MachineTest3)
        {

           MachineTest3 fragment= new MachineTest3();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }

        else if (id == R.id.InsertRecordsInDB)
        {

            InsertInDB fragment= new InsertInDB();
            android.support.v4.app.FragmentTransaction fragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame,fragment);
            fragmentTransaction.commit();

        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
