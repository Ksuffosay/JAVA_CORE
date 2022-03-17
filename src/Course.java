public class Course {

    Let[] lets;

    public Course(Let[] lets) {
        this.lets = lets;
    }

    public void doIt(Team team){
        for (int i=0; i<team.members.length; i++){
            Members members = team.members[i];
            members.result = true;


            for (int s=0; s<lets.length;s++){
                Let let = lets[s];
                if (let.standard > members.norma)
                    members.result = false;
            }
        }

    }
}
