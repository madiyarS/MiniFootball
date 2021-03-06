package People;

public class Player extends Person{
    private int defence;
    private int attack;
    private boolean isForward;
    private boolean isDefender;
    private boolean isGoalkeeper;


    public Player(PlayerBuilder p) {
        super(p.name, p.surname, p.salary);
        this.attack = p.attack;
        this.defence = p.defence;
        this.isForward = p.isForward;
        this.isDefender = p.isDefender;
        this.isGoalkeeper = p.isGoalkeeper;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public String getPostition(){
        if(isGoalkeeper) return "goalkeeper";
        else if(isDefender) return "defender";
        return "forward";
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public boolean isGoalkeeper() {
        return isGoalkeeper;
    }

    public boolean isDefender() {
        return isDefender;
    }

    public boolean isForward() {
        return isForward;
    }

    public String toString(){
        return "Name and Surname: " + this.getName()+" "+this.getSurname()+", Position: "+this.getPostition()+", Salary: "+this.getSalary()+", Defence: "+this.defence+", Attack: "+this.attack;
    }

    public static class PlayerBuilder{
        private String name;
        private String surname;
        private String position;
        private int salary;
        private int defence;
        private int attack;
        private boolean isForward;
        private boolean isDefender;
        private boolean isGoalkeeper;

        public PlayerBuilder(String name, String surname, int salary, int defence, int attack){
            this.name = name;
            this.surname = surname;
            this.salary = salary;
            if(defence > 100) this.defence = 100;
            else if(defence < 1) this.defence = 1;
            else this.defence = defence;
            if(defence > 100) this.attack = 100;
            else if(defence < 1) this.attack = 1;
            else this.attack = defence;
        }
        public PlayerBuilder isForward(boolean a){
            this.isForward = a;
            return this;
        }
        public PlayerBuilder isDefender(boolean a){
            this.isDefender = a;
            return this;
        }
        public PlayerBuilder isGoalkeeper(boolean a){
            this.isGoalkeeper = a;
            return this;
        }

        public Player build(){
            Player player = new Player(this);
            return player;
        }

    }
}
