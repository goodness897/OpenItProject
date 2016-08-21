package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class RankingDistanceFragment extends Fragment implements View.OnClickListener{

    Button btnDay;
    Button btnWeek;
    Button btnMonth;
    Button btnAll;


    public RankingDistanceFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ranking_distance, container, false);
        initButton(view);
        return view;
    }

    private void initButton(View view) {
        btnDay = (Button) view.findViewById(R.id.btn_day);
        btnWeek = (Button) view.findViewById(R.id.btn_week);
        btnMonth = (Button) view.findViewById(R.id.btn_month);
        btnAll = (Button) view.findViewById(R.id.btn_all);

        btnDay.setOnClickListener(this);
        btnWeek.setOnClickListener(this);
        btnMonth.setOnClickListener(this);
        btnAll.setOnClickListener(this);

        btnDay.setSelected(true);
        init(btnDay);
    }

    private void init(Button btnDay) {
        Fragment fragment = null;
        Class fragmentClass;
        if(btnDay.isSelected()) {
            fragmentClass = RankingDistanceDayFragment.class;
            btnWeek.setSelected(false);
            btnMonth.setSelected(false);
            btnAll.setSelected(false);
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (java.lang.InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        getChildFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    public void onClick(View view) {

        Fragment fragment = null;
        Class fragmentClass;
        int id = view.getId();
        switch(id) {
            case R.id.btn_day:
                fragmentClass = RankingDistanceDayFragment.class;
                btnDay.setSelected(true);
                btnWeek.setSelected(false);
                btnMonth.setSelected(false);
                btnAll.setSelected(false);
                break;
            case R.id.btn_week:
                fragmentClass = RankingDistanceDayFragment.class;
                btnDay.setSelected(false);
                btnWeek.setSelected(true);
                btnMonth.setSelected(false);
                btnAll.setSelected(false);
                break;
            case R.id.btn_month:
                fragmentClass = RankingDistanceDayFragment.class;
                btnDay.setSelected(false);
                btnMonth.setSelected(true);
                btnWeek.setSelected(false);
                btnAll.setSelected(false);
                break;
            case R.id.btn_all:
                fragmentClass = RankingDistanceDayFragment.class;
                btnDay.setSelected(false);
                btnAll.setSelected(true);
                btnWeek.setSelected(false);
                btnMonth.setSelected(false);
                break;
            default:
                fragmentClass = RecommendPopulariryChildWeekFragment.class;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        getChildFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

    }
}
