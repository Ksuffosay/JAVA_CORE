public class Team {

    String nameTeam;
    Members[] members;

    public Team(String nameTeam, Members members1, Members members2, Members members3, Members members4) {
        this.nameTeam = nameTeam;
        this.members = new Members[]{members1, members2, members3, members4};
    }

    public void showResults() {

        for (int i = 0; i < members.length; i++)

            System.out.println("Результаты  участников:" + " " + members[i].name + "-" + members[i].result);
    }

    public void showMembers() {

        for (int i = 0; i < members.length; i++)

            System.out.println("Список участников:" + " " + members[i].name);


    }
}

