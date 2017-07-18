package demo.fitnanoattendancesystem;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vaidheeswaran on 30-06-2017.
 */
public class student_attendance extends Fragment{
    View myView;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        myView =inflater.inflate(R.layout.student_attendance,container,false);
                return myView;
    }
}
