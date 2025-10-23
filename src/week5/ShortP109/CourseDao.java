package week5.ShortP109;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public List<Course> getCourseList(){
        List<Course> list = new ArrayList<>();
        String sql = "SELECT * FROM Course";
        try{
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet set = pstm.executeQuery();
            while(set.next()){
                Course course = new Course();
                course.setCourseID(set.getString("Course ID"));
                course.setCourseName(set.getString("Course Name"));
                course.setCredits(set.getInt("Credits"));
                course.setType(set.getString("Type Course"));

                list.add(course);
            }
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return list;
    }

    public List<CourseOnline> getCourseOnlineList(){
        List<CourseOnline> list = new ArrayList<>();
        String sql = "SELECT * FROM Course AS T1 INNER JOIN [Course Online] AS T2 ON T1.[Course ID] = T2.[Course ID]";
        try{
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet set = pstm.executeQuery();
            while(set.next()){
                CourseOnline course = new CourseOnline();
                course.setCourseID(set.getString("Course ID"));
                course.setCourseName(set.getString("Course Name"));
                course.setCredits(set.getInt("Credit"));
                course.setType(set.getString("Type Course"));
                course.setPlatforms(set.getString("Platforms"));
                course.setInstructors(set.getString("Instructors"));
                course.setNote(set.getString("Note"));
                list.add(course);
            }
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return list;

    }

    public List<CourseOffline> getCourseOfflineList(){
        List<CourseOffline> list = new ArrayList<>();
        String sql = "SELECT * FROM Course AS T1 INNER JOIN [Course Offline] AS T2 ON T1.[Course ID] = T2.[Course ID]";
        try{
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet set = pstm.executeQuery();
            while(set.next()){
                CourseOffline course = new CourseOffline();
                course.setCourseID(set.getString("Course ID"));
                course.setCourseName(set.getString("Course Name"));
                course.setCredits(set.getInt("Credit"));
                course.setType(set.getString("Type Course"));
                course.setBegin(set.getDate("Begin").toLocalDate());
                course.setEnd(set.getDate("End").toLocalDate());
                course.setCampus(set.getString("Campus"));
                list.add(course);
            }
        }catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return list;

    }

    public static void main(String[] args) throws SQLException {
        Connection con = DBConnect.getConnection();
        PreparedStatement pstm = con.prepareStatement("SELECT * FROM Course");
        ResultSet res = pstm.executeQuery();
        while(res.next()){
            System.out.println(res.getString(1) + " - " +res.getString(2));
        }
    }

}
