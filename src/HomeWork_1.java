public class HomeWork_1 {

        public static void main(String[] args) {

                Course c = new Course(new Let[] {
                        new Let("run",200), new Let("jump",200)
                });

                Team team = new Team("Джавики",new Members("Даня",200), new Members("Коля",200),new Members("Матвей",50),new Members("Антон",150));

                System.out.println("Название команды:" + " " + team.nameTeam );

                c.doIt(team);
                team.showResults();




        }

}
