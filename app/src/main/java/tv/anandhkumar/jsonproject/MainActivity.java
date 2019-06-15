package tv.anandhkumar.jsonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        //CONVERTING REGULAR OBJECTS INTO JSON
//        Student student = new Student("Anandh",5,"ak@gmail.com");
//        String json = gson.toJson(student)
//        Log.d("TEST",json);

        //CONVERTING JSON INTO REGULAR OBJECTS
//        String json = "{\"course_count\":5,\"email\":\"ak@gmail.com\",\"name\":\"Anandh\"}";
//        Student student = gson.fromJson(json, Student.class);

        //OBJECTS INSIDE AN OBJECTS-->(OBJ->JSON)
//        Course course = new Course("Android","Developer");
//        Student student = new Student("Ak",5,"Ak@gmail.com",course);
//        String json = gson.toJson(student);
//
//        Log.d("TEST",json);

        //OBJECTS INSIDE AN OBJECTS-->(JSON->OBJ)
//        String json = "{\"course_count\":5,\"email\":\"Ak@gmail.com\",\"course\":{\"description\":\"Developer\",\"name\":\"Android\"},\"name\":\"Ak\"}";
//        Student student = gson.fromJson(json,Student.class);
//
//        Log.d("TEST",student.toString());

        //ARRAY IN AN OBJECTS-->(OBJ->JSON)

        List<Video> video = new ArrayList<>();
        video.add(new Video("Intro", 4));
        video.add(new Video("Exercise files", 8));
        video.add(new Video("Installation", 12));
        video.add(new Video("1st project", 16));

        Course course = new Course("Android","Developer");
        Student student = new Student("Ak",5,"Ak@gmail.com",course,video);
        String json = gson.toJson(student);

        Log.d("TEST",json);

//        //ARRAY IN OBJECTS-->(JSON->OBJ)
//        String json = "{"course_count":5,"email":"Ak@gmail.com","course":{"description":"Developer","name":"Android"},"video":[{"duration":4,"name":"Intro"},{"duration":8,"name":"Exercise files"},{"duration":12,"name":"Installation"},{"duration":16,"name":"1st project"}],"name":"Ak"}";
//        Student student = gson.fromJson(json,Student.class);
//
//        Log.d("TEST",student.toString());
    }
}
