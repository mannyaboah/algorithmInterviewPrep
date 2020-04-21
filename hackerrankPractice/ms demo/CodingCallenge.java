import java.util.ArrayList;
import java.util.List;

// Coding with Swamy :)
/**
 * Create an employee matching function
 * 
 */

 class CodingChallenge {

    public static void main(String[] args) {
        
    }

    class OrgNode {

    }

    class MyEmployee{
        
        int uid;
        String Firstname;
        String lastname;
        String manager;
        String team;

        List<MyEmployee> directReports = new ArrayList<MyEmployee>();

    }

    //Should have done DFS or BFS

    public static boolean isAmatch(MyEmployee first, MyEmployee second, MyEmployee headBoss){
        
        for(MyEmployee e : headBoss.directReports){

        }

        return headBoss.directReports.contains(first) && headBoss.directReports.contains(second);
    }
 }