class Army {

    public static void createArmy() {
        //create 5 units
        Unit unit1 = new Unit("Charlie");
        Unit unit2 = new Unit("Charli");
        Unit unit3 = new Unit("Charl");
        Unit unit4 = new Unit("Char");
        Unit unit5 = new Unit("Cha");

        //create 3 knights
        Knight knight1 = new Knight("Hephaestus");
        Knight knight2 = new Knight("Hephaestu");
        Knight knight3 = new Knight("Hephaest");

        //create 1 General
        General general1 = new General("Jack");

        //create 1 Doctor
        Doctor doctor1 = new Doctor("Jan");
    }
    
    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}