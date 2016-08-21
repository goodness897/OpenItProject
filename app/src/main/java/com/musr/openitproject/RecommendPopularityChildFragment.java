package com.musr.openitproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecommendPopularityChildFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener{


    Button btnWeek;
    Button btnMonth;
    Button btnAll;
    public RecommendPopularityChildFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recommend_popularity_child, container, false);

        btnWeek = (Button)view.findViewById(R.id.btn_week);
        btnWeek.setOnClickListener(this);
        btnWeek.setSelected(true);

        btnMonth = (Button)view.findViewById(R.id.btn_month);
        btnMonth.setOnClickListener(this);

        btnAll = (Button)view.findViewById(R.id.btn_all);
        btnAll.setOnClickListener(this);

        init(btnWeek);
        return view;
    }

    private void init(Button btnWeek) {
        Fragment fragment = null;
        Class fragmentClass;
        if(btnWeek.isSelected()) {
            fragmentClass = RecommendPopulariryChildWeekFragment.class;
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
            case R.id.btn_week:
                fragmentClass = RecommendPopulariryChildWeekFragment.class;
                btnWeek.setSelected(true);
                btnMonth.setSelected(false);
                btnAll.setSelected(false);
                break;
            case R.id.btn_month:
                fragmentClass = RecommendPopulariryChildWeekFragment.class;
                btnMonth.setSelected(true);
                btnWeek.setSelected(false);
                btnAll.setSelected(false);
                break;
            case R.id.btn_all:
                fragmentClass = RecommendPopulariryChildWeekFragment.class;
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

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
